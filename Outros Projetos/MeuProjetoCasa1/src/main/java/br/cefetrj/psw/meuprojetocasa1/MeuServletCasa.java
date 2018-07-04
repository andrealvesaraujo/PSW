/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.meuprojetocasa1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet(name = "MeuServletCasa", urlPatterns = {"/MeuServletCasa"})
public class MeuServletCasa extends HttpServlet {

    public MeuServletCasa(){
        System.out.println("construiu");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initiated");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter p = resp.getWriter();
        
        p.print("<h1>DOGETççççççTT</h1>");
       
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post");
    }
    
    @Override
    public void destroy() {
        System.out.println("DESTROIYER");
    }

   

}
