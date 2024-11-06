<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

</head>
<body>
<h1>${success}</h1>
<h1>${failure}</h1>
	<form action="login" method="post">
		<pre>
user ID<input type="text" name="name" value="${dto.name}"/>
Email<input type="email" name="email" value="${dto.email}"/>
Password<input type="password" name="password">
Confirm Password<input type="password" name="confirmpassword">
<input type="submit" value="Signup">

</pre>
	</form>
</body>
</html>