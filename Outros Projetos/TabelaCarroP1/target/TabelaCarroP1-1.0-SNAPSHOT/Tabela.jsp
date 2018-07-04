<%-- 
    Document   : tabela
    Created on : 15/04/2018, 15:19:29
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primeira Pagina</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" >
    </head>
    <body>
        <div class="bg-primary font-weight-bold text-center"><c:out value="${ msg }"/></div>
        <form action="FiltrarServlet" method="GET">
           <div class="container">
               <div class="form-row">
                   
                    <div class="form-group col-md-12">
                                <h5 class="text-danger">${requestScope.ErroFormatoMarca}</h5>
                                <h5 class="text-danger">${requestScope.ErroMarca}</h5>
                                <label for="marca" >Marca:</label>
                                <input class="form-control" id="marca" type="text" name="marca" value="${marca}">
                                <h5 class="text-danger">${ObrigatorioMarca}</h5><br>
                   </div>
                </div>
                   
               <div class="row">
                    <div class="input-group col-md-12">
                         <div class="input-group-prepend">
                        <label class="input-group-text" for="cor">Cor:</label>
                    </div>
                     <select class="text-info custom-select" name="cor" id="cor">
                         <option value="">Opcional</option> 
                         <option value="Branco" ${cor eq "Branco"? "selected":""}>Branco</option> 
                         <option value="Preto" ${cor eq "Preto"? "selected":""}>Preto</option> 
                         <option value="Prata"${cor eq "Prata"? "selected":""}>Prata</option>
                         <option value="Vermelho" ${cor eq "Vermelho"? "selected":""}>Vermelho</option> 
                         <option value="Azul"${cor eq "Azul"? "selected":""}>Azul</option>
                     </select>

                     </div>
               </div>              
                         <br>         
                <div class="text-center">
                     <input  type="submit" value="Filtrar Tabela" class="btn btn-success btn-md btn-sm" >
                     
                </div>         
           </div>
       </form>
       <br>    
       <div class="table-responsive">           
            <table class="table table-striped table-bordered ">
                     <thead class="thead-dark">
                         <tr>
                                 <th>Marca</th>
                                 <th>Modelo</th>
                                 <th>Anos de Fabricação</th>
                                 <th>Cor</th>
                                 <th>Excluir</th>

                         </tr>
                     </thead>
                     <tbody>
                         <c:if test="${not empty ListaCarros}">
                             <c:forEach items="${ListaCarros}" var="carro">
                                 <tr>

                                     <td class="table-primary">${carro.marca}</td>
                                     <td>${carro.modelo}</td>
                                     <td >${carro.anos}</td>

                                     <c:choose>
                                             <c:when test="${carro.cor eq 'Preto'}">
                                                 <td class="table-success">${carro.cor}</td>
                                             </c:when>
                                             <c:when test="${carro.cor eq 'Branco'}">
                                                 <td class="table-danger">${carro.cor}</td>
                                             </c:when>
                                             <c:otherwise>
                                                 <td class="table-warning">${carro.cor}</td>
                                             </c:otherwise>
                                     </c:choose>

                                     <td class="table-secondary"><a href="ExcluirLinha?id=${carro.id}">Excluir</a></td>


                                 </tr>  

                             </c:forEach>

                         </c:if>
                    </tbody>     
                 </table>
             </div>    
        <div class="text-center" >
            <a class="btn btn-primary" href="index.jsp" role="button">Voltar</a>
        </div> 
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
