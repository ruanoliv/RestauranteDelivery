package br.edu.ifce.service;

import br.edu.ifce.dao.EnderecoDAO;
import br.edu.ifce.model.Endereco;

public class EnderecoService {
	private EnderecoDAO enderecoDAO = new EnderecoDAO();
	
	public void addEndereco(Endereco endereco) {
		enderecoDAO.adicionar(endereco);
	}
}
