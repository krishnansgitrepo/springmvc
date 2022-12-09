<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/3/22
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Home</title>
    <script>
        function validateUserName() {
            // let userName = document.getElementById("nid").value;
            // if (userName.length < 2) {
            //     return false;
            // }
            return true;
        }
    </script>
</head>
<body>
<form:form action="calculate" method="post" modelAttribute="userInfo">
    <div align="center">
        <h1>Calculate Love</h1>
        <label for="nid">Name:</label><form:input id="nid" path="userName"/><br>
        <label for="cid">Crush Name:</label><form:input id="cid" path="crushName"/><br>
        <label>Accept terms and conditions:</label><form:checkbox path="termsAndConditionsAccepted" value="true"></form:checkbox><br>
        <input type="submit" value="Calculate"/>
    </div>
</form:form>
</body>
</html>
