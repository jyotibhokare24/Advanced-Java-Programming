/*Construct a Cookie Management program using JSP to get the fields Name, Domain and Max
Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then
it has to go to show the active cookie list when you press the link go to the active cookie list*/





<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- Import the Cookie class --%>
<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cookie Management - Add Cookie</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 20px;
            background-color: #f4f7f6;
            color: #333;
        }
        .container {
            max-width: 700px;
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
        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }
        input[type="text"],
        input[type="number"] {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #ced4da;
            border-radius: 5px;
            font-size: 16px;
            transition: border-color 0.2s;
        }
        input[type="text"]:focus,
        input[type="number"]:focus {
            border-color: #007bff;
            outline: none;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 17px;
            font-weight: bold;
            transition: background-color 0.2s ease-in-out;
            margin-top: 15px;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
        .message, .error {
            margin-top: 25px;
            padding: 15px;
            border-radius: 8px;
            font-size: 16px;
            line-height: 1.5;
        }
        .message {
            background-color: #d4edda;
            color: #155724;
            border: 1px solid #c3e6cb;
        }
        .error {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
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
        <h1>Add New Cookie</h1>

        <form action="index.jsp" method="post">
            <label for="cookieName">Cookie Name:</label>
            <input type="text" id="cookieName" name="cookieName" required placeholder="e.g., userPref">

            <label for="cookieValue">Cookie Value (Optional):</label>
            <input type="text" id="cookieValue" name="cookieValue" placeholder="e.g., dark_mode_on">

            <label for="cookieDomain">Domain (e.g., example.com - leave blank for current host):</label>
            <input type="text" id="cookieDomain" name="cookieDomain" placeholder="e.g., yourdomain.com">

            <label for="maxAge">Max Expiry Age (seconds, -1 for session cookie, 0 to delete):</label>
            <input type="number" id="maxAge" name="maxAge" value="3600" required placeholder="e.g., 3600 (1 hour)">

            <input type="submit" value="Add Cookie">
        </form>

        <%
            String message = "";
            String errorMessage = "";

            // Get parameters from the request
            String cookieName = request.getParameter("cookieName");
            String cookieValue = request.getParameter("cookieValue");
            String cookieDomain = request.getParameter("cookieDomain");
            String maxAgeStr = request.getParameter("maxAge");

            // Process only if a cookie name was submitted
            if (cookieName != null && !cookieName.trim().isEmpty()) {
                try {
                    int maxAge = Integer.parseInt(maxAgeStr);

                    // Create a new Cookie object
                    Cookie newCookie = new Cookie(cookieName.trim(), (cookieValue != null ? cookieValue.trim() : ""));

                    // Set domain if provided and not empty
                    if (cookieDomain != null && !cookieDomain.trim().isEmpty()) {
                        newCookie.setDomain(cookieDomain.trim());
                    }
                    // Path defaults to the context path of the web app, usually "/" for the whole app
                    newCookie.setPath("/"); // It's good practice to explicitly set path if you want it app-wide

                    // Set max expiry age
                    newCookie.setMaxAge(maxAge);

                    // Add the cookie to the HTTP response header
                    // This sends the cookie to the user's browser
                    response.addCookie(newCookie);

                    message = "Cookie '<b>" + newCookie.getName() + "</b>' has been added/updated successfully!";
                    message += "<br>Value: <b>" + newCookie.getValue() + "</b>";
                    message += "<br>Domain: <b>" + (newCookie.getDomain() != null ? newCookie.getDomain() : "Current Host (Implicit)") + "</b>";
                    message += "<br>Path: <b>" + newCookie.getPath() + "</b>";
                    message += "<br>Max Age: <b>" + newCookie.getMaxAge() + " seconds</b>.";

                } catch (NumberFormatException e) {
                    errorMessage = "Error: Max Expiry Age must be a valid integer number. " + e.getMessage();
                } catch (IllegalArgumentException e) {
                    // Catches errors like invalid cookie name characters
                    errorMessage = "Error creating cookie: " + e.getMessage();
                } catch (Exception e) {
                    // Catch any other unexpected errors
                    errorMessage = "An unexpected error occurred: " + e.getMessage();
                }
            }
        %>

        <%-- Display messages --%>
        <% if (!message.isEmpty()) { %>
            <div class="message"><%= message %></div>
        <% } %>
        <% if (!errorMessage.isEmpty()) { %>
            <div class="error"><%= errorMessage %></div>
        <% } %>

        <hr>
        <div class="link-section">
            <p><a href="showCookies.jsp">Go to the active cookie list</a></p>
        </div>
    </div>
</body>
</html>
