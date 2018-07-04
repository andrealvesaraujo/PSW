/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author Andre
 */
@Entity
public class Colaborador implements Serializable{

   

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column(name = "dataAdmissao", nullable = false) 
    @Temporal(TemporalType.DATE)
    private Date dataAdmissao;
    
    @Column(name = "dataDemissao", nullable = true) 
    @Temporal(TemporalType.DATE)
    private Date dataDemissao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Departamento departamento;
    
    public Colaborador(){
        
    }
    public Colaborador(Date ad,Date dem,Departamento dep){
        this.dataAdmissao=ad;
        this.dataDemissao=dem;
        this.departamento=dep;
    }
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the dataAdmissao
     */
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the dataDemissao
     */
    public Date getDataDemissao() {
        return dataDemissao;
    }

    /**
     * @param dataDemissao the dataDemissao to set
     */
    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
     /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}