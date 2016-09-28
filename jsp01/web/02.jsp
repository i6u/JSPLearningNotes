<%--
  Created by IntelliJ IDEA.
  User: zhouweitao
  Date: 16/9/28
  Time: 下午3:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>
<p><%=
        request.getSession().getServletContext().getRealPath("/")%></p>
<p><%=application.getRealPath("/")%></p>
<form>
    <input type="text" name="n" value="<%=request.getParameter("n")%>">
    <input type="submit" value="submit">
</form>
<div align="center">
    <%
        int n = 0;
        try {
            n = Integer.parseInt(request.getParameter("n"));
    %>

    <table border="1">
        <tr align="center">
            <td colspan="<%=n%>" style="font-size: 15px;font-weight: bolder">九九乘法算表表</td>
        </tr>
        <%
            for (int i = 1; i <= n; i++) {
        %>
        <tr>
            <%
                for (int j = 1; j <= i; j++) {
            %>
            <td><%=i%>*<%=j%>=<%=i * j%>
            </td>
            <%
                }
            %>
        </tr>
        <%
            }
        } catch (Exception e) {
        %>
        <h3>请输入一个正确的格式</h3>
        <%
            }
        %>
    </table>
    <%!
        public int add(int a, int b){
            return a+b;
        }
    %>
    <%=

    add(1, 2) %>
</div>
</body>
</html>
