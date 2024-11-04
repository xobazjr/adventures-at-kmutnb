package main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
    Clip clip;
    URL soundURL[] = new URL[30];

    public sound(){
        soundURL[0] = getClass().getResource("/assets/sound/sound-background.wav");
        soundURL[1] = getClass().getResource("/assets/sound/drinking-energy.wav");
        soundURL[2] = getClass().getResource("/assets/sound/pick-up-paper-sound.wav");
        soundURL[3] = getClass().getResource("/assets/sound/finished-sound.wav");
    }

    public void setFile(int i){
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            
        }
    }
    public void play(){
        clip.start();
    }
    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(){
        clip.stop();
    }
}
