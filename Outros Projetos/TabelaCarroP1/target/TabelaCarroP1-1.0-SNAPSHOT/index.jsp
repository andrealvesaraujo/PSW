<%-- 
    Document   : index
    Created on : 15/04/2018, 15:17:30
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" >
    </head>
    <body class="bg-light">
        <form action="ValidarServlet" method="POST">
            <div class="container">
                <h2 class="bg-primary text-center">Formulario</h2>
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
                    <div class="form-group col col-md-6">
                                 <h5 class="text-danger">${requestScope.ErroFormatoModelo}</h5>
                                 <h5 class="text-danger">${requestScope.ErroModelo}</h5>
                                 <label for="modelo" class="text-info">Modelo:</label>
                                 <input class="form-control" id="modelo" type="text" name="modelo" value="${modelo}">
                                 <h5 class="text-danger">${ObrigatorioModelo}</h5><br>
                                 <br>
                    </div>
                    <div class="form-group  col col-md-6">
                                 <h5 class="text-danger">${requestScope.ErroFormatoAnos}</h5>
                                 <h5 class="text-danger">${requestScope.ErroAnos}</h5>
                                 <label for="anos" >Anos de Fabricação:</label>
                                 <input class="form-control" id="anos" type="text" name="anos" value="${anos}">
                                 
                    </div>
               </div>     
                <div class="input-group">
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
                <br>       
                <div class="text-center">
                     <input  type="submit" value="Submeter dados" class="btn btn-success btn-md btn-sm" >
                     <a  class="btn btn-info btn-sm" href="Tabela.jsp" role="button">Ver Tabela</a>
                </div>
                  
            </div>  
        </form>
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
