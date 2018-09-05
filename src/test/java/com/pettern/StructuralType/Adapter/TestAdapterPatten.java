package com.pettern.StructuralType.Adapter;

import com.pettern.StructuralType.Adapter.dao.impl.AudioPlayer;

public class TestAdapterPatten {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp5","it is well.mp4");
    }
}
