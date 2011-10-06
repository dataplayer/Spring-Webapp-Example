<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Member Query</title>
</head>

<body>

<p>Go back <a href="/spring_example/welcome">home</a></p>

<table border="1">
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
  </tr>
  <c:forEach items="${members}" var="member">
  <tr>
    <td>${member.firstname}</td>
    <td>${member.lastname}</td>
  </tr>
  </c:forEach>
</table>
</body>
</html>

