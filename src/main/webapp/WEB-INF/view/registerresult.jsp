<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/4/22
  Time: 12:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>
    Registration form for ${userRegistration.name} <br/>
    Username: ${userRegistration.userName}<br/>
    Password: ${userRegistration.password}<br/>
    Country: ${userRegistration.country}<br/>
    Hobbies:
    <c:forEach var="hobby" items="${userRegistration.hobbies}">
        ${hobby}
    </c:forEach>
    Gender: ${userRegistration.gender}<br/>
    Email: ${userRegistration.contactDto.emailAddress}
    Phone: ${userRegistration.contactDto.phone}
</body>
</html>
