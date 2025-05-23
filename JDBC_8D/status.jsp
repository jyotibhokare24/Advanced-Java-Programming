<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head><title>Update Status</title></head>
<body>
    <%
        String msg = request.getParameter("msg");
        if ("success".equals(msg)) {
    %>
        <h3 style="color: green;">Record updated successfully!</h3>
    <%
        } else {
    %>
        <h3 style="color: red;">Failed to update record. Check Emp No.</h3>
    <%
        }
    %>
    <a href="index.jsp">Go Back</a>| <a href="report.jsp">View Report</a>
</body>
</html>
