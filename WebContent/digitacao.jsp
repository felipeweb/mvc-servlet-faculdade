<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<!-- tem que por isso par conseguir usar as tags c: ,c:if ... -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/confirmar" method="post">
		<table>
			<!-- o for representa as inf de um aluno -->
			<c:forEach begin="1" end="${qtdAluno}">
				<!-- isso representa um for ;begin é de onde começa a contar; and = tamanho(onde termina o for , o length) -->
				<tr>
					<input type="hidden" name="qtdNacs" value="${nac}" />
					<input type="hidden" name="disciplina" value="${disciplina}" />
					<td>RM : <input type="text" name="rm" /></td>

					<c:forEach begin="1" end="${nac}" varStatus="status">
						<!-- o for representa as inf da nac -->
						<td>NAC${status.count}:<input type="text"
							name="Nac${status.count}" /></td>
					</c:forEach>

					<td>AM: <input type="text" name="am" /></td>
					<td>PS: <input type="text" name="ps" /></td>

				</tr>
			</c:forEach>

		</table>
		<button type="submit">Confirmar</button>
	</form>

</body>
</html>