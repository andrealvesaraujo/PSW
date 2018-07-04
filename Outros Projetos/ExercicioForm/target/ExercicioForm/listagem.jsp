<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem</title>
</head>
<body>
	<c:out value="${ msg }"/>
	<a href="index.jsp">Novo Artista.</a>
	<form action="FiltrarServlet" method="GET">
		Nome Artístico: <input type="text" name=nomeArtistico value="${ param.nomeArtistico }" /><br/>
		Estilo Musical: <select name="estiloMusical">
					<option value="">Selecine um valor</option>
					<option value="rock" ${ param.estiloMusical eq "rock" ? "selected" : "" } >Rock</option>
					<option value="pop" ${ param.estiloMusical eq "pop" ? "selected" : "" } >Pop</option>
					<option value="outros" ${ param.estiloMusical eq "outros" ? "selected" : "" } >Outros</option>
				  </select><br/>
		<input type="submit" value="Filtrar" />
	</form>
	<table border="1">
		<tr>
			<td>Nome Artístico</td>
			<td>Banda</td>
			<td>Anos de Carreira</td>
			<td>Estilo Musical</td>
			<td>Excluir</td>
		</tr>
		<c:forEach items="${ artistas }" var="artista">
			<tr>
				<td>${ artista.nomeArtistico }</td>
				<td>${ artista.banda }</td>
				<td>${ artista.anosDeCarreira }</td>
				<td>${ artista.estiloMusical }</td>
				<c:url value="/ExcluirServlet" var="excluirUrl" scope="page">
					<c:param name="id" value="${ artista.id }"/>
				</c:url>
				<td><a href="${ excluirUrl }">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>