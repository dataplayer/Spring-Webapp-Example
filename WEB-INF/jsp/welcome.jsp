<html>
<head>
<title> Welcome </title>
</head>

<body>
<h2>Welcome to Members System</h2>
Today is <%= request.getAttribute("today") %>
<br>
<p>Find a current member usin their first name <a href="/spring_example/memberQuery" >here</a></p>
<p>Become a member <a href="/spring_example/memberAdd" >here</a></p>
</body>
</html>
