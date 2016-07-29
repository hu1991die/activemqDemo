/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.logging;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.apache.log4j.spi.LoggingEvent;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * @Desc
 * @Author feizi
 * @Date 2016/7/29 15:37
 * @Package_name com.feizi.logging
 */
public class LogMessageListener implements MessageListener{
    public void onMessage(Message message) {
        try {
            //receive log event in your consumer
            LoggingEvent event = (LoggingEvent) ((ActiveMQObjectMessage)message).getObject();
            System.out.println("Logging project:[" + event.getLevel() + "]" + event.getMessage());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
