<%-- 
    Document   : index
    Created on : May 20, 2018, 1:30:17 AM
    Author     : Josh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name=viewport content="width=device-width, initial-scale=1"/>
        <style type="text/css">
            body{ font-size:1.5em; }    
        </style>  
        <title>Index Page</title>
    </head>
    <body>

        <b>Index Page</b>
        
        <p>
            <b><a href="${pageContext.servletContext.contextPath}">Home</a></b>
        </p>
        
        <p>
            <a href="${pageContext.servletContext.contextPath}/chat/joinroom.jsp">Join Chat Room</a>
        </p>
        <p>
            <a href="${pageContext.servletContext.contextPath}/autoJoinChat.jsp">Auto Join Chat Room</a>
        </p>
        <p>
            <a href="${pageContext.servletContext.contextPath}/autoDisplayWindow.jsp">Auto Display Chat Window</a>
        </p>
        
    </body>
</html>
