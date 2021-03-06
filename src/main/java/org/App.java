package org;

import org.Service.Service;
import org.Service.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maks(avto12@i.ua) on 25.01.2016.
 */
public class App {
    static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        Service service=ServiceImpl.getInstance();
        String answer=service.getAnswerWithLocale();
        logger.info("Output to console is: {}", answer);
        System.out.println(answer);
    }

}
