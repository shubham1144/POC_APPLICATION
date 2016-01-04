<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authenticated User</title>
</head>
<body>
<h2> the user is authenticated successfully </h2>

<sec:authorize access="hasRole('ROLE_ADMIN')">

THIS TAB IS VISIBLE ONLY TO THE ADMIN
</sec:authorize>

<sec:authorize access="hasRole('ROLE_USER')">

THIS TAB IS VISIBLE ONLY TO THE USER

${data}
</sec:authorize>

</body>
</html>