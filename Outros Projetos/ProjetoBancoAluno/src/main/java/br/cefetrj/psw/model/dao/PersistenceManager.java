package br.cefetrj.psw.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Implementação do encapsulamento da persistência
 * conforme mostrado nas aulas
 * @author paducantuaria
 * @since 1.0
 */
public class PersistenceManager {
	
	private static EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("AlunoPU");
	private static EntityManager manager = factory.createEntityManager();
	
	static EntityManager getEntityManager(){
		return manager;
	}
	
	
	public static <T> GenericDAO<T> createGenericDAO(Class<T> t) {
		return new GenericDAO<T>(t, manager);
	}
	
	public static EntityTransaction getTransaction(){
		return manager.getTransaction();
	}
        public static void Termino(){
                manager.close();
                factory.close();   
        }    
}
