<%-- 
    Document   : form
    Created on : 02/04/2018, 20:49:14
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="selects" uri="WEB-INF/selects.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css" >
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ValidarServlet" method="POST">
            <div class="form-group">
                <label for="login">Login:</label> 
                <input id="login" class="form-control" type="text" name="login" value="${param.login}">${requestScope.msgErroLogin}<br>
            </div>
            Perfil: 
            
            <selects:SelectPerfilTag perfilSelecionado="${param.perfil}"/>${ msgErroPerfil}<br>
            <button class="btn btn-primary" type="submit">Enviar</button>
            
        </form>
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script>    
    </body>
</html>
