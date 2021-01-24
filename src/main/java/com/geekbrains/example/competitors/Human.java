package com.geekbrains.example.competitors;

public class Human implements Competitor{
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance < 0) {
            System.out.println(this + "не умеет бегать задом");
            return false;
        } else  if (distance >= maxRunDistance){
            System.out.println("Дистанция" + distance + "не по плечу" + this);
            return false;
        } else {
            System.out.println(this + "успешно справляется с дистанцией в " + distance + "метров");
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < 0) {
            System.out.println(this + "не умеет прыгать задом");
            return false;
        } else  if (height >= maxJumpHeight){
            System.out.println("высота" + height + "не по плечу" + this);
            return false;
        } else {
            System.out.println(this + "успешно справляется с высотой в " + height + "метров");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}
