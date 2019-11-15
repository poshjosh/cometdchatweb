<%-- 
    Document   : sound
    Created on : May 25, 2018, 2:25:06 AM
    Author     : Josh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/META-INF/tlds/cometdchat" prefix="cometdchat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name=viewport content="width=device-width, initial-scale=1"/>
        <cometdchat:pageHeadFragment/> 
        <title>Sound 2</title>
    </head>
    <body>
        <h2>Sound 2</h2>
        <input id="play" onclick="cometdchatMessageBeep.play()" type="button" value="Play Sound"/> 
    </body>
</html>
