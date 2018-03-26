<%-- 
    Document   : TabelaDinamicaValida
    Created on : 25/03/2018, 10:55:17
    Author     : Andre
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="br.cefetrj.psw.trabalhojsp_tabeladinamica.AlunoPSW"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>




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
                        <% ArrayList<AlunoPSW> todosAlunos =(ArrayList<AlunoPSW>)application.getAttribute("ListaAlunos");%>
                        <%if(todosAlunos!=null){ 
                            for (AlunoPSW aluno : todosAlunos) 
                            {%>
                                <tr>

                                    <td><%= aluno.getNome() %></td>
                                    <td><%= aluno.getP1()%></td>
                                    <td><%= aluno.getTr() %></td>
                                    <td><%= aluno.getPj()%></td>
                                    <td><%= aluno.getPf()%></td>
                                    <td><%= aluno.getSituacao()%></td>

                                </tr>   
                            <%}
                        }%>
			
		</table>
	</body>
</html>

