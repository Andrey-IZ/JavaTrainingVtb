package com.geekbrains.example.obstacles;

import com.geekbrains.example.competitors.Competitor;

public class Wall extends Obstacle{
    private final int maxHeight;

    public Wall(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean contest(Competitor competitor) {
        return false;
    }
}
