<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
  <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int[] zahlen = new int []{15, 3, 26, 420};
		request.setAttribute("zahlen",zahlen);
		ArrayList<String>list = new ArrayList<String>();
		list.add("Salam");
		list.add("Aleikum");
		list.add("Welt");
		list.add("!");
		request.setAttribute("list", list);

%>
<c:out value="${'hallo welt'}"/>  
<c:set var="zahl" value="${1+2}" scope ="session"/><br/>
<c:set var="benutzer" value="${param['benutzer']}" scope ="session"/><br/>

<c:out value="${zahl}"/>  

<c:if test="${not empty benutzer }">

<c:out value="${benutzer}"/>  
</c:if>

<c:out value="${'hallo welt'}"/>  
<c:forEach var="i" begin="1" end="10">
<c:out value="${zahlen [i] }"/><br/>


</c:forEach>

<c:forEach var="item" items="${list }">
<c:out value="${list [i] }"/><br/>
</c:forEach>

<c:forEach var="i" begin="0" end="${list.size()-1 }">
<c:out value="${list [i] }"/><br/>
</c:forEach>

<a href="anmelden.jsp">logout</a>

</body>
</html>