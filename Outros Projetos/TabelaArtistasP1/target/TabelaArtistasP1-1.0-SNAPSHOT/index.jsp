<%-- 
    Document   : index.jsp
    Created on : 09/04/2018, 19:52:52
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do Artista</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" >
    </head>
    <body class="bg-light">
        <form action="ValidarArtista" method="POST">
            <div class="container">
                <h2 class="bg-primary text-center">Formulario</h2>
                <div class="form-row">
                    <div class="form-group col-md-12">
                                <h5 class="text-danger">${requestScope.ErroFormatoNome}</h5>
                                <h5 class="text-danger">${requestScope.ErroNome}</h5>
                                <label for="nome" >Nome Artistico:</label>
                                <input class="form-control" id="nome" type="text" name="nome" value="${nome}">
                                <h5 class="text-danger">${ObrigatorioNome}</h5><br>
                   </div>
                </div>   
               <div class="row">
                    <div class="form-group col col-md-6">
                                 <h5 class="text-danger">${requestScope.ErroFormatoBanda}</h5>
                                 <h5 class="text-danger">${requestScope.ErroBanda}</h5>
                                 <label for="banda" >Banda:</label>
                                 <input class="form-control" id="banda" type="text" name="banda" value="${banda}">
                                 <br>
                    </div>
                    <div class="form-group  col col-md-6">
                                 <h5 class="text-danger">${requestScope.ErroFormatoAnos}</h5>
                                 <h5 class="text-danger">${requestScope.ErroAnos}</h5>
                                 <label for="anos" >Anos de Carreira:</label>
                                 <input class="form-control" id="anos" type="text" name="anos" value="${anos}">
                                 <h5 class="text-danger">${ObrigatorioAnos}</h5><br>
                    </div>
               </div>     
                <div class="input-group">
                    <div class="input-group-prepend">
                        <label class="input-group-text" for="estilo">Estilo :</label>
                    </div>
                     <select class="custom-select" name="estilo" id="estilo">
                         <option value="Rock" ${estilo eq "Rock"? "selected":""}>Rock</option> 
                         <option value="Pop" ${estilo eq "Pop"? "selected":""}>Pop</option> 
                         <option value="Outros"${estilo eq "Outros"? "selected":""}>Outros</option>

                     </select>

                </div>
                <br>       
                <div class="text-center">
                     <input  type="submit" value="Submeter dados" class="btn btn-success btn-md btn-sm" >
                     <a  class="btn btn-info btn-sm" href="ListarArtistas.jsp" role="button">Ver Tabela</a>
                </div>
                  
            </div>  
        </form>
        <script src="js/jquery-3.2.1.slim.min.js" ></script>
        <script src="js/popper.min.js" ></script>
        <script src="js/bootstrap.min.js"></script> 
    </body>
</html>
