package ClassesObjetosMetodos;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Produtos {
	private String nome;
	private double valor;
	private double desconto;

	public Produtos(String nome, double valor, double desconto) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
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

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
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
