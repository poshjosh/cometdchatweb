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

import java.util.function.Predicate;
import javax.servlet.ServletContext;

/**
 * @author Chinomso Bassey Ikwuagwu on May 19, 2018 12:31:26 AM
 */
public class ProductionModeTest implements Predicate<ServletContext> {

    public static final String PRODUCTION_MODE = "productionMode";

    @Override
    public boolean test(ServletContext context) {
        final Boolean bval;
        final Object oval = context.getAttribute(PRODUCTION_MODE);
        if(oval != null) {
            bval = (Boolean)oval;
        }else{
            final String sval = context.getInitParameter(PRODUCTION_MODE);
            bval = sval == null || sval.isEmpty() ? Boolean.FALSE : Boolean.valueOf(sval);
            context.setAttribute(PRODUCTION_MODE, bval);
        }
        return bval;
    }
}
