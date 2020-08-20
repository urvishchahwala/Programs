public class AddAmount {

	static int amount = 50;
	static int count = 0;

	AddAmount(int add) {
		amount += add;
		count++;
	}

	AddAmount() {
		System.out.println("Area of Rectangle : 0");
		count++;
	}

	void display() {
		System.out.println("Total Saving amount is : " + amount);
		System.out.println("Total Transaction : " + count);

	}

	public static void main(String args[]) {
		AddAmount s1 = new AddAmount(50);
		AddAmount s2 = new AddAmount(0);
		AddAmount s3 = new AddAmount(100);
		AddAmount s4 = new AddAmount(100);
		AddAmount s5 = new AddAmount(0);
		s1.display();

	}
}