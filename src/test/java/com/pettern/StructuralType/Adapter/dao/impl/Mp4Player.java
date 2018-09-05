package com.pettern.StructuralType.Adapter.dao.impl;

import com.pettern.StructuralType.Adapter.dao.AdvancedMedioPlayer;

public class Mp4Player implements AdvancedMedioPlayer {
    @Override
    public void playVlc(String fileName) {
        //aaa
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Player FileName" + fileName);
    }
}
