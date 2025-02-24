<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="login" method="post"> <!-- Ensure method="post" -->
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>
</body>
</html>
