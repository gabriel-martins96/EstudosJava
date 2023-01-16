package exemplo_compra_complexo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	Cliente cliente;
	List<Item> listaItens = new ArrayList();
	
	void adicionarItem (int quantidade, Produto produto){
		this.listaItens.add(new Item(quantidade, produto));
	}
	void removerItem(Item item) {
		this.listaItens.remove(item);
	}
	
	double valorTotal () {
		double soma = 0;
		for(Item item: listaItens) {
			soma+= item.quantidade * item.produto.valor;
		}
		return soma;
	}
}
