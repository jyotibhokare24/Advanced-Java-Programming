<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test"; // XAMPP MySQL
    String user = "root"; // XAMPP default MySQL user
    String password = ""; // XAMPP MySQL has no password by default

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, user, password);
%>
