/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.simuladop1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que serve para mostrar uma nova tabela atraves da filtração de dados de um formulario
 * @author Andre
 * @since 16/04
 */
@WebServlet("/FiltrarServlet")
public class FiltrarServlet extends HttpServlet {

        /**
         * 
         * @param request é o request
         * @param response é o response
         * @throws ServletException exceção de servlet
         * @throws IOException exceção de I/O
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String marca = request.getParameter("marca");
		String cor = request.getParameter("cor");
		System.out.println(marca);
                System.out.println(cor);
                
		if(request.getSession().getAttribute("ListaCarros")!=null){
                    List<Carro> carros = (List<Carro>) request.getSession().getAttribute("ListaCarros");
				
		
                    List<Carro> carrosFiltrados = new ArrayList<Carro>();

                    for(Carro C : carros){
                        if((C.getMarca().equals(marca)) && (C.getCor().equals(cor))){
                            carrosFiltrados.add(C);
                           
                        }
                        else if((C.getCor().equals(cor)) && marca.isEmpty()){
                                carrosFiltrados.add(C);

                        }
                        else if((C.getMarca().equals(marca)) && cor.isEmpty()){
                               carrosFiltrados.add(C);

                        }
                        
                       
                        
                    }
                    
                    if(carrosFiltrados.isEmpty()){
                         request.setAttribute("msg","Não existe os elementos filtrados");
                    }else{
                        request.setAttribute("msg","Filtração foi um sucesso");
                    }
                    
                    
                    request.setAttribute("ListaCarros",carrosFiltrados);
                    
                    
                    request.getRequestDispatcher("Tabela.jsp").forward(request, response);
                }
                else{
                    request.setAttribute("msg","Invalido:Não ha lista para filtrar");
                    request.getRequestDispatcher("Tabela.jsp").forward(request, response);
                }    
    }   
}
