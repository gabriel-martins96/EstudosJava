package exemplo_worker;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario(new Departamento("Direito"),"Maria do Carmo", Level.PLENO, 6000.00);
		func1.adicionarContrato(new Contrato ("15/01/2023", 125.69, 50));
		System.out.println( func1.ganhoTotal(2023, 01));
		
		for (Contrato contrato: func1.contratos) {
			System.out.println(contrato.valorTotal());
		}
	}

}
