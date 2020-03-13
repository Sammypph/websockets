package com.websockets;

import com.websockets.model.Anagram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by oakinrele on Jul, 2019
 */
@SpringBootApplication
public class AppStartUp {
    public static void main(String[] args) {
        SpringApplication.run(Anagram.class, args);
    }
}
