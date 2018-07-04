/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Andre
 */
@Entity
public class Departamento implements Serializable{

    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(name = "nome", nullable = false) 
    private String nome;
    
    @OneToMany(mappedBy = "departamento",fetch = FetchType.EAGER)
    private List<Colaborador> colaborador;
    public Departamento(){
        
    }
    
    public Departamento(String nome,List<Colaborador> c){
        this.nome=nome;
        this.colaborador=c;
    }
    /**
     * @return the colaborador
     */
    public List<Colaborador> getColaborador() {
        return colaborador;
    }

    /**
     * @param colaborador the colaborador to set
     */
    public void setColaborador(List<Colaborador> colaborador) {
        this.colaborador = colaborador;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
