<%@ page import="java.sql.*" %>
<%@ include file="db.jsp" %>
<%
    try {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        PreparedStatement ps = conn.prepareStatement("INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, price);

        int result = ps.executeUpdate();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        conn.close();
    }

    // Redirect back to main page
    response.sendRedirect("index.jsp");
%>
