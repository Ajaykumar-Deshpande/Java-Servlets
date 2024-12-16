<%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sweets Order Form</title>
</head>
<body>

    <h1>Sweet Order Form</h1>
    <h1>${sweetPrice}</h1>
    <form action="sweet" method="post">
<pre>
 <select name="ShopName" id="ShopName">
                <option value="">select shopName</option>
                <option value="Ayangar_Shop">Ayangar_Shop</option>
                <option value="Ganesh_Sweets">Ganesh_Sweets</option>
                <option value="Shanti_Sagar">Shanti_Sagar</option>
 </select>
</pre>
<pre>
<select name="SweetName" id="SweetName">
                <option value="">select SweetName</option>
                <option value="Karadantu">Karadantu</option>
                <option value="Ladu">Ladu</option>
                <option value="DarvadPeda">DarvadPeda</option>
 </select>
</pre>
<pre>
 <input type="checkbox" name="Special"> Special
</pre>
<pre>
 <select name="quantity" id="quantity">
                <option value="">select quantity in KG</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
 </select>
</pre>
 <input type="submit" value="Submit">
    </form>
</body>
</html>
