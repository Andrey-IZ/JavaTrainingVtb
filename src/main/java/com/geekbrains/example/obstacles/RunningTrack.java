package com.geekbrains.example.obstacles;

import com.geekbrains.example.competitors.Competitor;

public class RunningTrack extends Obstacle{
    private final int maxLength;

    public RunningTrack(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean contest(Competitor competitor) {
        if (competitor.run(maxLength)) {
            System.out.println(competitor.toString() + " пробежал");
            return true;
        } else {
            System.out.println(competitor.toString() + " не смог проьежать");
            return false;
        }
    }
}
