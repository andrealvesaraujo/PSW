<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<c:if test="${ not empty msg }">
		<h2>${ msg }</h2>
	</c:if>
	<c:if test="${ empty artista }">
		<jsp:useBean id="artista" class="br.cefetrj.psw.Artista" type="br.cefetrj.psw.Artista" scope="request" />
		<c:set target="${artista}" property="nomeArtistico" value="${ param.nomeArtistico }" />
		<c:set target="${artista}" property="banda" value="${ param.banda }" />
		<c:set target="${artista}" property="anosDeCarreira" value="${ param.anosDeCarreira }" />
		<c:set target="${artista}" property="estiloMusical" value="${ param.estiloMusical }" />
		<c:if test="${ not empty param.id }" >
			<c:set target="${artista}" property="id" value="${ Integer.parseInt(param.id) }" />
		</c:if>
	</c:if>
	<form action="ValidaServlet" method="POST">
		<input type="hidden" name="id" value="${ artista.id }">
		Nome Artístico: <input type="text" name=nomeArtistico value="${ artista.nomeArtistico }" /><br/>
		Banda: <input type="text" name=banda value="${ artista.banda }" /><br/>
		Anos de Carreira: <input type="text" name=anosDeCarreira value="${ artista.anosDeCarreira }" /><br/>
		Estilo Musical:: <select name="estiloMusical">
				<option value="">Selecine um valor</option>
				<option value="rock" ${ artista.estiloMusical eq "rock" ? "selected" : "" } >Rock</option>
				<option value="pop" ${ artista.estiloMusical eq "pop" ? "selected" : "" } >Pop</option>
				<option value="outros" ${ artista.estiloMusical eq "outros" ? "selected" : "" } >Outros</option>
			  </select><br/>
		<button type="submit">Enviar</button>
		<button type="button" onclick="javascript:location.href='listagem.jsp'">Voltar</button>
	</form>
</body>
</html>
