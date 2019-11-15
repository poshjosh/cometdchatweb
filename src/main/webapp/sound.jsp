<%-- 
    Document   : sound
    Created on : May 25, 2018, 2:25:06 AM
    Author     : Josh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="${pageContext.request.contextPath}/bcSoundPlayer1.js"></script>
        <script type="text/javascript">
            bcSoundPlayer.addLoadEvent(bcSoundPlayer.setMp3Source('${pageContext.request.contextPath}/sounds/beep.mp3'));
        </script>
        <title>Sound</title>
    </head>
    <body>
        <h2>Sound</h2>
        <audio id="audio" name="audio" > 
          <source src="${pageContext.request.contextPath}/sounds/beep.ogg" type="audio/ogg"> 
          <source src="${pageContext.request.contextPath}/sounds/beep.wav" type="audio/wave"> 
          <source src="${pageContext.request.contextPath}/sounds/beep.mp3" type="audio/mpeg"> 
          <source src="${pageContext.request.contextPath}/sounds/beep.m4a" type="audio/mpeg"> 
          Your browser does not support the audio element. 
        </audio> 
        <input id="play" onclick="bcSoundPlayer.play('audio')" type="button" value="Play Sound"/> 
    </body>
</html>
