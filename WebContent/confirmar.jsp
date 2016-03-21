<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>RM</th>
				<th>Media NACS</th>
				<th>AM</th>
				<th>PS</th>
				<th>NF</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alunos}" var="aluno">
				<tr style='background-color: ${aluno.mediaFinal < 6 ? "red" : "green"}'>
					<td>${aluno.rm}</td>
					<td>${aluno.mediaNacs}</td>
					<td>${aluno.am}</td>
					<td>${aluno.ps}</td>
					<td>${aluno.mediaFinal}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form action="/final" method="post">
	<input type="hidden" name="disciplina" value="${disciplina}">
	<button type="submit">Salvar</button>
	</form>
</body>
</html>