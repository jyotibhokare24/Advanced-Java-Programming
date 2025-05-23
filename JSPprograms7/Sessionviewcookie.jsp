<%@ page import="javax.servlet.http.Cookie" %>
<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Active Cookie List</title>
</head>
<body>
    <h2>Active Cookies</h2>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null && cookies.length > 0) {
%>
    <table border="1" cellpadding="5">
        <tr>
            <th>Cookie Name</th>
            <th>Cookie Value</th>
        </tr>
<%
        for (Cookie c : cookies) {
%>
        <tr>
            <td><%= c.getName() %></td>
            <td><%= c.getValue() %></td>
        </tr>
<%
        }
%>
    </table>
<%
    } else {
%>
    <p>No active cookies found.</p>
<%
    }
%>
<br>
<a href="index.jsp">Back to Add Cookie</a>
</body>
</html>
