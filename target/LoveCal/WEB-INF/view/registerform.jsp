<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/3/22
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<div>
    <form:form action="registerme" method="get" modelAttribute="userRegistration">
        <div align="center">
            <label for="nameid">Name:</label><form:input path="name" id="nameid"></form:input><br>
            <label for="userNameId">User Name:</label><form:input path="userName" id="userNameId"></form:input><br>
            <label for="passwordId">Password:</label><form:input path="password" id="passwordId"></form:input><br>
            <label for="countryId">Country:</label><form:select path="country" id="countryId">
            <form:option value="india" label="India"/>
            <form:option value="usa" label="USA"/>
            </form:select><br>
            <label>Hobbies:</label>Cricket <form:checkbox path="hobbies" value="cricket"/> Reading <form:checkbox path="hobbies" value="reading"/>
            Traveling <form:checkbox path="hobbies" value="traveling"/> Coding <form:checkbox path="hobbies" value="coding"/><br>
            <label>Gender:</label>
            Male <form:radiobutton path="Gender" value="male"/>
            Female <form:radiobutton path="Gender" value="female"/><br>
            <input type="submit" value="Register"/>
        </div>
    </form:form>
</div>

</body>
</html>
