package com.lz.jvm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: zhuhuakun
 * @Date: 2019/6/3 16:04
 * @Description:
 */
public class App {

    private final static Logger logger = LoggerFactory.getLogger("demo");

    public static void main(String[] args) {
        logger.info("Hello World");
    }
}
