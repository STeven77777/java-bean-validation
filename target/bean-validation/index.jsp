<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Struts 2 Bean Validation - Welcome</title>
</head>

<body>
<s:textfield key="msg.hello" name="msghello" />
<h1>Welcome To Struts 2!</h1>

<p><a href='<s:url action="edit" />'>Edit your information</a></p>

<p><a href='<s:url action="edit-what-ever" />'>What ever</a></p>

<p><a href="<s:url action="index" namespace="config-browser" />">Launch the configuration browser</a></p>

<s:url var="localeEN" action="locale" >
    <s:param name="request_locale" >en</s:param>
</s:url>
<s:url var="localeIT" >
    <s:param name="request_locale" >it</s:param>
</s:url>
<s:url var="localeVN" action="locale" >
    <s:param name="request_locale" >vi</s:param>
</s:url>
<s:url var="localeFR" action="locale" >
    <s:param name="request_locale" >fr</s:param>
</s:url>

<s:a href="%{localeEN}" >English</s:a>
<s:a href="%{localeVN}" >Vietnam</s:a>
<s:a href="%{localeIT}" >Italy</s:a>
<s:a href="%{localeFR}" >France</s:a>
</body>
</html>