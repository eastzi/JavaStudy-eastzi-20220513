<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%! String[] name = new String[5];
	String[] email = new String[5];

	String madeName(String name) {
		return name + "님";
	}

	String madeEmail(String email) {
		return email + "@google.com";
	}
%>
<%
	name[0] = "일스트";
	email[0] = "eastzi1";
	name[1] = "이스트";
	email[1] = "eastzi2";
	name[2] = "삼스트";
	email[2] = "eastzi3";
	name[3] = "사스트";
	email[3] = "eastzi4";
	name[4] = "오스트";
	email[4] = "eastzi5";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="name" items="${name}" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${madeName(name[status.index])}</td>
				<td>${madeEmail(email[status.index])}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>