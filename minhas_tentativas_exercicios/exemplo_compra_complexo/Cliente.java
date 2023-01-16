package exemplo_compra_complexo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> listaCompras = new ArrayList();
	
	Cliente (String nome){
		this.nome = nome;
	}
	void adicionarCompra(Compra compra) {
		this.listaCompras.add(compra);
	}
	
	double valorTotal() {
		double soma = 0;
		//Aqui a soma é feita pela chamada do método valorTotal em cada repetição
		for (Compra compras: listaCompras) {
			soma += compras.valorTotal();
		}
		return soma;
	}
}
