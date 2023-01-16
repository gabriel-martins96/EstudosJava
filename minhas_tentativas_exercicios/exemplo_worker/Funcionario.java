package exemplo_worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
	Departamento departamento;
	String nome;
	Level level;
	double salarioBase;
	List<Contrato> contratos = new ArrayList();

	public Funcionario(Departamento departamento, String nome, Level level, double salarioBase) {
		this.departamento = departamento;
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
	}
		
	
	void adicionarContrato(Contrato contrato) {
		this.contratos.add(contrato);
	}
	
	void removerContrato (Contrato contrato) {
		this.contratos.remove(contrato);
	}
	
	DateTimeFormatter msc = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	double ganhoTotal(int ano, int mes) {
		double ganhoTotal = salarioBase;
		LocalDate datateste = LocalDate.now();
		for (Contrato contrato: contratos) {
			datateste = datateste.parse(contrato.data, msc);
			int mesComp = datateste.getMonthValue();
			int anoComp = datateste.getYear();
			if (mes == mesComp && ano == anoComp) {
				ganhoTotal += contrato.valorTotal();
			}
		}		
		return ganhoTotal;
	}
}
