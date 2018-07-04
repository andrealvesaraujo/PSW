/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.aulaweb_02_04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diogo
 */
@WebServlet(name = "ValidarServlet", urlPatterns = {"/ValidarServlet"})
public class ValidarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //pega valores dos campos
        String login = req.getParameter("login");
        String perfil = req.getParameter("perfil");
        
        boolean formValido = true;
        
        //efetua a validação
        if(login == null || login.length() <= 3){
            req.setAttribute("msgErroLogin", "O login deve ter mais do 3 caracters");
            formValido = false;
        }
        
        if(perfil == null || perfil.equals("")){
            req.setAttribute("msgErroPerfil", "O perfil deve ser preenchido");
            formValido = false;
        }
        
        if(formValido){
            req.getRequestDispatcher("sucesso.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("form.jsp").forward(req, resp);
        }
        
    }

    
    
}
