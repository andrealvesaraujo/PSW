/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.tabelaartistasp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet("/FiltrarServlet")
public class FiltrarServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeArtistico = request.getParameter("nome");
		String estiloMusical = request.getParameter("estilo");
		
		List<Artista> artistas = 
				(List<Artista>) request.getServletContext().getAttribute("ListaArtistas");
		
		List<Artista> artistasFiltrados = null;
                
                
                
                if(artistas != null){
			if(nomeArtistico != null && nomeArtistico.trim().length() > 0){
                            
                        }
                        if(estiloMusical != null && estiloMusical.trim().length() > 0){
                            //artista.getEstiloMusical().equals(estiloMusical) num laço do list<artista>.Problema como adicionar me outra
                        }
			
			
		}
                
                //request.setAttribute("ListaArtistas", artistasFiltrados);
		System.out.println("Foi");
		//request.getRequestDispatcher("/listagem.jsp").forward(request, response);
    }            
}
