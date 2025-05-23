<%@ page import="java.sql.*, db.DBConnection" %>
<%
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    int grandTotal = 0;

    try {
        con = DBConnection.getConnection();
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Emp");

        out.println("<pre>");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("Salary Report");
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (rs.next()) {
            int eno = rs.getInt("Emp_NO");
            String name = rs.getString("Emp_Name");
            int salary = rs.getInt("Basicsalary");

            out.println("Emp_No : " + eno);
            out.println("Emp_Name: " + name);
            out.println("Basic : " + salary);
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            grandTotal += salary;
        }

        out.println("Grand Salary : " + grandTotal);
        out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        out.println("</pre>");

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (con != null) con.close();
    }
%>
