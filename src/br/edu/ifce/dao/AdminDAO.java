package br.edu.ifce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.model.Admin;
import br.edu.ifce.model.Prato;


public class AdminDAO {
	
	public void adicionar(Admin admin) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(admin);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	public Admin buscarPorLogin(String login) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		Admin admin = manager.find(Admin.class, login);
		
		manager.close();
		fabrica.close();
		
		return admin;
	}
}
