<%--
  Created by IntelliJ IDEA.
  User: zhouweitao
  Date: 16/9/28
  Time: 下午2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>重新认识JSP</title>
</head>
<body>
<h1>JSP Page</h1>
<%
    for (int i = 0; i < 10; i++) {
        out.println(i + "...<br/>");
    }
%>

<%
    String str = request.getParameter("name");
    out.println(str);
%>
<br/>
<%=str%>
<br/>
<br/>
<%
    int n = Integer.valueOf(request.getParameter("n"));
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            out.println(j + " * " + i + " = " + i * j+"&nbsp");
        }
        out.println("<br/>");
    }
%>
</body>
</html>
