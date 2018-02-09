package com.li.template.impl;

import com.li.template.Game;

public class Footable extends Game {

    @Override
    public void initialize() {

        System.out.println("Footabll Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {

        System.out.println("Footabll Game started. Enjoy the game!");
    }

    @Override
    public void endPlay() {

        System.out.println("Footabll Game Finished!");
    }
}
