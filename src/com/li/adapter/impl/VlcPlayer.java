package com.li.adapter.impl;

import com.li.adapter.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {

        System.out.println("Playing vlc file. Name : " + filename);
    }

    @Override
    public void playMP4(String filename) {

        //什么也不做的
    }
}
