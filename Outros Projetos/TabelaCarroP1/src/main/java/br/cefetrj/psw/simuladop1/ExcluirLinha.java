/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.simuladop1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Andre
 */
@WebServlet("/ExcluirLinha")
public class ExcluirLinha extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession(); 
       if(sess.getAttribute("ListaCarros")!=null)
        {
            
            int id =0;
            try{
                id = Integer.parseInt(request.getParameter("id"));
            }catch(NumberFormatException e){
                request.setAttribute("msg", "Não foi possivel excluir a carro. Id inválido.");
                request.getRequestDispatcher("Tabela.jsp").forward(request, response);
                return;
            }
            ArrayList<Carro> tabelaCarro = (ArrayList<Carro>) sess.getAttribute("ListaCarros");
            boolean excluiu=tabelaCarro.remove(new Carro(id));
            
            if(excluiu){
                sess.setAttribute("ListaCarro", tabelaCarro);
                request.setAttribute("msg","LINHA EXCLUIDA COM SUCESSO");
            }else{
                request.setAttribute("msg","Não foi possivel excluir o carro. Carro não encontrado.");
            }
            
            request.getRequestDispatcher("Tabela.jsp").forward(request, response);
            
        }else{
            request.setAttribute("msg", "Não foi possivel excluir o carro. Listagem de carros inexistente.");
            request.getRequestDispatcher("Tabela.jsp").forward(request, response);
        }
    }

   
}
