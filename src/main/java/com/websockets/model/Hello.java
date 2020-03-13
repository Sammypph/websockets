package com.websockets.model;

/**
 * Created by oakinrele on Jul, 2019
 */
public class Hello
{

    String name;

    Hello(){}
    Hello(String name){
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
