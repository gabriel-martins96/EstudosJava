import java.util.Date;

public class HourContract {
private Date date;
private double valuePerHour;
private Integer hours;

//Construtor
public HourContract() {
}

public HourContract(Date date, double valuePerHour, Integer hours) {
	this.date = date;
	this.valuePerHour = valuePerHour;
	this.hours = hours;
}

//Getter e Setter
public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public double getValuePerHour() {
	return valuePerHour;
}




public void setValuePerHour(double valuePerHour) {
	this.valuePerHour = valuePerHour;
}

public Integer getHours() {
	return hours;
}


public void setHours(Integer hours) {
	this.hours = hours;
}

//Metodo para obter valor total à pagar
public double totalValue() {
	 return valuePerHour * hours;
}

}
