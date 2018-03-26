<%-- 
    Document   : FormularioAlunoValido
    Created on : 24/03/2018, 10:58:25
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalho</title>
    </head>
    <body>
        <form action="ValidarFormulario" method="POST">
            <h2><%= request.getAttribute("ErroGeral") != null?request.getAttribute("ErroGeral") + "<br>":""%></h2>
            <h4><%= request.getAttribute("ErroFormatoNome") != null?request.getAttribute("ErroFormatoNome") + "<br>":""%></h4>
            <h5><%= request.getAttribute("ErroNome") != null?request.getAttribute("ErroNome") + "<br>":""%></h5>
            
            <div>
                    <label for="nome">Nome Completo do Aluno:</label>
                    <input type="text" name="nome" value="<%= request.getAttribute("nome") != null?request.getAttribute("nome"):""%>"><br>
            </div>
            <br>
            <h5><%= request.getAttribute("ErroP1") != null?request.getAttribute("ErroP1") + "<br>":""%></h5>
            <h4><%= request.getAttribute("ErroFormatoP1") != null?request.getAttribute("ErroFormatoP1") + "<br>":""%></h4>
            <div>
                    <label for="prova1">P1:</label>
                    <input type="text" name="prova1" value="<%= request.getAttribute("p1") != null?request.getAttribute("p1"):""%>"><br>
            </div>
            <br>
            <h5><%= request.getAttribute("ErroTR") != null?request.getAttribute("ErroTR") + "<br>":""%></h5>
            <h4><%= request.getAttribute("ErroFormatoTR") != null?request.getAttribute("ErroFormatoTR") + "<br>":""%></h4>
            <div>
                    <label for="trabalho">Trabalho:</label>
                    <input type="text" name="trabalho" value="<%= request.getAttribute("tr") != null?request.getAttribute("tr"):""%>"><br>
            </div>
            <br>
            <h5><%= request.getAttribute("ErroPJ") != null?request.getAttribute("ErroPJ") + "<br>":""%></h5>
            <h4><%= request.getAttribute("ErroFormatoPJ") != null?request.getAttribute("ErroFormatoPJ") + "<br>":""%></h4>
            <div>
                    <label for="projetoaula">Projeto Aula:</label>
                    <input type="text" name="projetoaula" value="<%= request.getAttribute("pj") != null?request.getAttribute("pj"):""%>"><br>
            </div>
            <br>
            <h5><%= request.getAttribute("ErroFR") != null?request.getAttribute("ErroFR") + "<br>":""%></h5>
            <h4><%= request.getAttribute("ErroFormatoFR") != null?request.getAttribute("ErroFormatoFR") + "<br>":""%></h4>
            <div>
                    <label for="freq">Frequência:</label>
                    <input type="text" name="freq" value="<%= request.getAttribute("fr") != null?request.getAttribute("fr"):""%>"><br>
            </div>
            <br>
            <h5><%= request.getAttribute("ErroPF") != null?request.getAttribute("ErroPF") + "<br>":""%></h5>
            <h4><%= request.getAttribute("ErroFormatoPF") != null?request.getAttribute("ErroFormatoPF") + "<br>":""%></h4>
            <div>
                    <label for="pf">Prova Final:</label>
                    <input type="text" name="pf" value="<%= request.getAttribute("pf") != null?request.getAttribute("pf"):""%>"><br>
            </div>
            <br>
            
            <input type="submit" value="Enviar formulario para a tabela">
            
        </form>
    </body>
</html>
