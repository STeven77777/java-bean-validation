<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Struts 2 Bean Validation - Edit What Ever Information</title>
    <link href="<s:url value='/styles/styles.css' encode='false' includeParams='none'/>" rel="stylesheet"
          type="text/css" media="all"/>
</head>

<body>
<h1>Update What Ever Information</h1>

<p>Use the form below to edit what ever information.</p>

<s:form action="save-what-ever" method="post">
    <s:textfield key="room.roomId"/>
    <s:textfield key="room.roomName"/>
    <s:select key="room.roomStatus" list="roomStatus"/>
    <s:textfield key="room.roomType"/>
    <s:checkbox key="room.used"/>
    <s:textfield key="room.phoneNumber"/>
    <s:submit key="submitt"/>
</s:form>
</body>

</html>