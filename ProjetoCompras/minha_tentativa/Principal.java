package minha_tentativa;

public class Principal {

	public static void main(String[] args) {
		 Cliente cliente1 = new Cliente("Gabriel", "00000");
		 Compra compra1 = new Compra(cliente1);
		 compra1.comprar(new Item("Coca", 7.59, 2));
		 compra1.comprar(new Item("Leite", 4.39, 3));
		 Item banana = new Item("Banana", 3.99, 5);
		 compra1.comprar(banana);
		 
		for (Item itens: compra1.itensComprados) {
			System.out.println(itens.getNome());	
			}
		System.out.println(compra1.valorTotal());
		compra1.removerCompra(banana);
				
		for (Item itens: compra1.itensComprados) {
			System.out.println(itens.getNome());	
			}
		System.out.println(compra1.valorTotal());
	}

}
