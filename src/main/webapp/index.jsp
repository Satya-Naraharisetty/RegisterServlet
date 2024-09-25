<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="./Register" method="post">
    <table>
        <tr><td>User name </td>
            <td> <input type="text" name="Uname" ></td>
        </tr>
        <tr><td>User City</td>
            <td> <input type="text" name="Ucity" ></td>
        </tr>
        <tr>
            <td> <input type="submit" value="Signup" ></td>
        </tr>
    </table>
</form>
</body>
</html>