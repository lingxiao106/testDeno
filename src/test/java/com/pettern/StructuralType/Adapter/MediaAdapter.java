package com.pettern.StructuralType.Adapter;

import com.pettern.StructuralType.Adapter.dao.AdvancedMedioPlayer;
import com.pettern.StructuralType.Adapter.dao.MediaPlayer;
import com.pettern.StructuralType.Adapter.dao.impl.Mp4Player;
import com.pettern.StructuralType.Adapter.dao.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMedioPlayer advancedMedioPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMedioPlayer = new Mp4Player();
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMedioPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMedioPlayer.playMp4(fileName);
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMedioPlayer.playVlc(fileName);
        }
    }
}
