package org.example.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <h1>This class replaces xml file applicationConfig.xml</h1>
 * @author John Connor
 */
@Configuration
@ComponentScan("org.example.springCore")
@PropertySource("classpath:musicPlayer.properties")
public class ApplicationConfig {
    // Creating Beans manually
    @Bean
    public ClassicalMusic musicBean(){
        return new ClassicalMusic();
    }
    @Bean
    public RapMusic musicBean2(){
        return new RapMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicBean(), musicBean2());
    }
}