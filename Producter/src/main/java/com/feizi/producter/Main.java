/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.producter;

import org.apache.log4j.Logger;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/7/29 16:24
 * @Package_name com.feizi.producter
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //just log a message
        logger.info("Info log.");
        logger.warn("Warn log.");
        logger.error("Error log.");
        System.exit(0);
    }
}
