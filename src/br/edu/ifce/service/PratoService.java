package br.edu.ifce.service;

import java.util.List;

import br.edu.ifce.dao.PratoDAO;
import br.edu.ifce.model.Prato;

public class PratoService {
	private static PratoDAO pratoDAO = new PratoDAO();
	
	public void addPrato(Prato prato) {
		pratoDAO.adicionar(prato);
	}
	public void removerPrato(Long id) {
		pratoDAO.remove(id);
	}
	public void alterarPrato(Prato prato) {
		pratoDAO.alterar(prato);
	}
	public static List<Prato> listarPratos() {
		return pratoDAO.list();
	}
	public static List<Prato> buscarPorNome(String nome) {
		return pratoDAO.buscarPorNome(nome);
	}
}
