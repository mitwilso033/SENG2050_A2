//error jsp, to display error messages if they happen when the game is being run/used

<!DOCTYPE html>
<html>
    <head>
        <title>ERROR</title>
    </head>

    <body>
        <h1>ERROR</h1>
        <p>Error: <%= request.getAttribute("errorMessage") %></p>
    </body>


</html>