package com.websockets.controller;

import com.websockets.model.Greeting;
import com.websockets.model.Hello;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * Created by oakinrele on Jul, 2019
 */
@Controller
public class GreetingController
{
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Hello message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
