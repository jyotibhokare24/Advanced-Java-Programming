<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    try {
        PreparedStatement ps = conn.prepareStatement("DELETE FROM coffee WHERE id = ?");
        ps.setInt(1, id);
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            out.println("<p style='color:green;'>Coffee with ID " + id + " deleted successfully.</p>");
        } else {
            out.println("<p style='color:red;'>No coffee found with ID " + id + ".</p>");
        }
        ps.close();
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        conn.close();
    }
%>
<a href="index.jsp">Back to Main Page</a>
