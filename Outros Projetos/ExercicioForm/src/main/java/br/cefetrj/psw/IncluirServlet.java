
package br.cefetrj.psw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncluirServlet
 */
public class IncluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeArtistico = request.getParameter("nomeArtistico");
		String banda = request.getParameter("banda");
		String anosDeCarreira = request.getParameter("anosDeCarreira");
		String estiloMusical = request.getParameter("estiloMusical");
		
		//Verifica se a lista de artistas existe
		if(request.getServletContext().getAttribute("artistas") == null){
			//se não existe então cria
			request.getServletContext().setAttribute("artistas", new ArrayList<Artista>());
			request.getServletContext().setAttribute("lastIdArtista", 1);
		}
	
		//recupera a lista de artistas
		List<Artista> artistas = (List<Artista>)request.getServletContext().getAttribute("artistas");
		Integer lastIdArtista = (Integer)request.getServletContext().getAttribute("lastIdArtista");
		
		//adiciona uma nova artista na lista
		artistas.add(new Artista(lastIdArtista, nomeArtistico, banda, anosDeCarreira, estiloMusical));
		
		//Incrementa o identificador das artistas e coloca de volta no atributo
		lastIdArtista++;
		request.getServletContext().setAttribute("lastIdArtista", lastIdArtista);
		
		request.setAttribute("msg", "Artista incluído com sucesso!");
		
		request.getRequestDispatcher("/listagem.jsp").forward(request, response);
		
	}

}
