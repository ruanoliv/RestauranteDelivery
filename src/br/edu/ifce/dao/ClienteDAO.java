package br.edu.ifce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Cliente;

public class ClienteDAO {
	
	public void adicionar(Cliente cliente) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	public void remove(Long id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		Cliente cliente = manager.find(Cliente.class, id);
		
		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	
	public void alterar (Cliente cliente) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();
		
	}
	
	public List<Cliente> list() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Cliente> clientes = manager.createQuery("select c from Cliente as c").getResultList();
		
		manager.close();
		fabrica.close();
		return clientes;
		
	}
}
