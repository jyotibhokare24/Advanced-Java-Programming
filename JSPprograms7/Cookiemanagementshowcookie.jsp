<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Import the Cookie class --%>
<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Active Cookie List</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 20px;
            background-color: #f4f7f6;
            color: #333;
        }
        .container {
            max-width: 900px;
            margin: 30px auto;
            padding: 30px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #2c3e50;
            text-align: center;
            margin-bottom: 25px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 25px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.05);
        }
        th, td {
            border: 1px solid #e9ecef;
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #e9ecef;
            font-weight: bold;
            color: #495057;
            text-transform: uppercase;
            font-size: 14px;
        }
        td {
            background-color: #fdfefe;
            font-size: 15px;
        }
        tr:nth-child(even) td {
            background-color: #f5f5f5;
        }
        .no-cookies {
            color: #6c757d;
            font-style: italic;
            text-align: center;
            padding: 20px;
            border: 1px dashed #ced4da;
            border-radius: 8px;
            margin-top: 25px;
        }
        hr {
            border: 0;
            height: 1px;
            background: #eee;
            margin: 30px 0;
        }
        .link-section {
            text-align: center;
            margin-top: 20px;
        }
        .link-section a {
            color: #007bff;
            text-decoration: none;
            font-size: 17px;
            transition: color 0.2s;
        }
        .link-section a:hover {
            color: #0056b3;
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Active Cookie List</h1>

        <%
            // Get all cookies sent with the current request
            Cookie[] cookies = request.getCookies();
        %>

        <% if (cookies != null && cookies.length > 0) { %>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Value</th>
                        <th>Domain</th>
                        <th>Path</th>
                        <th>Max Age (sec)</th>
                        <th>Secure</th>
                        <th>HttpOnly</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Cookie cookie : cookies) {
                    %>
                        <tr>
                            <td><%= cookie.getName() %></td>
                            <td><%= cookie.getValue() %></td>
                            <td><%= cookie.getDomain() != null ? cookie.getDomain() : "Not Set (Current Host)" %></td>
                            <td><%= cookie.getPath() != null ? cookie.getPath() : "Not Set (Current Path)" %></td>
                            <td><%= cookie.getMaxAge() %></td>
                            <td><%= cookie.getSecure() %></td>
                            <td><%= cookie.isHttpOnly() %></td>
                        </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        <% } else { %>
            <p class="no-cookies">No active cookies found for this request.</p>
        <% } %>

        <hr>
        <div class="link-section">
            <p><a href="index.jsp">Go back to Add Cookie page</a></p>
        </div>
    </div>
</body>
</html>
