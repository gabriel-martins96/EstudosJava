package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
private LocalDate dataParcela;
private Double valor;
static private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
public Parcelas(LocalDate dataParcela, Double valor) {
	this.dataParcela = dataParcela;
	this.valor = valor;
}
public LocalDate getDataParcela() {
	return dataParcela;
}
public void setDataParcela(LocalDate dataParcela) {
	this.dataParcela = dataParcela;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
@Override
public String toString() {
	return  dataParcela.format(fmt) + " - " + valor;
}


}
