package br.cefetrj.psw;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcluirServlet
 */
public class ExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		Integer idArtista = null;
		try{
			idArtista = Integer.parseInt(id);
		}catch(Exception e){
			request.setAttribute("msg", "Não foi possível excluir a artista. Id inválido.");
			request.getRequestDispatcher("/listagem.jsp").forward(request, response);
			return;
		}
		
		List<Artista> artistas = 
				(List<Artista>) request.getServletContext().getAttribute("artistas");
		if(artistas != null){
			boolean excluiu = artistas.remove(new Artista(idArtista, null, null, null, null));
			if(excluiu){
				request.setAttribute("msg", "Artista excluído com sucesso.");
			}else{
				request.setAttribute("msg", "Não foi possível excluir o artista. Artista não encontrado.");
			}
		}else{
			request.setAttribute("msg", "Não foi possível excluir o artista. Listagem de artistas inexistente.");
		}
		
		request.getRequestDispatcher("/listagem.jsp").forward(request, response);
		
	}


}
