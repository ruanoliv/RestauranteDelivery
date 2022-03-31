package br.edu.ifce.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@Column(name="pedido_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="prato_id")
	private Prato pratos;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Prato getPratos() {
		return pratos;
	}
	public void setPratos(Prato pratos) {
		this.pratos = pratos;
	}
	
	
}
