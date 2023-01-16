package cliente_compra;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private Cliente comprador;
	//não declarar variáveis classes, mas sim interfaces
	List<Item> itensComprados = new ArrayList<Item>();

	
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
