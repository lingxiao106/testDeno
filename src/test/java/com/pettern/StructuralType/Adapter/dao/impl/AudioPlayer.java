package com.pettern.StructuralType.Adapter.dao.impl;

import com.pettern.StructuralType.Adapter.MediaAdapter;
import com.pettern.StructuralType.Adapter.dao.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("File Map3 ");
        } else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        } else{
            System.out.println("Invalid media" + audioType + "format not supported");
        }
    }
}
