package org.example.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * <h2>In this class we apply IoC (Inversion of control)</h2>
 * @author John Connor
 */
//@Component("musicPlayer")
public class MusicPlayer {
    private Music music;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rap") Music music,
                       @Qualifier("classicalMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public List<String> _playMusic_(Compositions compositions){
        Random random = new Random();
        switch (compositions){
            case RAP:
                return music._getSong_();
            case CLASSICAL:
                return music2._getSong_();
            default:
                System.out.println("Nothing");
        }
//        return "Now playing " + music._getSong_() + " and " + music2._getSong_();
        return null;
    }
}