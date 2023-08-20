<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculator home</title>
</head>
<body>
<center>

<form action="Controller" method="post">
Operand 1:<input style = "background-color:chocolate"; type="text" name="op1"/><br>
Operand 2:<input style = "background-color:#7FFFD4"; type="text" name="op2"/><br>
<input style = "background-color:lightblue"; type="submit" name="action" value="Add"/>
<input style = "background-color:pink"; type="submit"  name="action" value="Subtract"/>
<input style = "background-color:yellow"; type="submit"  name="action" value="Multiplication"/>
<input style = "background-color:wheat"; type="submit"  name="action" value="Divide"/>
</form>
</center>
</body>
</html>