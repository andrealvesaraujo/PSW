package br.cefetrj.psw;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FiltrarServlet
 */
public class FiltrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeArtistico = request.getParameter("nomeArtistico");
		String estiloMusical = request.getParameter("estiloMusical");
		
		List<Artista> artistas = 
				(List<Artista>) request.getServletContext().getAttribute("artistas");
		
		List<Artista> artistasFiltrados = null;
		
		if(artistas != null){
			
			Stream<Artista> stream = artistas.stream();
			
			if(nomeArtistico != null && nomeArtistico.trim().length() > 0){
				
				stream = stream.filter(artista -> artista.getNomeArtistico().
						toLowerCase().contains(nomeArtistico.toLowerCase()));
			}
			
			if(estiloMusical != null && estiloMusical.trim().length() > 0){
				
				stream = stream.filter(artista -> artista.getEstiloMusical().equals(estiloMusical));
			}
			
			artistasFiltrados = stream.collect(Collectors.toList());
			
		}
		
		request.setAttribute("artistas", artistasFiltrados);
		
		request.getRequestDispatcher("/listagem.jsp").forward(request, response);
		
	}

}
