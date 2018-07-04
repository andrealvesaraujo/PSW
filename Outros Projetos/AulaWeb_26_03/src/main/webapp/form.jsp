<%-- 
    Document   : form
    Created on : 19/03/2018, 20:49:14
    Author     : diogo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ValidarServlet" method="POST">
            Login: <input type="text" name="login" value="${param.login}">${requestScope.msgErroLogin}<br>
            Perfil: 
            <select name="perfil">
                <option value=""></option>
                <option value="aluno" ${param.perfil eq "aluno"? "selected": ""} >Aluno</option>
                <option value="professor" ${param.perfil eq "professor"? "selected": ""? "selected": ""}>Professor</option>
            </select>${msgErroPerfil}<br>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
