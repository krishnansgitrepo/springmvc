<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/15/22
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment Details</title>
</head>
<body>
    <div align="center">
        <h1>Payment Details</h1>
    Credit Card Number: ${paymentDto.creditCardDto}

    Amount: ${paymentDto.amountDto}
    </div>
</body>
</html>
