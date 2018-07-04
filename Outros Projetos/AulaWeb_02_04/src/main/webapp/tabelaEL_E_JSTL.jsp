<%-- 
    Document   : newjsp
    Created on : 19/03/2018, 19:18:52
    Author     : diogo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="atributo" value="valor do atributo" scope="page" />
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
    </head>
    <body>
        <h1><%= metodo() %></h1>
        <h2><%= request.getParameter("parametro") %></h2>
        <h3> UIHIUHSADIU Novo atributo = ${atributo}</h3>
        <table border="1">
            <tr>
                <td>Cabeçalho 1</td>
                <td>Cabeçalho 2</td>
            </tr>
            <c:if test="${not empty lista}">
                <c:forEach items="${lista}" var="item">
                    <tr>
                        <td>${item}</td>
                        <td>Dois</td>
                    </tr>
                </c:forEach>    
            </c:if>
        </table>
    </body>
</html>
