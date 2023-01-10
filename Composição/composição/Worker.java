package composição;

public class Worker {
private String name;
private WorkerLevel level;
private double baseSalary;
public Worker(String name, WorkerLevel level, double baseSalary) {
	this.name = name;
	this.level = level;
	this.baseSalary = baseSalary;
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

public void addContract (HourContract contract) {
	
}

public void removeContract(HourContract contract) {
	
}

}
