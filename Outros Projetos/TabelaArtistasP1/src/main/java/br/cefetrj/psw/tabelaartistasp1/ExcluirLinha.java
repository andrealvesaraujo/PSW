/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.tabelaartistasp1;

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
 *
 * @author Andre
 */
@WebServlet("/ExcluirLinha")
public class ExcluirLinha extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       ServletContext sc = request.getServletContext(); 
       if(sc.getAttribute("ListaArtistas")!=null)
        {
            
            int id =0;
            try{
                id = Integer.parseInt(request.getParameter("id"));
            }catch(NumberFormatException e){
                request.setAttribute("msg", "Não foi possivel excluir a artista. Id inválido.");
                request.getRequestDispatcher("/ListarArtistas.jsp").forward(request, response);
                return;
            }
            ArrayList<Artista> tabelaAlunos = (ArrayList<Artista>) sc.getAttribute("ListaArtistas");
            boolean excluiu=tabelaAlunos.remove(new Artista(id));
            
            if(excluiu){
                sc.setAttribute("ListaArtistas", tabelaAlunos);
                request.setAttribute("msg","LINHA EXCLUIDA COM SUCESSO");
            }else{
                request.setAttribute("msg","Não foi possivel excluir o artista. Artista não encontrado.");
            }
            
            request.getRequestDispatcher("ListarArtistas.jsp").forward(request, response);
            
        }else{
            request.setAttribute("msg", "Não foi possivel excluir o artista. Listagem de artistas inexistente.");
            request.getRequestDispatcher("ListarArtistas.jsp").forward(request, response);
        }
    }

   
}
