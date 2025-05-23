<%-- 8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively --%>


<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head><title>Update Employee</title></head>
<body>
    <h2>Update Employee Record</h2>
    <form action="update.jsp" method="post">
        Emp No: <input type="text" name="empno" required><br>
        Emp Name: <input type="text" name="empname" required><br>
        Basic Salary: <input type="text" name="salary" required><br><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
