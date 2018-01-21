package com.li.adapter.impl;

import com.li.adapter.AdvancedMediaPlayer;

public class Ma4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {

        //什么也不做
    }

    @Override
    public void playMP4(String filename) {

        System.out.println("Playing Mp4 file. Name : " + filename);
    }
}
