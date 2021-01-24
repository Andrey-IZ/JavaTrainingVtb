package com.geekbrains.lesson2;

import com.geekbrains.lesson2.obstacles.RunningTrack;
import com.geekbrains.lesson2.obstacles.Wall;
import com.geekbrains.lesson2.participants.Participant;

public class Challendge {

    public void start(Participant[] participants, RunningTrack[] tracks, Wall[] walls) {
        for (var participant: participants) {
            for (var wall: walls) {
                if (participant.getState() == Participant.State.IS_FAILED)
                    break;
                for (var track: tracks) {
                    try {
                        if (participant.getState() == Participant.State.IS_FAILED)
                            break;
                        if (participant.run(track.getLength())) {
                            System.out.println(participant.getType() + " успешно пробежал " + track.getLength() + " м");
                            participant.setState(Participant.State.PASS);
                        } else {
                            System.out.println(participant.getType() + " не смог пробежать " + track.getLength() + " м");
                            participant.setState(Participant.State.IS_FAILED);
                            break;
                        }
                        if (participant.jump(wall.getHeight())) {
                            System.out.println(participant.getType() + " успешно перепрыгнул " + wall.getHeight() + " м");
                            participant.setState(Participant.State.PASS);
                        } else {
                            System.out.println(participant.getType() + " не смог перепрыгнуть " + wall.getHeight() + " м");
                            participant.setState(Participant.State.IS_FAILED);
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(participant.getType() + "" + e.getMessage());
                    }
                }
            }
        }
    }

    public boolean tryRun(Participant participant, RunningTrack track) {
        if (participant.run(track.getLength())) {
            System.out.println(participant.getType() + " успешно пробежал");
            return true;
        } else {
            System.out.println(participant.getType() + " не смог пробежать");
            return false;
        }
    }
}
