/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.model.dao;

import br.cefetrj.psw.model.entity.Aluno;

/**
 *
 * @author Andre
 */
public class AlunoDAO extends GenericDAO<Aluno>{
    
    public AlunoDAO() {
        super(Aluno.class, PersistenceManager.getEntityManager());
    }
    
    
}
