package br.edu.ifce.service;

import java.util.List;

import br.edu.ifce.dao.ClienteDAO;
import br.edu.ifce.model.Cliente;

public class ClienteService {
	private static ClienteDAO clienteDAO = new ClienteDAO();
	
	public void addCliente(Cliente cliente) {
		clienteDAO.adicionar(cliente);
	}
	public void removeCliente(Long id) {
		clienteDAO.remove(id);
	}
	public void alterarCliente(Cliente cliente) {
		clienteDAO.alterar(cliente);
	}
	public static List<Cliente> listarClientes(){
		return clienteDAO.list();
	}
}
