<%@ page import="GuessTheWordBean.java" %>
<%@ page import="classes.GTWord.GuessTheWord" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <title>Guess The word game</title>
</head>
<body>

    <h1>Guess the word game</h1>
    <form action="GameServlet" method="post">
        <label for="guess">Enter your letter 2 guess:</label>
        <input type="text" id="guess" name="guess">
        <input type="submit" value="Guess!">
    </form>
    <% GuessTheWordBean gameBean = (GuessTheWordBean) request.getAttribute("gameBean"); %>
    <% if (gameBean != null) { %>
        <p><%= gameBean.getDisplayWord().toUpperCase() %></p>
        <p><%= gameBean.getMessage() %></p>

    <% } %>

</body>

</html>

