/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que valida os campos do primeiro formulario da prova.
 * @author Andre
 */
@WebServlet("/ValidarServlet")
public class ValidarServlet extends HttpServlet {

    /**
     * Metodo que valida os campos do formulario principal de cadastro e se forem validas serão incluidas numa linha da Tabela.jsp.Caso algum campo foi preenchido errado haverá uma mensagem mostrando o erro.
     * @param request é o request
     * @param response é o response
     * @throws ServletException exceção do servlet
     * @throws IOException exceção de entrada e saida
     */
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empresa=null;  
        String ano=null;
         boolean valido=true;
        boolean ehNumero=true;
        
        //Nome
        
        
            
        empresa = request.getParameter("empresa");  
        request.setAttribute("empresa", empresa);      
       
        ano = request.getParameter("ano");
        request.setAttribute("ano", ano);
            
        Orcamento o = new Orcamento();
        o.setAno(Integer.parseInt(ano));
        o.setNome("Orçamento de "+ano);
        
        request.setAttribute("orcamento", o);
        
        
        request.getRequestDispatcher("Tabela.jsp").forward(request, response);
        
    
    }    
}
