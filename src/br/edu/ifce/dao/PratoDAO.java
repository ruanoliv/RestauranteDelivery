package br.edu.ifce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Prato;

public class PratoDAO {
	public void adicionar(Prato prato) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(prato);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	public void remove(Long id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		Prato prato = manager.find(Prato.class, id);
		
		manager.getTransaction().begin();
		manager.remove(prato);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	
	public void alterar (Prato prato) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(prato);
		manager.getTransaction().commit();
		
	}
	
	public List<Prato> list() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Prato> pratos = manager.createQuery("select p from Prato as p").getResultList();
		
		manager.close();
		fabrica.close();
		return pratos;
		
	}

	public List<Prato> buscarPorNome(String nome) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Prato> pratos = manager.createQuery("select p from Prato p where p.nome = :nome").setParameter("nome", nome).getResultList();
		
		fabrica.close();
		manager.close();
		return pratos;
		
	}
}
