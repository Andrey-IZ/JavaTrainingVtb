package com.geekbrains.example;

import com.geekbrains.example.competitors.Cat;
import com.geekbrains.example.competitors.Competitor;
import com.geekbrains.example.competitors.Human;
import com.geekbrains.example.competitors.Robot;
import com.geekbrains.example.obstacles.Obstacle;
import com.geekbrains.example.obstacles.RunningTrack;
import com.geekbrains.example.obstacles.Wall;

public class MainApp {

    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new RunningTrack(50),
                new RunningTrack(50),
                new Wall(2),
                new Wall(5),
        };

        Competitor[] competitors = {
                new Human(50, 2),
                new Cat(100, 3),
                new Robot(500, 10),
        };

        for (Competitor competitor: competitors) {
            for (Obstacle obstacle: obstacles) {
                if (!obstacle.contest(competitor))
                    break;
            }
        }
    }

}
