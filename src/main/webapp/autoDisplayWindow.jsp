<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/META-INF/tlds/cometdchat" prefix="cometdchat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name=viewport content="width=device-width, initial-scale=1"/>

        <cometdchat:displayChatWindow toChatuser="CustomerCare" 
                                      loginToChatuser="true"
                                      loginUserDisplayName="me"
                                      windowBackground="#000088"/>
        
        <style type="text/css">
            body{ font-size:1.5em; }    
        </style>  
        <title>Auto Create Window Example</title>
    </head>
    <body>
        
        <b>Auto Create Window Example</b>
        
        <p>
            <b><a href="${pageContext.servletContext.contextPath}">Home</a></b>
        </p>
        
    </body>
</html>
