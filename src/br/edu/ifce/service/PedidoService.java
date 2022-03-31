package br.edu.ifce.service;

import br.edu.ifce.dao.PedidoDAO;
import br.edu.ifce.model.Pedido;

public class PedidoService {
	PedidoDAO pedidoDAO = new PedidoDAO();
	
	public void addPedido(Pedido pedido) {
		pedidoDAO.adicionar(pedido);
	}
	public void removerPedido(Long id) {
		pedidoDAO.remove(id);
	}
	public void alterarPedido(Pedido pedido) {
		pedidoDAO.alterar(pedido);
	}
	public void listarPedido() {
		pedidoDAO.list();
	}
}
