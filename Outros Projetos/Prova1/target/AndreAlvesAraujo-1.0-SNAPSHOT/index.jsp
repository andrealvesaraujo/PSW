<%-- 
    Document   : index
    Created on : 16/04/2018, 10:23:22
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Prova 1</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" >
    </head>
    <body class="bg-light">
        <form action="ValidarServlet" method="POST">
            <div class="container">
                <h2 class="bg-primary text-center">Formulario</h2>
                <div class="input-group">
                    
                    <div class="input-group-prepend">
                        <label class="input-group-text" for="empresa">Empresa:</label>
                    </div>
                     <select class="text-info custom-select" name="empresa" id="empresa">
                          
                         <option value="Petrobras" ${empresa eq "Petrobras"? "selected":""}>Petrobras</option> 
                         <option value="IBM" ${empresa eq "IBM"? "selected":""}>IBM</option> 
                         <option value="MacDonalds"${empresa eq "MacDonalds"? "selected":""}>MacDonalds</option>
                         
                     </select>
                    
                </div>
                <div class="input-group">
                    <div class="input-group-prepend">
                        <label class="input-group-text" for="ano">Ano do Orcamento:</label>
                    </div>
                     <select class="text-info custom-select" name="ano" id="ano">
                          
                         <option value="2018" >2018</option> 
                         <option value="2019" >2019</option> 
                         <option value="2017" >2017</option>
                         
                     </select>
                    
                </div>
 
                <div class="text-center">
                     <input  type="submit" value="Exibir Orcamento" class="btn btn-success btn-md btn-sm" >
                     <a  class="btn btn-info btn-sm" href="Tabela.jsp" role="button">Ver Tabela</a>
                </div>
                  
            </div>  
        </form>
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
