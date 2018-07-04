/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.view.padrao;

import br.cefetrj.psw.control.PrincipalServices;
import br.cefetrj.psw.model.entity.Colaborador;
import br.cefetrj.psw.model.entity.Departamento;
import br.cefetrj.psw.view.utils.Relatorio;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
        
        String dataInicial = req.getParameter("DataInicial");
        String dataFinal  = req.getParameter("DataFinal");
        System.out.println(dataInicial +"        "+dataFinal);
        
        boolean isValid=true;
        Date inicial=null;
        Date fim=null;
        
        String inicialMsg="";
        inicialMsg=validaObrigatorio(dataInicial);
        if(inicialMsg.trim().isEmpty()){
            inicialMsg=validaDate(dataInicial);
            if(inicialMsg.trim().isEmpty()){
                try{
                    SimpleDateFormat format=null;
                    format = new SimpleDateFormat("dd/MM/yyyy");
                    inicial = format.parse(dataInicial);
                    req.setAttribute("DataInicial", dataInicial);

                }catch (Exception e) {    
                        isValid = false;
                }
            }else{
                isValid=false;
                req.setAttribute("dataInicialMsg", inicialMsg);
            }    
        }else{
            isValid=false;
            req.setAttribute("dataInicialMsg", inicialMsg);
        }
        
        String finalMsg="";
        finalMsg=validaObrigatorio(dataFinal);
        if(finalMsg.trim().isEmpty()){
            finalMsg=validaDate(dataFinal);
            if(finalMsg.trim().isEmpty()){
                try{
                    SimpleDateFormat format=null;
                    format = new SimpleDateFormat("dd/MM/yyyy");
                    fim = format.parse(dataFinal);
                    req.setAttribute("DataFinal", dataFinal);

                }catch (Exception e) {    
                        isValid = false;
                }
            }else{
                isValid=false;
                req.setAttribute("dataFinalMsg", finalMsg);
            }    
        }else{
            isValid=false;
            req.setAttribute("dataFinalMsg", finalMsg);
        }
        
        String periodoMsg="";
        periodoMsg=validaDatas(inicial, fim);
        if(!periodoMsg.trim().isEmpty()){
            isValid=false;
            req.setAttribute("periodoMsg", periodoMsg);
        }
        if(isValid){
            System.out.println("Valido");
            //ToDo Utlizar as datas do filtro
            List<Relatorio> listaRelatorio = PrincipalServices.contarContratadosEDemitidos();
            for(Relatorio r:listaRelatorio){
                System.out.println(r);
            }
            req.setAttribute("listaRelatorio", listaRelatorio);
            
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
            
        }else{
            System.out.println("Não valido");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
    public static String validaDatas(Date dataInicio, Date dataFim) {
        
        String msg = "";
        
        if(dataInicio!=null && dataFim!=null){
            if (dataInicio.compareTo(dataFim) > 0) {
                msg = "Erro:Data inicial não pode ser maior que final";
            }
        }  
        return msg;
    }
    public static String validaObrigatorio(String param) {
        String msg = "";
        if (param == null || param.trim().isEmpty()) {
            msg = "Campo acima é obrigatorio";
        }
        return msg;
    }
    public static String validaDate(String param) {
        String msg = "";

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            @SuppressWarnings("unused")
            Date dataFormatada = format.parse(param);
        } catch (Exception e) {
            
            msg = "Data está no formato invalido.Formato correto e valido é dd/mm/yyyy";
        }
        return msg;
    }

}
