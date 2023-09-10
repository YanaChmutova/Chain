
public class MainEmployee {

	public static void main(String[] args) {
		SalaryEmployee s1 = new SalaryEmployee(1257, "John", 40, 5000);
		SalaryEmployee s2 = new SalaryEmployee(1857, "Jane", 36, 6000);
		WageEmployee w1 = new WageEmployee(1853, "Mike", 29, 39, 40);
		WageEmployee w2 = new WageEmployee(1033, "Sarah", 39, 42, 35);
		Manager m1 = new Manager(2368, "David", 27, 2000, 10);
		Manager m2 = new Manager(8368, "Emily", 42, 3050, 15);
		Employee[] employees = new Employee [10];
		employees[0] = s1;
		employees[1] = s2;
		employees[2] = w1;
		employees[3] = w2;
		employees[4] = m1;
		employees[5] = m2;
	
		printSuperAdv(employees);
	}
	public static void print(Employee[] e) {
		for(int i = 0; e[i] !=null; i++) {
			System.out.println("Employee"+ (i+1) + " " + e[i].calcSalary());
		}
		//Create method public static void print(Employee[] employees) in class MainEmployee
		//Display on console your array and employee's salaries using method print in format:
	}
	public static void printAdv(Employee[] e) {
		for(int i = 0; e[i] !=null; i++) {
			System.out.println("Employee"+ (i+1) + " " + e[i].calcSalary());
		}
		System.out.println("----------------------------------");
		double total = 0;
		for(int i = 0; e[i] != null; i++) {
			total+=e[i].calcSalary();
		}
		System.out.println("total salary: " + total); // + sumSalary
		//Display on console your array and sum of salaries using method printAdv in format:
		//total salary: sum salaries for employees
	}
	public static void printSuperAdv(Employee[] e) {
		for(int i = 0; e[i] !=null; i++) {
			System.out.println("Employee"+ (i+1) + " " + e[i].calcSalary());
		}
		System.out.println("----------------------------------");
		double total = 0;
		for(int i = 0; e[i] != null; i++) {
			total+=e[i].calcSalary();
		}
		System.out.println("total salary: " + total);
		char sum = 0;
		for(int i = 0; e[i] != null; i++) {
			sum+=1;
		}
		double average = total/sum;
		System.out.println("average salary: " + average);// + averageSalary

	
	}
//	public static void printSuperAdv(Employee[] e) {
//		double averageSalary = 0, totalSalary = 0;
//		
//		for(int i = 0; e[i] != null; i++) {
//			System.out.println("Employee" + (i + 1) + " " + e[i].calcSalary());
//			totalSalary += e[i].calcSalary();
//			averageSalary++;
//		}
//		System.out.println("Total salary is " + totalSalary);
//		System.out.printf("Average salary is %.2f", totalSalary / averageSalary);
//	}
}
