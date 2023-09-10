
public class WageEmployee extends Employee {
	private double hourPrice;
	private int hours;
	
	public WageEmployee() {}
	public WageEmployee(int id, String name, int age, double hourPrice, int hours) {
		super(id, name, age);
		this.hourPrice = hourPrice;
		this.hours = hours;
	}
	public double getHourPrice() {
		return hourPrice;
	}
	public int getHours() {
		return hours;
	}
	@Override
	public double calcSalary() {
		return hours * hourPrice;
	}
	@Override
	public String toString() {
		return super.toString() + " " + calcSalary();
	}
}
/*

class WageEmployee extends Employee:
    private double hourPrice;
    private int hours
    Add constructor by all fields 
    Add Getters for hourPrice and hours;
    Make override methods:
    public double calcSalary(); // should return hours * hourPrice
    public String toString(); //should return String from super class with hours * hourPrice
*/