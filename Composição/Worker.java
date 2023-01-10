import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
private String name;
private WorkerLevel level;
private double baseSalary;

//Aqui começa a composição
//um worker tem um deparment
private Department deparment;
//um para n, ou Worker tem vários contratos -> ArrayList
private List<HourContract> contracts = new ArrayList<>(); //Por padrão a lista deve ser instanciada

//Criar construtor sem estar selecionado o ArrayList
public Worker(String name, WorkerLevel level, double baseSalary, Department deparment) {
	this.name = name;
	this.level = level;
	this.baseSalary = baseSalary;
	this.deparment = deparment;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public WorkerLevel getLevel() {
	return level;
}

public void setLevel(WorkerLevel level) {
	this.level = level;
}

public double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

public Department getDeparment() {
	return deparment;
}

public void setDeparment(Department deparment) {
	this.deparment = deparment;
}

public List<HourContract> getContracts() {
	return contracts;
}
/* Aqui não posso permitir, é a lista que inicia com o construtor que deve ser usada, usando os métodos os métodos de add e remover
 * não posso permitir que essa lista seja trocada.
public void setContracts(List<HourContract> contracts) {
	this.contracts = contracts;
}*/

//Esse método vai adicionar um item a minha lista que foi criada em cima como atributo
public void addContract(HourContract contract) {
	contracts.add(contract);
}

public void removeContract(HourContract contract) {
	contracts.remove(contract);
}

public double income(int year, int month) {
	double soma = baseSalary;
	//Agora preciso percorrer a lista desse worker e testar se ano e mes batem com o solicitado
	for (HourContract c: contracts) {
		Calendar cal = Calendar.getInstance(); //Crio uma variável para atribuir a data do contract
		cal.setTime(c.getDate());  //Aqui atribuo ao cal o date da lista
		int c_year = cal.get(Calendar.YEAR);
		int c_month = cal.get(Calendar.MONTH) + 1; //Começa com zero, preciso adicionar +1
		if(c_year == year && c_month == month) {
			soma += c.totalValue();
		}
	}
	return soma;
}
}
