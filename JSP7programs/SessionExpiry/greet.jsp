<%@ page session="true" %>
<%
    String name = request.getParameter("username");

    if (name != null && !name.trim().isEmpty()) {
        session.setAttribute("username", name);
    } else {
        name = (String) session.getAttribute("username");
    }

    if (name == null) {
%>
        <h2>Session expired or not found. <a href="index.jsp">Click here</a> to enter again.</h2>
<%
    } else {
%>
        <h2>Hello, <%= name %>!</h2>
        <p>Your session will expire in 1 minute. Wait and refresh this page to check expiration.</p>
<%
    }
%>
