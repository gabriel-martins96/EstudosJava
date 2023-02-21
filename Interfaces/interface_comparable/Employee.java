package interface_comparable;

public class Employee implements Comparable<Employee> {
	private String name;
	private Double salary;
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Esse método serve para comparar objetos, no exercício vamos comparar os nomes:
	@Override
	public int compareTo(Employee other) {
		return this.salary.compareTo(other.getSalary());
	}
	@Override
	public String toString() {
		return "Employee's name: " + name + " , salary = " + salary;
	}
	
	
}
