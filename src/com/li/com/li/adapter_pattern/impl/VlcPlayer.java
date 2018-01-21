package com.li.com.li.adapter_pattern.impl;

import com.li.com.li.adapter_pattern.AdvancedMediaPlayer;

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
