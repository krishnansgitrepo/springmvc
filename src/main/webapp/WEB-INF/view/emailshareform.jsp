<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/26/22
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Share Results-Email</title>


</head>
<body>
<h1>hi! ${userName}</h1>
<form:form action="process-email" method="get" modelAttribute="emailDto">
Your email id: <form:input path="emailAddressToShareWith"></form:input>
    <input type="submit" value="Share via email"/>
</form:form>
</body>
</html>
