package com.lgd.cat.controller;

import bitoflife.chatterbean.AliceBot;
import bitoflife.chatterbean.AliceBotMother;
import bitoflife.chatterbean.ChatMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>Project: x-cat-bot</p>
 * <p>Package: com.lgd.cat</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/6/25
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    public static final String END = "bye";

    private static Logger logger = LoggerFactory.getLogger(ChatMain.class);
    AliceBotMother mother = new AliceBotMother();
    // http://localhost:5678/cat/chat?input=你好
    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public String chat(String input) throws Exception {
        mother.setUp();
        AliceBot bot = mother.newInstance();
        if(END.equalsIgnoreCase(input))
            return "bye";
        String output = bot.respond(input);
        logger.info("Alice>" + output);
        return output;
    }


}
