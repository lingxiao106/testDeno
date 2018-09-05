package com.pettern.StructuralType.Adapter.dao.impl;

import com.pettern.StructuralType.Adapter.dao.AdvancedMedioPlayer;

public class VlcPlayer implements AdvancedMedioPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Player File Name " + fileName);

    }

    @Override
    public void playMp4(String fileName) {
        //aaa
    }
}
