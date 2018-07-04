<%-- 
    Document   : Tabela
    Created on : 16/04/2018, 10:28:48
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="selects" uri="WEB-INF/selects.tld"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabela Prova 1</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" >
    </head>
    <body>
        <div class="bg-primary font-weight-bold text-center"><c:out value="${ msg }"/></div>
        <p>Tabela de Orçamento:</p>
                
        <table class="table table-striped table-bordered">
                <thead class="thead-dark">
                    <tr>
                            <th>${orcamento.nome}</th>
                            <th>Orçado</th>
                            <th>Realizado</th>
                            <th>Comprometido</th>
                               <th>Disponivel</th>
                    </tr>
                </thead>
                <tbody>
                   
                           
               </tbody>     
            </table>
                            <br>                
           <form action="ErrosServlet" method="POST">
               <p>${sucesso}</p>   
            <div class="container">
                <div class="form-row">

                     <div class="form-group col-md-12">

                                 <h5 class="text-danger">${requestScope.ErroCodigo}</h5>
                                 <label for="codigo" >Codigo:</label>
                                 <input class="form-control" id="codigo" type="text" name="codigo" value="${codigo}">

                    </div>
                 </div>
                 <div class="form-row">

                     <div class="form-group col-md-12">

                                 <h5 class="text-danger">${requestScope.ErroValor}</h5>
                                 <label for="realizado" >Valor realizado:</label>
                                 <input class="form-control" id="realizado" type="text" name="realizado" value="${realizado}">

                     </div>
                 </div>   

                          <br>         
                 <div class="text-center">
                      <input  type="submit" value="Adicionar dados" class="btn btn-success btn-md btn-sm" >

                 </div>         
            </div>
       </form>                
        <div class="text-center" >
            <a class="btn btn-primary" href="index.jsp" role="button">Voltar</a>
        </div>   
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
