package br.cefetrj.psw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidaServlet")
public class ValidaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeArtistico = request.getParameter("nomeArtistico");
		String banda = request.getParameter("banda");
		String anosDeCarreira = request.getParameter("anosDeCarreira");
		String estiloMusical = request.getParameter("estiloMusical");
		
		String msg = "";
		
		if(!(nomeArtistico != null && nomeArtistico.trim().length() > 0)){
			msg += "Nome artístico é um campo obrigatório.";
		}else{
			if(nomeArtistico.trim().length() > 30){
				msg += "Nome artístico deve ter até 30 caracteres.";
			}
		}
		
		if(banda != null && banda.trim().length() > 40){
			msg += "Banda deve ter até 40 caracteres.";
		}
		
		if(anosDeCarreira != null && anosDeCarreira.trim().length() > 0){
			try {
				int anosNumerico = Integer.parseInt(anosDeCarreira);
				if(anosNumerico > 99){
					msg += "Anos de carreira deve ter no máximo dois dígitos.";
				}
			} catch (Exception e) {
				msg += "Anos de carreira deve ser numérico.";
			}
		}else{
			msg += "Anos de carreira é um campo obrigatório.";
		}
		
		if(!(estiloMusical != null && estiloMusical.trim().length() > 0)){
			msg += "Estilo musical é um campo obrigatório.";
		}else{
			boolean estiloOk = false;
			switch(estiloMusical){
				case "pop": case "rock": case "outros":
					estiloOk = true;
			}
			if(!estiloOk){
				msg += "Estilo musical com opção inválida.";
			}
		}
		
		
		if(msg.equals("")){
			//form válido
		
			request.getRequestDispatcher("/IncluirServlet").forward(request, response);
		
		}else{
			request.setAttribute("msg", msg);
			//form inválido
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
		
	}

}
