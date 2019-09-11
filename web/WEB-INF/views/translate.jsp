<%--
  Created by IntelliJ IDEA.
  User: konkon
  Date: 11/09/2019
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>translate</title>
</head>
<body>
<h1>Translate</h1>
<form method="get" action="translate">
    Enter english word: <input type="text" name="englishWord">
    <input type="submit" value="Translate">
    <div>
        English: ${englishWord}
        <br>
        Vietnamese: ${vietnameseWord}
    </div>
</form>
</body>
</html>
