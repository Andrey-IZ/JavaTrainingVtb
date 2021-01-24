package com.geekbrains.lesson2;

import com.geekbrains.lesson2.obstacles.RunningTrack;
import com.geekbrains.lesson2.obstacles.Wall;
import com.geekbrains.lesson2.participants.Cat;
import com.geekbrains.lesson2.participants.Human;
import com.geekbrains.lesson2.participants.Participant;
import com.geekbrains.lesson2.participants.Robot;

public class MainApp {
    public static void main(String[] args) {
        Challendge challendge = new Challendge();
        Wall[] walls = {
            new Wall(2.2f),
            new Wall(2.5f),
            new Wall(2.0f),
            new Wall(1)
        };
        RunningTrack[] runningTrack = {
                new RunningTrack(100),
                new RunningTrack(110),
                new RunningTrack(20),
                new RunningTrack(500),
                new RunningTrack(60),
        };
        Participant[] participants = {
                new Human("John", 2.2f, 100),
                new Human("Bill", 1.0f, 50),
                new Human("Hue", 2.1f, 200),
                new Cat("bobik", 1, 600),
                new Robot("Mr Robot", 10, 1000),
                new Robot("Mr Danny", 5, 2000),
        };
        challendge.start(participants, runningTrack, walls);
    }
}
