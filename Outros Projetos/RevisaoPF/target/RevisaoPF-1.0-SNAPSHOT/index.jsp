<%-- 
    Document   : Teste
    Created on : 23/06/2018, 14:14:34
    Author     : Andre
--%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="import_head.jspf"%>
        <title>JSP Page</title>
        
    </head>
    <body>
        <form action="ValidarServlet" method="POST">
            <div class="container">
                <fieldset class="form-group">
                    <legend class="col-form-legend col-md-2">FILTRO</legend>
                    <div class="form-row">
                        <div class="form-group col-md-8">
                            <div>Departamento</div>
                            <selects:ComboTag/> 
                        </div>
                        </div>
                    <div class="form-row">
                        <div class="form-group col-md-5">
                            <label for="DataInicial">Data Inicial</label>
                            <input type="text" class="form-control col-sm-4 ${ not empty dataInicialMsg ? 'is-invalid': not empty periodoMsg ? 'is-invalid' : 'is-valid' }" id="DataInicial"  name="DataInicial" value ="${ DataInicial}">
                            <c:if test="${ not empty dataInicialMsg }">
                                <div class="invalid-feedback">${ dataInicialMsg }</div>
                            </c:if>

                        </div>
                        <div class="form-group col-md-5">
                           <label for="DataFinal">Data Final</label>
                            <input type="text" class="form-control col-sm-4 ${ not empty dataFinalMsg ? 'is-invalid': not empty periodoMsg ? 'is-invalid' : 'is-valid' }" id="DataFinal"   name="DataFinal" value="${ DataFinal }" >
                            <c:if test="${ not empty dataFinalMsg }">
                                <div class="invalid-feedback">${ dataFinalMsg }</div>
                            </c:if>
                        </div>
                        <div class="form-group col-md-2">
                            <input class="btn btn-info btn-md btn-sm" type="submit" value="Buscar" style="margin-top: 34px;">
                        </div>    
                    </div>
                    <div class="form-row">
                      <c:if test="${ not empty periodoMsg }">
                        <div class="alert alert-danger" role="alert">${ periodoMsg }</div>
                     </c:if>    

                    </div>        
                </fieldset>
            </div>               
             
        </form>
        
        <table class="table table-striped table-bordered">
                    <thead class="table-active">
			<tr>
				<th>Departamento</th>
                                <th>Contratados</th>
				<th>Demitidos</th>
				<th>Saldo</th>
				
			</tr>
                    </thead>
                    <tbody>
                        <c:if test="${not empty listaRelatorio}">
                            <c:forEach items="${listaRelatorio}" var="item">
                                <tr>
                                    <td class="table-primary">${item.nomeDepartamento}</td>
                                    <td>${item.contratados}</td>
                                    <td>${item.demitidos}</td>
                                    <td>${item.contratados - item.demitidos}</td>
                                </tr>  
                                
                            </c:forEach>
                            
                        </c:if>
                   </tbody>     
        </table>
    </body>
    <%@include file="import_finalbodyscripts.jspf"%>
    <script>    
        $(document).ready(function () {
                $('#DataInicial').mask('99/99/9999');
                $('#DataFinal').mask('99/99/9999');
         });
        /*$('#DataInicial, #DataFinal').datepicker({
            language: 'pt-BR'
            
        });*/
            
     </script>     
</html>
