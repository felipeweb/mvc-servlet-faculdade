<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<h1>Pior Aluno</h1>
		<thead>
			<tr>
				<th>RM</th>
				<th>NF</th>
			</tr>
		</thead>
		<tbody>
			<tr
				style='background-color:red'>
				<td>${pior.rm}</td>
				<td>${pior.mediaFinal}</td>
			</tr>
		</tbody>
	</table>
		<table>
	<h1>Melhor Aluno</h1>
		<thead>
			<tr>
				<th>RM</th>
				<th>NF</th>
			</tr>
		</thead>
		<tbody>
			<tr
				style='background-color:green'>
				<td>${melhor.rm}</td>
				<td>${melhor.mediaFinal}</td>
			</tr>
		</tbody>
	</table>
	<h1> Media da sala na disciplina ${disciplina} foi ${mediaSala}</h1>
</body>
</html>