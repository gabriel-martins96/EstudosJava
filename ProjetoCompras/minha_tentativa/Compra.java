package minha_tentativa;

import java.util.ArrayList;

public class Compra {
	private Cliente comprador;
	ArrayList<Item> itensComprados = new ArrayList();

	
	public Compra(Cliente comprador, ArrayList<Item> itensComprados) {
		this.comprador = comprador;
		this.itensComprados = itensComprados;
	}

	public Compra(Cliente cliente1) {
		// TODO Auto-generated constructor stub
	}

	public void comprar(Item item) {
		itensComprados.add(item);
		}

	public void removerCompra(Item item) {
		itensComprados.remove(item);
	}
	public double valorTotal() {
		double valorTotal = 0;
		for (Item itens: itensComprados) {
			valorTotal += itens.getQuantidade() * itens.getValor();
		}
		return valorTotal;
	}
}
