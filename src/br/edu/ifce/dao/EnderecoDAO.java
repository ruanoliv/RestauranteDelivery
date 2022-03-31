package br.edu.ifce.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Endereco;


public class EnderecoDAO {
	
	public void adicionar(Endereco endereco) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(endereco);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	
	public void alterar (Endereco endereco) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(endereco);
		manager.getTransaction().commit();
		
	}
}
