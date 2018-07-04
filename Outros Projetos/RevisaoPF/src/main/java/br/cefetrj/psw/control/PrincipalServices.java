/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.control;

import br.cefetrj.psw.model.dao.DepartamentoDAO;
import br.cefetrj.psw.model.dao.GenericDAO;
import br.cefetrj.psw.model.dao.PersistenceManager;
import br.cefetrj.psw.model.entity.Colaborador;
import br.cefetrj.psw.model.entity.Departamento;
import br.cefetrj.psw.view.utils.Relatorio;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Andre
 */
public class PrincipalServices {
  
    public static List<String> encaminharNomeDepartamento(){
        DepartamentoDAO depDao = new DepartamentoDAO();
        try {
            return depDao.buscarNomesDeDepartamentos();
        } catch (Exception e) {
            System.out.println("ERROU no buscarNOmesDepartamento");
            return null;
        }
    }
    public static List<Departamento> listarDepartamento(){
		GenericDAO<Departamento> departamentoDao = PersistenceManager.createGenericDAO(Departamento.class);
		return departamentoDao.buscarTodos();
    }
    public static List<Colaborador> listarColaborador(){
            GenericDAO<Colaborador> colaboradorDao = PersistenceManager.createGenericDAO(Colaborador.class);
            return colaboradorDao.buscarTodos();
    }
    public static List<Relatorio> contarContratadosEDemitidos(){
        List<Relatorio> relatorios = new ArrayList<Relatorio>();
        GenericDAO<Colaborador> colaboradorDao = PersistenceManager.createGenericDAO(Colaborador.class);
        List<Colaborador> colaboradores = colaboradorDao.buscarTodos();
        for(Colaborador c:colaboradores){
            Relatorio r = new Relatorio();
            r.setNomeDepartamento(c.getDepartamento().getNome());
            if(!relatorios.isEmpty()){
                if(relatorios.contains(r)){
                    int indice = relatorios.indexOf(r);
                    r = relatorios.get(indice);
                    
                    if(c.getDataDemissao()==null){
                        r.incrementarContratados();
                    }else{
                        r.incrementarDemitidos();
                    }
                    relatorios.set(indice, r);
                }else{
                    if(c.getDataDemissao()==null){
                        r.incrementarContratados();
                    }else{
                        r.incrementarDemitidos();
                    }
                    relatorios.add(r);
                }
            }else{
                if(c.getDataDemissao()==null){
                    r.incrementarContratados();
                }else{
                    r.incrementarDemitidos();
                }
                relatorios.add(r);
            }
            
        }
        return relatorios;
    }
}
