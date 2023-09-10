
public class SalaryEmployee extends Employee {
	private double salary;
	public SalaryEmployee() {}
	public SalaryEmployee(int id, String name, int age, double salary) {
		super(id, name, age);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public double calcSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return super.toString() + salary;
	}
}
/*
class SalaryEmployee extends Employee:
    private double salary;
    Add constructor by all fields 
    Add Getter for salary;
    Make override methods:
    public double calcSalary(); // should return salary
    public String toString(); //should return String from super class with salary
*/