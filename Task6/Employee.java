public class Employee {

	String name, address;
	int yoj;

	Employee(String name, int yoj, String address) {
		this.name = name;
		this.yoj = yoj;
		this.address = address;
	}

	void printInfo() {
		
		System.out.println(name+"\t" +yoj +"\t\t" +address);
	}

	public static void main(String args[]) {

		Employee e1 = new Employee("Robert", 1994, "64C- Walls Streat");
		Employee e2 = new Employee("Sam", 2000, "68D- Walls Streat");
		Employee e3 = new Employee("John", 1999, "26B- Walls Streat");
		System.out.println("Name\tYearofJoining\tAddress");
		e1.printInfo();
		e2.printInfo();
		e3.printInfo();
	}
}