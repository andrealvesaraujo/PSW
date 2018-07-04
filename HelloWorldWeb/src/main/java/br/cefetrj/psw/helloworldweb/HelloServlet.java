/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.helloworldweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    public HelloServlet(){
        System.out.println("construtor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }
    
    
    /*Serviço geral
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service1");
        System.out.println("service2");
    
    }
    */
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pr = resp.getWriter();
        pr.print("doGet Açççô");
        pr.print("<h1>doGet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("foi Post");
    }
    
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    


}
