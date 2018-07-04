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
@WebServlet("/ValidarArtista")
public class ValidarArtista extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome=null;
        String banda=null;
        int anos=0;
        String estilo=null;
        
        
        boolean valido=true;
       // boolean preencher=true;//Campos vazios
        boolean ehNumero=true;
        
        
        try{
            Double.parseDouble(request.getParameter("nome"));

        }catch(NumberFormatException e){
            ehNumero = false;//Erro no campo nome quando recebe um numero

        } 
        if(!ehNumero){
            
            nome = request.getParameter("nome");

            
            if(request.getParameter("nome").equals("")){
                request.setAttribute("ObrigatorioNome","O nome artistico é obrigatorio");
                valido = false;
            }else{
                if((nome.length() > 30) || (null == nome)) {//Erro no campo nome quando tem menos de 10 letras

                    request.setAttribute("ErroNome", "O nome artistico tem que ter no maximo 30 letras");
                    valido = false;
                }
            }    
            request.setAttribute("nome", nome);
        }else{
            valido=false;
            request.setAttribute("ErroFormatoNome", "Nome Artistico não pode ter numeros.Ele apenas aceita texto");
        }    
        //Banda
        ehNumero=true;
        try{
            Double.parseDouble(request.getParameter("banda"));

        }catch(NumberFormatException e){
            ehNumero = false;//Erro no campo nome quando recebe um numero

        } 
        if(!ehNumero){
            
            banda = request.getParameter("banda");

            
           
            if((banda.length() > 40) || (null == banda)) {//Erro no campo nome quando tem menos de 10 letras

                request.setAttribute("ErroBanda", "A banda tem que ter no maximo 30 letras");
                valido = false;
            }
                
            request.setAttribute("banda", banda);
        }else{
            valido=false;
            request.setAttribute("ErroFormatoBanda", "A banda não pode ter numeros.Ele apenas aceita texto");
        }
        //Anos
        if(!request.getParameter("anos").equals("")){
            try{
                   anos = Integer.parseInt(request.getParameter("anos"));
                   request.setAttribute("anos", anos);
                   
                    if(anos < 0 || anos >99){

                           request.setAttribute("ErroAnos", "Anos de Carreira tem que ser no maximo 99");
                           valido = false;
                    }
                       
           }catch(NumberFormatException e){
                       valido=false;
                       request.setAttribute("ErroFormatoAnos", "Anos não pode ter letras.Ele apenas aceita numeros.");
           }   
        
        }else{
            request.setAttribute("ObrigatorioAnos","Anos de Carreira é obrigatorio");
            valido=false;
        }
        
        //Estilo select
        estilo = request.getParameter("estilo");
        request.setAttribute("estilo", estilo);
        
        //ID
        
        
        if(valido){
            ServletContext sc = request.getServletContext(); 
        
            Artista A = new Artista();
            A.setNome(nome);
            A.setBanda(banda);
            A.setAnos(anos);
            A.setEstilo(estilo);
            
            
            if(sc.getAttribute("ListaArtistas")==null)
            {
                ArrayList<Artista> tabelaAlunos = new <Artista>ArrayList();
                tabelaAlunos.add(A);
                sc.setAttribute("ListaArtistas", tabelaAlunos);
            }else{
                ArrayList<Artista> tabelaAlunos = (ArrayList<Artista>) sc.getAttribute("ListaArtistas");
                tabelaAlunos.add(A);
                sc.setAttribute("ListaArtistas", tabelaAlunos);
            }
            
            request.getRequestDispatcher("ListarArtistas.jsp").forward(request, response);
            
        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
              
        }
        
          
    }
    
    
}
