package com.looseboxes.cometd.chat.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author USER
 */

public class ReadLoggingConfig implements Consumer<String>{

    private static final Logger LOG = Logger.getLogger(ReadLoggingConfig.class.getName());

    @Override
    public void accept(String loggingConfig) {
        try{

            final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

            if(loggingConfig == null || loggingConfig.isEmpty()) {
                return;
            }

            try(InputStream ins = classLoader.getResourceAsStream(loggingConfig)) {

                LOG.info(() -> "Reading logging config");
                
                LogManager.getLogManager().readConfiguration(ins);
            }
        }catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
