<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/3/22
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Results</title>
</head>
<body>

<h2>You found love!</h2>
<label>Crush:</label> ${userInfo.crushName}
AND <label>User:</label> ${userInfo.userName} are FRIENDS!
<br/>
<a href="/LoveCal_war/showemailshare/${userInfo.userName}">Send result to email</a>
</body>
</html>
