package ClassesObjetosMetodos;

public class ProdutosTeste {

	public static void main(String[] args) {
		Produtos produto1 = new Produtos("Coca", 7.89);
		System.out.println(produto1.calcularDesconto());
		System.out.println(Produtos.desconto);
	}

}
