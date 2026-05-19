package com.oops03;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Camera: Photo taken successfully!");
    }

    @Override
    public void playMusic() {
        System.out.println("Music Player: Playing music...");
    }

}

public class TestDemo07 {

    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.takePhoto();
        sp.playMusic();
    }

}