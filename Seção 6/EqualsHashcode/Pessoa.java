package EqualsHashcode;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public boolean equals(Object objeto) {

		if (objeto instanceof Pessoa) {
			Pessoa comparar = (Pessoa) objeto;
			boolean nomeObjeto = comparar.nome.equals(this.nome);
			boolean pesoObjeto = comparar.peso == this.peso;

			/*
			 * boolean nomeObjeto = comparar.nome == this.nome; boolean pesoObjeto =
			 * comparar.peso == this.peso;
			 */

			return nomeObjeto && pesoObjeto;
		} else {
			return false;
		}
	}
}
