package br.edu.ifce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Cliente;
import br.edu.ifce.model.Pedido;

public class PedidoDAO {
	
	public void adicionar(Pedido pedido) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(pedido);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	public void remove(Long id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		Pedido pedido = manager.find(Pedido.class, id);
		
		manager.getTransaction().begin();
		manager.remove(pedido);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	
	public void alterar (Pedido pedido) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(pedido);
		manager.getTransaction().commit();
		
	}
	
	public List<Pedido> list() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Pedido> pedidos = manager.createQuery("select p from Pedido as p").getResultList();
		
		manager.close();
		fabrica.close();
		return pedidos;
		
	}
}
