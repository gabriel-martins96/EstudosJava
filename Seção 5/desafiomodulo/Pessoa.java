package desafiomodulo;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer (Comida comida1, Comida comida2) {
		this.peso += (comida1.peso / 1000) + (comida2.peso /1000);
		return this.peso;
	}
}
