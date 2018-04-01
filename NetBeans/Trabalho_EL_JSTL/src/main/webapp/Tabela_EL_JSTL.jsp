<%-- 
    Document   : Tabela_EL_JSTL
    Created on : 28/03/2018, 16:13:55
    Author     : Andre
--%>




<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
    <head>
        <title>Tabela do FormAluno</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="tabela.css">
    </head>
    <body>
		<table>
			<tr>
				<th>Aluno</th>
				<th>Prova 1</th>
				<th>Trabalho</th>
				<th>Projeto Aula</th>
				<th>Prova Final</th>
				<th>Situação</th>
			</tr>
                        <c:if test="${not empty ListaAlunos}">
                            <c:forEach items="${ListaAlunos}" var="aluno">
                                <tr>

                                    <td>${aluno.nome}</td>
                                    <td>${aluno.p1}</td>
                                    <td>${aluno.tr}</td>
                                    <td>${aluno.pj}</td>
                                    <td>${aluno.pf}</td>
                                    <td>${aluno.situacao}</td>

                                </tr>  
                                
                            </c:forEach>
                            
                        </c:if>
                        
			
		</table>
	</body>
</html>

