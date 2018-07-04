/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.aulaweb_19_03;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/RecebeFormulario")
public class RecebeFormulario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //Pega valores do campo
        String textoDoUsuario= req.getParameter("texto");
       String sel = req.getParameter("estado");
       boolean formValido = true;
       //Validação
       req.setAttribute("texto", textoDoUsuario);
       if( (textoDoUsuario == null) || (textoDoUsuario).length() <=10) {
           
           req.setAttribute("MsgDeErroTexto", "O texto tem que ter mais de 10 letras");
           formValido = false;
       }
       if(sel == null || sel.equals("")){
           req.setAttribute("MsgEstado", "O estado deve ser preenchido");
           formValido = false;
       }
       if(formValido){
           req.getRequestDispatcher("sucesso.jsp").forward(req, resp);
       }
       else{
            req.getRequestDispatcher("FormularioValido.jsp").forward(req, resp);
       }
           
       //Trabalho para casa:Usa aquela tabela e sc com .jsp e validar
       
    }

    

}
