/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet que deve verificar validade do codigo e o valor do orçamento
 * @author Andre
 */
@WebServlet("/ErrosServlet")
public class ErrosServlet extends HttpServlet {

    /**
    * Metodo que deve verificar validade do codigo e o valor do orçamento
    * @author Andre
    */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int codigo=0;
        float valorRealizado=0;
        
        boolean valido=true;
       // boolean preencher=true;//Campos vazios
        boolean ehNumero=true;

        //Codigo
        
        codigo = Integer.parseInt(request.getParameter("codigo"));
        request.setAttribute("codigo", codigo);

         if(codigo==0){//Codigo não existir

                request.setAttribute("ErroCodigo", "Codigo invalido");
                valido = false;
         }
        //valorRealizado
        
        valorRealizado = Integer.parseInt(request.getParameter("realizado"));
        request.setAttribute("realizado", valorRealizado);

         if(valorRealizado <= 0.0 ){

                request.setAttribute("ErroValor", "Valor realizado invalido");
                valido = false;
         }
             
         
      



        //UTILIZANDO O HTTPSESSION
        /*if(valido){
            
            ServletContext sc = request.getServletContext();
            ContaOrcamento co ;


            if(sess.getAttribute("ListaCarros")==null)
            {
                ArrayList<Carro> tabelaCarros = new <Carro>ArrayList();
                tabelaCarros.add(A);
                sess.setAttribute("ListaCarros", tabelaCarros);
            }else{
                ArrayList<Carro> tabelaCarros = (ArrayList<Carro>) sess.getAttribute("ListaCarros");
                tabelaCarros.add(A);
                sess.setAttribute("ListaCarros", tabelaCarros);
            }
            request.setAttribute("msg","Informações cadastrados com sucesso.");
            


        }*/
        request.getRequestDispatcher("Tabela.jsp").forward(request, response);

    }
    
 }

