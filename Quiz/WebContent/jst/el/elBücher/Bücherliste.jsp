<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

</body>
</html>