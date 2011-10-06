

<html>
<head>
<title> Query Form </title>
</head>

<body>

<form method="post" action="/spring_example/memberQuery">
Member
<br>
Firstname:
<input type="text" name="firstname" value="${firstname}" />
LastName:
<input type="text" name="lastname" value="${lastname}" />
<input type="submit" value="Query" />
</form>


</body>

</html>
