package com.looseboxes.cometd.chat.web;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 * @(#)JsonFormat.java   17-Oct-2014 19:12:03
 *
 * Copyright 2011 NUROX Ltd, Inc. All rights reserved.
 * NUROX Ltd PROPRIETARY/CONFIDENTIAL. Use is subject to license 
 * terms found at http://www.looseboxes.com/legal/licenses/software.html
 */
/**
 * Create a json string from various input types. E.g Map, List, Array or
 * plain key value pairs.
 * @author   chinomso bassey ikwuagwu
 * @version  2.0
 * @since    2.0
 */
public class JsonFormat extends JsonBuilder<StringBuilder> {
    
    public JsonFormat() { }

    public JsonFormat(boolean tidyOutput) {
        super(tidyOutput);
    }
    
    public JsonFormat(boolean tidyOutput, boolean escapeOutput) {
        super(tidyOutput, escapeOutput);
    }
    
    public JsonFormat(boolean tidyOutput, boolean escapeOutput, String indent) {
        super(tidyOutput, escapeOutput, indent);
    }
    
    /**
     * Convert an object to JSON text.
     * DO NOT call this method from appendJSONPair() of a class that implements Map or List with 
     * "this" as the parameter, use JSONObject.appendJSONPair(Map) or JSONArray.appendJSONPair(List) instead. 
     * 
     * @see org.json.simple.JSONObject#appendJSONString(Map)
     * @see org.json.simple.JSONArray#appendJSONString(List)
     * @see org.json.simple.JSONValue#appendJSONString(java.lang.Object) 
     * @see com.scrapper.config.TidyJsonMap#appendJSONString(java.lang.Object, java.lang.StringBuilder); 
     * 
     * @param value
     * @return JSON text, or "null" if value is null or it's an NaN or an INF number.
     */
    public String toJSONString(Object value){
        StringBuilder builder = new StringBuilder();
        this.appendJSONString(value, builder);
        return builder.toString();
    }
    
    /**
     * Escape quotes, \, /, \r, \n, \b, \f, \t and other control characters (U+0000 through U+001F).
     */
    public String escape(String s){
        if(s==null) {
            return null;
        }    
        StringBuilder sb = new StringBuilder(s.length() + (s.length()/10));
        escape(s, sb);
        return sb.toString();
    }

    @Override
    public void escape(CharSequence s, StringBuilder sb) {
        try{
            super.escape(s, sb);
        }catch(IOException shouldNeverHappend) {  }
    }

    @Override
    public void appendJSONString(Object value, StringBuilder appendTo) {
        try{
            super.appendJSONString(value, appendTo); 
        }catch(IOException shouldNeverHappend) {  }
    }

    @Override
    public void appendJSONString(Collection list, StringBuilder appendTo) {
        try{
            super.appendJSONString(list, appendTo);
        }catch(IOException shouldNeverHappend) {  }
    }

    @Override
    public void appendJSONPair(String key, Object value, StringBuilder appendTo) {
        try{
            super.appendJSONPair(key, value, appendTo); 
        }catch(IOException shouldNeverHappend) {  }
    }

    @Override
    public void appendJSONString(String key, Object value, StringBuilder appendTo) {
        try{
            super.appendJSONString(key, value, appendTo);
        }catch(IOException shouldNeverHappend) {  }
    }

    @Override
    public void appendJSONString(Map m, StringBuilder appendTo) {
        try{
            super.appendJSONString(m, appendTo);
        }catch(IOException shouldNeverHappend) {  }
    }
    
}
