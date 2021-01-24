package com.geekbrains.lesson2.participants;

public interface Participant extends Runnable, Jumpable {
    enum State {
        PASS,
        IS_FAILED,
        WIN
    }

    State getState();
    void setState(State state);
    String getType();
}
