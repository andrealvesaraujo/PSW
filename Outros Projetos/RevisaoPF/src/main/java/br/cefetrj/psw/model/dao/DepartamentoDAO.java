/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.model.dao;

import br.cefetrj.psw.model.entity.Departamento;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Andre
 */
public class DepartamentoDAO extends GenericDAO<Departamento>{
    
    public DepartamentoDAO(Class t, EntityManager manager) {
        super(Departamento.class, PersistenceManager.getEntityManager());
    }
    public DepartamentoDAO() {
         super(Departamento.class, PersistenceManager.getEntityManager());
    }
   
    
    public List<String> buscarNomesDeDepartamentos(){
        String consulta = "SELECT d.nome FROM Departamento d";
        return (List<String>) manager.createQuery(consulta).getResultList();
    }
    
}
