<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="/META-INF/tlds/cometdchat" prefix="cometdchat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name=viewport content="width=device-width, initial-scale=1"/>
     
        <cometdchat:joinChat loginUserDisplayName="me" windowBackground="#000088"/>
        
        <style type="text/css">
            body{ font-size:1.5em; }    
        </style>  
        <title>Auto-Join-Chat Example</title>
    </head>
    
    <body>
        
        <b>Auto-Join-Chat Example. Chatuser: ${chatuser}</b>
        
        <p>
            <b><a href="${pageContext.servletContext.contextPath}">Home</a></b>
        </p>
        
        <c:if test="${chatMembers != null && not empty chatMembers}">
            <c:forEach var="mapEntry_roomNameToRoomMembersMap" items="${chatMembers}">
                <br/>
                <div>Room: ${mapEntry_roomNameToRoomMembersMap.key}</div>
                <c:forEach var="mapEntry_roomUserToClientId" items="${mapEntry_roomNameToRoomMembersMap.value}">
                    <div>Room user: ${mapEntry_roomUserToClientId}</div>
                </c:forEach>
            </c:forEach> 
        </c:if>
    </body>
</html>
