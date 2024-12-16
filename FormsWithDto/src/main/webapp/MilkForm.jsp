<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Milk Order Form</title>
</head>
<body>
 <h1>Milk Order Form</h1>
<h1> ${gettotal} </h1>
<form action="milkform" method="post">
    <pre>
 Brand <input TYPE="text" name="brand">
 Type<select name="type">
        <option>special</option>
        <option>ordinary</option>
        <option>goodlife</option>
        <option>goodlifeLite</option>
        <option>family</option>
        <option>buffalo</option>

    </select>
 Quantity<input type="number" name="quantity">
   <input type="submit" value="submit">
        </pre>
</form>
</body>
</html>