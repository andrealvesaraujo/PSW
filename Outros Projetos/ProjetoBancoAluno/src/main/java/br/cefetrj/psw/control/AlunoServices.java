/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.control;

import br.cefetrj.psw.model.dao.GenericDAO;
import br.cefetrj.psw.model.dao.PersistenceManager;
import br.cefetrj.psw.model.entity.Aluno;
import java.util.List;


/**
 *
 * @author Andre
 */
public class AlunoServices {
    public static void incluirAluno(Aluno aluno){
       try{
           PersistenceManager.getTransaction().begin();
           GenericDAO<Aluno> alunoDAO = PersistenceManager.createGenericDAO(Aluno.class);
           alunoDAO.incluir(aluno);
           PersistenceManager.getTransaction().commit();
           
       }catch(Exception e){
          
           e.printStackTrace();
           PersistenceManager.getTransaction().rollback();
       }
    }   
    public static List<Aluno> buscarListaDeAlunos(){
    
        GenericDAO<Aluno> alunoDAO = PersistenceManager.createGenericDAO(Aluno.class);
        return alunoDAO.buscarTodos();
        
    }
}
