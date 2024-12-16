<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Museum Ticket Form</title>
</head>
<body>
<h1>Museum Ticket Form</h1>
Customer name : ${museumFormDto.name}<br>
Number of Adult ticket:${museumFormDto.numOfAdults} and children ticket:${museumFormDto.numOfChildren}<br>
Total cost is : ${totalCost}
<form action="send" method="post">
    <pre>
        name<input type="text" name="customerName">
        numOfAdults<input type="text" name="numOfAdults">
        numOfChildren<input type="text" name="numOfChildren">
        mobileNumber<input type="number" name="mobileNumber">
        email<input type="text" name="email">
        <input type="submit" value="submit">
    </pre>

</form>

</body>
</html>