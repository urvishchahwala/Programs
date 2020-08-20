public class Programing {

	Programing() {
		System.out.println("I love programming languages");
	}

	Programing(String language) {
		System.out.println("I love "+language);
	}

	public static void main(String args[]) {
		Programing p1 = new Programing();
		Programing p2 = new Programing("Java");
		Programing p3 = new Programing("Java C#");
	}
}