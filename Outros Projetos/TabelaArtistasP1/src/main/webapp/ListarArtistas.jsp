<%-- 
    Document   : ListarArtistas
    Created on : 09/04/2018, 18:47:35
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" >
    </head>
    <body class="bg-light">
       <div class="bg-primary font-weight-bold text-center"><c:out value="${ msg }"/></div>
       <form action="FiltrarServlet" method="GET">
           <div class="container">
               <div class="form-row">
                    <div class="form-group col-md-6">
                                <h5 class="text-danger">${requestScope.ErroFormatoNome}</h5>
                                <h5 class="text-danger">${requestScope.ErroNome}</h5>
                                <label for="nome" >Nome Artistico:</label>
                                <input class="form-control" id="nome" type="text" name="nome" value="${param.nome}">
                                <h5 class="text-danger">${ObrigatorioNome}</h5><br>
                   </div>
                </div>
               <div class="row">
                    <div class="input-group col-md-6">
                         <div class="input-group-prepend">
                             <label class="input-group-text" for="estilo">Estilo :</label>
                         </div>
                          <select class="custom-select" name="estilo" id="estilo">
                              <option value="Rock" ${param.estilo eq "Rock"? "selected":""}>Rock</option> 
                              <option value="Pop" ${param.estilo eq "Pop"? "selected":""}>Pop</option> 
                              <option value="Outros"${param.estilo eq "Outros"? "selected":""}>Outros</option>

                          </select>

                     </div>
               </div>              
                         <br>         
                <div class="text-center">
                     <input  type="submit" value="Submeter dados" class="btn btn-success btn-md btn-sm" >
                     
                </div>         
           </div>
       </form>
                         <br>                  
       <table class="table table-striped table-bordered">
                <thead class="thead-dark">
                    <tr>
                            <th>Nome Artistico</th>
                            <th>Banda</th>
                            <th>Anos de Carreira</th>
                            <th>Estilo Musical</th>
                            <th>Excluir</th>

                    </tr>
                </thead>
                <tbody>
                    <c:if test="${not empty ListaArtistas}">
                        <c:forEach items="${ListaArtistas}" var="artista">
                            <tr>

                                <td class="table-primary">${artista.nome}</td>
                                <td>${artista.banda}</td>
                                <td>${artista.anos}</td>
                                
                                <c:choose>
                                        <c:when test="${artista.estilo eq 'Rock'}">
                                            <td class="table-success">${artista.estilo}</td>
                                        </c:when>
                                        <c:when test="${artista.estilo eq 'Pop'}">
                                            <td class="table-danger">${artista.estilo}</td>
                                        </c:when>
                                        <c:otherwise>
                                            <td class="table-warning">${artista.estilo}</td>
                                        </c:otherwise>
                                </c:choose>
                                            
                                <td class="table-secondary"><a href="ExcluirLinha?id=${artista.id}">Excluir</a></td>


                            </tr>  

                        </c:forEach>

                    </c:if>
               </tbody>     
            </table>
        <div class="text-center" >
            <a class="btn btn-primary" href="index.jsp" role="button">Voltar</a>
        </div>   
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
