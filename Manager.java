
public class Manager extends SalaryEmployee {
	private double bonuses;
	
	public Manager() {}
	public Manager(int id, String name, int age, double salary, double bonuses) {
		super(id, name, age, salary);
		this.bonuses = bonuses;
	}
	public double getBonuses() {
		return bonuses;
	}
	@Override
	public double calcSalary() {
		//             salary              salary
		return super.calcSalary() + super.getSalary() * bonuses;
	}
	@Override
	public String toString() {
		return super.toString() + " " + calcSalary();
	}
}
/*
class Manager extends SalaryEmployee:
    private double bonuses;
    Add constructor by all fields 
    Add Getter for bonuses;
    Make override methods:
    public double calcSalary(); // should return salary + salary * bonuses
    public String toString(); //should return String from super class with salary + salary * bonuses
*/