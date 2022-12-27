<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/15/22
  Time: 12:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment</title>
</head>
<body>
    <div align="center">
        <h1>Billing Information</h1>
    <form:form action="processpayment" method="get" modelAttribute="paymentDto">
        <label>Credit Card Info: </label><form:input path="creditCardDto"></form:input><br>
        <label>Payment Amount: </label><form:input path="amountDto"></form:input><br>
        <input type="submit" value="Submit Payment">

    </form:form>
    </div>
</body>
</html>
