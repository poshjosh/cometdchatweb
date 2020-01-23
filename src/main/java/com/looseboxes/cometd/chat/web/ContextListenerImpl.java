/*
 * Copyright 2018 NUROX Ltd.
 *
 * Licensed under the NUROX Ltd Software License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.looseboxes.com/legal/licenses/software.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.looseboxes.cometd.chat.web;

import com.looseboxes.cometd.chat.CometdContext;
import com.looseboxes.cometd.chat.CometdContextImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Chinomso Bassey Ikwuagwu on May 19, 2018 2:34:19 AM
 */
@WebListener()
public class ContextListenerImpl implements ServletContextListener {

    private transient static final Logger LOG = Logger.getLogger(ContextListenerImpl.class.getName());

    public ContextListenerImpl() { }

    @Override
    public void contextDestroyed(ServletContextEvent sce) { }    
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        try{

            final ServletContext context = sce.getServletContext();

            final boolean productionMode = new ProductionModeTest().test(context);

            final String loggingConfig = productionMode ? 
                    "META-INF/logging.properties" : "META-INF/logging_devmode.properties";
            
            LOG.info(() -> "Logging config: " + loggingConfig);
            
            new ReadLoggingConfig().accept(loggingConfig);

            final CometdContext cometdContext = new CometdContextImpl(context);
            
            final String cometdAppName = cometdContext.getAppName();
            
        }catch(RuntimeException e) {
            
            LOG.log(Level.WARNING, null, e);
            
            throw e;
        }
    }
}
