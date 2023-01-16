package exemplo_worker;

import java.util.Date;

public class Contrato {
	String data;
	Double valorHora;
	int horas;
	public Contrato(String data, Double valorHora, int horas) {
		this.data = data;
		this.valorHora = valorHora;
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorHora*horas;
	}
	
}
