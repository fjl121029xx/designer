package com.li.template.impl;

import com.li.template.Game;

public class Cricket extends Game {

    @Override
    public void initialize() {

        System.out.println("Cricket Game Initialized start playing.");
    }

    @Override
    public void startPlay() {

        System.out.println("Cricket Game started. Enjoy the game!");
    }

    @Override
    public void endPlay() {

        System.out.println("Cricket Game Finished!");
    }

}
