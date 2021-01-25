import java.util.Arrays;

public class Calculator {
    final int HALF_ARRAY_LENGTH;
    final int SIZE;

    public Calculator(int size) {
        this.SIZE = size;
        HALF_ARRAY_LENGTH = size / 2;
    }

    public void calculate() {
        long time = System.currentTimeMillis();
        var arr = new float[SIZE];
        Arrays.fill(arr, 1);
        formula(arr, 0, SIZE);
        System.out.println("calc:  " + (System.currentTimeMillis() - time));
    }

    public void calculateThreaded() {
        long time = System.currentTimeMillis();
        var arr = new float[SIZE];
        Arrays.fill(arr, 1);
        float[] left = new float[HALF_ARRAY_LENGTH];
        float[] right = new float[HALF_ARRAY_LENGTH];

        System.arraycopy(arr, 0, left, 0, HALF_ARRAY_LENGTH);
        System.arraycopy(arr, HALF_ARRAY_LENGTH, right, 0, HALF_ARRAY_LENGTH);

        var t1 = new Thread(() -> formula(left, 0, HALF_ARRAY_LENGTH));
        var t2 = new Thread(() -> formula(right, 0, HALF_ARRAY_LENGTH));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(left, 0, arr, 0, HALF_ARRAY_LENGTH);
        System.arraycopy(right, 0, arr, HALF_ARRAY_LENGTH, HALF_ARRAY_LENGTH);

        System.out.println("calcT: " + (System.currentTimeMillis() - time));
    }

    private void formula(float[] arr, int from , int to) {
        for (int i = from, j = to; i <to; i++, j++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
    }

}
