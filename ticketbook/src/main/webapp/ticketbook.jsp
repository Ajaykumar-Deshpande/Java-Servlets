<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>
<style>
    /* CSS to style the success and failure messages */
    .text-success {
        color: green; /* Green color for success */
    }
    .text-danger {
        color: red; /* Red color for failure */
    }
</style>
</head>
<body>
<h1>Ticket Booking Page</h1>

<!-- Display success and failure messages -->
<span class="text-success">${success}</span>
<span class="text-danger">${failure}</span>

<form action="ticket" method="post">
<pre>
Stadium Name <select name="stadiumName">
<option>Select</option>
<option>Chinnaswamy Stadium</option>
<option>Narendra Modi Stadium</option>
<option>VK Stadium</option>
<option>MSD Stadium</option>
</select>
Tickets <input type="number" name="ticket" value="${dto.ticket}">
Primary Contact <input type="tel" name="primaryContact" value="${dto.primaryContext}">
Email <input type="email" name="email" value="${dto.email}">
<input type="submit" value="Book">
</pre>
</form>
</body>
</html>
