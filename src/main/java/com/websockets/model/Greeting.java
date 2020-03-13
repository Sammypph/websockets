package com.websockets.model;

/**
 * Created by oakinrele on Jul, 2019
 */
public class Greeting
{
    String content;

    public Greeting(){}

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
