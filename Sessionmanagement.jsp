/*. Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then
it has to go to show the active cookie list when you press the link go to the active cookie list*/



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
