/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.model.dao;

import br.cefetrj.psw.model.entity.Colaborador;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Andre
 */
public class ColaboradorDAO extends GenericDAO<Colaborador>{
    
     public ColaboradorDAO(Class t, EntityManager manager) {
        super(Colaborador.class, PersistenceManager.getEntityManager());
    }
    public ColaboradorDAO() {
         super(Colaborador.class, PersistenceManager.getEntityManager());
    }
    
}
