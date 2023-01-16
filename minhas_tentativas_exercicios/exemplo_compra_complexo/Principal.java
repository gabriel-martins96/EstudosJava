package exemplo_compra_complexo;

public class Principal {
		public static void main(String[] args) {
			Cliente cliente1 = new Cliente("Gabriel");
			
			//Criando compra 1º:
			Compra compra1 = new Compra();
			Compra compra2 = new Compra();
			compra1.adicionarItem(3, new Produto("Caderno", 12.99));
			compra1.adicionarItem(1, new Produto("Caneta", 5.99));
			 
			compra2.adicionarItem(3, new Produto("Caderno", 12.99));
			compra2.adicionarItem(3, new Produto("Caderno", 12.99));
			
			//Adicianando compra ao cliente:
			cliente1.adicionarCompra(compra1);
			cliente1.adicionarCompra(compra2);
			
			//Total:
			System.out.println(cliente1.valorTotal());
			
		}
}
