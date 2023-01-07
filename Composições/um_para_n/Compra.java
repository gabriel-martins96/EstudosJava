package um_para_n;

import java.util.ArrayList;

public class Compra {
	String pessoa;
	ArrayList<Itens> itensComprados = new ArrayList<>();
	double valorTotal;
	
	Compra (String pessoa) {
		this.pessoa = pessoa;
	}
	
	double getValorTotal() {
		for (Itens itens: itensComprados) {
			double valor = itens.quantidade * itens.valor;
			valorTotal += valor;
		} return valorTotal;
	}

}
