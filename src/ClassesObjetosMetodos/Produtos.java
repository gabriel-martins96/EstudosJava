package ClassesObjetosMetodos;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Produtos {
	private String nome;
	private double valor;
	static double desconto = 0.25;

	public Produtos(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	// Metodos:
	String calcularDesconto() {
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.UP);
		double calculoDesconto = valor * (1 - desconto);
		String valorFinal = ("O valor final é R$ " + df.format(calculoDesconto));
		return valorFinal;
	}

}
