<%-- 
    Document   : index
    Created on : 28/03/2018, 16:12:57
    Author     : Andre
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalho</title>
    </head>
    <body>
        <form action="ValidarFormulario" method="POST">
            <h2>${requestScope.ErroGeral}</h2>
            <h4>${requestScope.ErroFormatoNome}</h4>
            <h5>${requestScope.ErroNome}</h5>
            
            <div>
                    <label for="nome">Nome Completo do Aluno:</label>
                    <input type="text" name="nome" value="${nome}"><br>
            </div>
            <br>
            <h5>${ErroP1}</h5>
            <h4>${ErroFormatoP1}</h4>
            <div>
                    <label for="prova1">P1:</label>
                    <input type="text" name="prova1" value="${requestScope.p1}"><br>
            </div>
            <br>
            <h5>${requestScope.ErroTR}</h5>
            <h4>${requestScope.ErroFormatoTR}</h4>
            <div>
                    <label for="trabalho">Trabalho:</label>
                    <input type="text" name="trabalho" value="${requestScope.tr}"><br>
            </div>
            <br>
            <h5>${requestScope.ErroPJ}</h5>
            <h4>${requestScope.ErroFormatoPJ}</h4>
            <div>
                    <label for="projetoaula">Projeto Aula:</label>
                    <input type="text" name="projetoaula" value="${requestScope.pj}"><br>
            </div>
            <br>
            <h5>${requestScope.ErroFR}</h5>
            <h4>${requestScope.ErroFormatoFR}</h4>
            <div>
                    <label for="freq">Frequência:</label>
                    <input type="text" name="freq" value="${requestScope.fr}"><br>
            </div>
            <br>
            <h5>${requestScope.ErroPF}</h5>
            <h4>${requestScope.ErroFormatoPF}</h4>
            <div>
                    <label for="pf">Prova Final:</label>
                    <input type="text" name="pf" value="${requestScope.pf}"><br>
            </div>
            <br>
            
            <input type="submit" value="Enviar formulario para a tabela">
            
        </form>
    </body>
</html>
