package com.li.com.li.adapter_pattern;

import com.li.builder_pattern.MealBuilder;
import com.li.com.li.adapter_pattern.impl.Ma4Player;
import com.li.com.li.adapter_pattern.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {

            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {

            advancedMediaPlayer = new Ma4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {

        if (audioType.equalsIgnoreCase("vlc")) {

            advancedMediaPlayer.playVlc(filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {

            advancedMediaPlayer.playMP4(filename);
        }
    }
}
