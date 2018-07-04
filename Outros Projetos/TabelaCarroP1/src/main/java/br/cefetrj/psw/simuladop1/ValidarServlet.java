/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.simuladop1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet("/ValidarServlet")
public class ValidarServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String marca=null;
        String modelo=null;
        int anos=0;
        String cor=null;


        boolean valido=true;
       // boolean preencher=true;//Campos vazios
        boolean ehNumero=true;


        try{
            Double.parseDouble(request.getParameter("marca"));

        }catch(NumberFormatException e){
            ehNumero = false;//Erro no campo nome quando recebe um numero

        } 
        if(!ehNumero){

            marca = request.getParameter("marca");


            if(request.getParameter("marca").equals("")){
                request.setAttribute("ObrigatorioMarca","A marca é obrigatoria");
                valido = false;
            }else{
                if((marca.length() > 40) || (null == marca)) {//Erro no campo nome quando tem menos de 10 letras

                    request.setAttribute("ErroMarca", "A marca tem que ter no maximo 40 letras");
                    valido = false;
                }
            }    
            request.setAttribute("marca", marca);
        }else{
            valido=false;
            request.setAttribute("ErroFormatoMarca", "Marca não pode ter numeros.Ele apenas aceita texto");
        }    
        //Modelo
        ehNumero=true;
        try{
            Double.parseDouble(request.getParameter("modelo"));

        }catch(NumberFormatException e){
            ehNumero = false;//Erro no campo nome quando recebe um numero

        } 
        if(!ehNumero){

            modelo = request.getParameter("modelo");


            if(request.getParameter("modelo").equals("")){
                request.setAttribute("ObrigatorioModelo","O modelo é obrigatorio");
                valido = false;
            }else{
                if((modelo.length() > 30) || (null == modelo)) {//Erro no campo nome quando tem menos de 10 letras

                    request.setAttribute("ErroModelo", "O modelo tem que ter no maximo 30 letras");
                    valido = false;
                }
            }    
            request.setAttribute("modelo", modelo);
        }else{
            valido=false;
            request.setAttribute("ErroFormatoModelo", "O modelo não pode ter numeros.Ele apenas aceita texto");
        }  
        //Anos
        if(!request.getParameter("anos").equals("")){
            try{
                   anos = Integer.parseInt(request.getParameter("anos"));
                   request.setAttribute("anos", anos);

                    if(anos < 1000 || anos >=10000){

                           request.setAttribute("ErroAnos", "Anos de Carreira tem que ter exatamente 4 digitos");
                           valido = false;
                    }

           }catch(NumberFormatException e){
                       valido=false;
                       request.setAttribute("ErroFormatoAnos", "Anos não pode ter letras.Ele apenas aceita numeros.");
           }   

        }

        //Estilo select
        cor = request.getParameter("cor");
        request.setAttribute("cor", cor);
        

            //UTILIZANDO O HTTPSESSION
            if(valido){
                HttpSession sess = request.getSession(); 

                Carro A = new Carro();
                A.setMarca(marca);
                A.setModelo(modelo);
                A.setAnos(anos);
                A.setCor(cor);


                if(sess.getAttribute("ListaCarros")==null)
                {
                    ArrayList<Carro> tabelaCarros = new <Carro>ArrayList();
                    tabelaCarros.add(A);
                    sess.setAttribute("ListaCarros", tabelaCarros);
                }else{
                    ArrayList<Carro> tabelaCarros = (ArrayList<Carro>) sess.getAttribute("ListaCarros");
                    tabelaCarros.add(A);
                    sess.setAttribute("ListaCarros", tabelaCarros);
                }
                request.setAttribute("msg","Carro cadastrado com sucesso.");
                request.getRequestDispatcher("Tabela.jsp").forward(request, response);
                

            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);

            }


    }

    
}
    
