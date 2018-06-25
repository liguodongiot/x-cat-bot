package com.lgd.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

@SpringBootApplication
@ComponentScan(basePackages = {"com.lgd.cat.controller",
        "com.lgd.cat.service",
        "com.lgd.cat.dao",
        "com.lgd.cat.cfg"})
@Configuration
@ServletComponentScan
public class CatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatApplication.class, args);
    }

}
