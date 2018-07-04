<%-- 
    Document   : teste
    Created on : 19/03/2018, 14:37:04
    Author     : Andre
    Aqui esta o exemplo simples do prof retirado dos slides
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
         private String atributo = "Valor do atributo";

         public String metodo(){
            return atributo;
         }

 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- ><link rel="stylesheet" href="estiloDoJsp.css">-->
        
    </head>
    <body>
        
        
        <h1><%= metodo() + "<br/>" %></h1>
        <table border="1">
            <tr>
                <th>Cabeçalho 1</td>
                <th>Cabeçalho 2</td>
            </tr>
            
            <tr>
                <td>Um</td>
                <td>Dois</td>
            </tr>
            
        </table>
    </body>
</html>
