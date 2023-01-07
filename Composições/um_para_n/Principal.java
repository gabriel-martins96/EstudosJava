package um_para_n;

public class Principal {
	public static void main(String[] args) {
		Itens caneta = new Itens("Caneta", 5, 5.20);
		Compra compra1 = new Compra("Gabriel");
		
		compra1.itensComprados.add(caneta);
		compra1.itensComprados.add(new Itens("Lápis", 2, 1.99));
		compra1.itensComprados.add(new Itens("Borracha", 1, 3.99));
		System.out.println(compra1.getValorTotal());
	}
}
