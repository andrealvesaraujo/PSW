/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.aulaweb_02_04;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Diogo
 */
public class SelectPerfilTag extends SimpleTagSupport{

    private String perfilSelecionado;
    
    @Override
    public void doTag() throws JspException, IOException {
        String selectHtml = 
        "<select name='perfil'>" +
        "    <option value=''></option>" +
        "    <option value='aluno' " + ("aluno".equals(perfilSelecionado) ? "selected": "") +  " >Aluno</option>" +
        "    <option value='professor' " + ("professor".equals(perfilSelecionado)  ? "selected": "") + " >Professor</option>" +
        "</select>";
        getJspContext().getOut().print(selectHtml);
    }

    public String getPerfilSelecionado() {
        return perfilSelecionado;
    }

    public void setPerfilSelecionado(String perfilSelecionado) {
        this.perfilSelecionado = perfilSelecionado;
    }
    
    
    
}
