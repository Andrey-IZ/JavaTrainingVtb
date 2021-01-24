package com.geekbrains.lesson2.participants;

public class Robot implements Participant {
    private final float maxHeight;
    private final int maxRoadLength;
    private final String type;
    private State state = State.PASS;

    public Robot(String type, float maxHeight, int maxRoadLength) {
        this.maxHeight = maxHeight;
        this.maxRoadLength = maxRoadLength;
        this.type = type;
    }

    @Override
    public boolean run(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("длина не может быть отрицательной");
        }
        return maxRoadLength >= length;
    }

    @Override
    public boolean jump(float height) {
        if (height <= 0) {
            throw new IllegalArgumentException("высота не может быть отрицательной");
        }
        return maxHeight >= height;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String getType() {
        return type;
    }
}
