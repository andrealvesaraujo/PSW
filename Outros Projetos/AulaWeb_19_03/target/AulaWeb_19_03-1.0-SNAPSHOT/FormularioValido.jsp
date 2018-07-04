<%-- 
    Document   : FormularioValido
    Created on : 19/03/2018, 19:38:56
    Author     : Andre
    Exercicio do final do slide
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Valido</title>
    </head>
    <body>
        <form action="RecebeFormulario" method="POST">
            <%= request.getAttribute("MsgDeErroTexto") != null?request.getAttribute("MsgDeErroTexto") + "<br>":""%>
            Texto : <input name="texto" type="text" value="<%= request.getAttribute("texto") != null?request.getAttribute("texto"):""%>"><br>
            <select name="estado" >
                 <option value=""></option>
                <option value="rj" <%= (request.getParameter("estado")!= null) && (request.getParameter("estado").equals("rj")) ?"selected":"" %>>RJ</option>
                <option value="sp" <%= (request.getParameter("estado")!= null) && (request.getParameter("estado").equals("sp")) ?"selected":"" %> >SP</option>
                
                   
            </select>
                <%= request.getAttribute("MsgEstado") != null? request.getAttribute("MsgEstado") + "<br>":""%>
            <input type="submit" value="Clique aqui para enviar">
        </form>
        
    </body>
</html>
