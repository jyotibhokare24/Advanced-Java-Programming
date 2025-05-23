<%--  8b. Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively --%>

<!DOCTYPE html>
<html>
<head>
    <title>Update Coffee Product</title>
</head>
<body>
    <h2>Update Coffee Product by ID</h2>
    <form action="updateCoffee.jsp" method="post">
        <label>ID:</label>
        <input type="number" name="id" required><br><br>

        <label>New Coffee Name:</label>
        <input type="text" name="coffee_name" required><br><br>

        <label>New Price:</label>
        <input type="number" step="0.01" name="price" required><br><br>

        <input type="submit" value="Update Coffee">
    </form>

    <hr>
    <h2>All Coffee Records</h2>
    <jsp:include page="displayCoffee.jsp" />
</body>
</html>
