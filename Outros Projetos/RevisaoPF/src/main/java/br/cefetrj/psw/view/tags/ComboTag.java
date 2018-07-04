package br.cefetrj.psw.view.tags;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.cefetrj.psw.control.PrincipalServices;
import br.cefetrj.psw.model.entity.Colaborador;
import br.cefetrj.psw.model.entity.Departamento;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Classe exemplo de tag customizada
 * @author Andre
 */
public class ComboTag extends SimpleTagSupport{

    
    /**
     * Metodo que realiza uma tag cujo resultado é criar uma janela de escolha entre duas materias:matematica ou geografia. 
     * @author André
     * @throws JspException exceção sobre as JSP
     * @throws IOException exceção sobre IO
     */
    
    @Override
    public void doTag() throws JspException, IOException {
        List<Departamento> dep = PrincipalServices.listarDepartamento();
        String x="";
        String tudo="<select class='form-control' name='nomeDepartamentos'> ";
           
        for(Departamento d:dep){
            x = x + "<option value="+d.getNome()+">"+d.getNome()+"</option>";
        }
        //"    <option value='Matematica' " + ("Matematica".equals(materia) ? "selected": "") +  " >Matematica</option>" +
       
        String selectHtml = tudo + x + "</select>";
       
        
        getJspContext().getOut().print(selectHtml);
        
        
    }
}
