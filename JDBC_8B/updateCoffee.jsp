<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>

<%
    try {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        PreparedStatement ps = conn.prepareStatement(
            "UPDATE coffee SET coffee_name=?, price=? WHERE id=?"
        );
        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.setInt(3, id);

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated > 0) {
            out.println("<p style='color:green;'>Coffee with ID " + id + " updated successfully!</p>");
        } else {
            out.println("<p style='color:red;'>No coffee found with ID " + id + ".</p>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        conn.close();
    }
%>
<a href="index.jsp">Back to Main Page</a>
