/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.aulaweb_26_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author diogo
 */
@WebServlet("/HelloServlet26_03")
public class HelloServlet26_03 extends HttpServlet {

    public HelloServlet26_03(){
        System.out.println("construtor");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pr = resp.getWriter();
        pr.print("<h1>doGet 123</h1>");
        
        //Primeira vez
        if(req.getServletContext().getAttribute("lista") == null){
            ArrayList<String> lista = new ArrayList<>();
            req.getServletContext().setAttribute("lista", lista);
        }
        
        //Outras
        ArrayList<String> lista = (ArrayList)req.getServletContext().getAttribute("lista");
        lista.add("Um elemento");
        
        //printa todos
        for (String s : lista) {
            resp.getWriter().print(s + "<br>");
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        System.out.println("recebeu POST");    
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    
    


}
