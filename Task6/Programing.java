/**
* Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. 
* If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed. 
*/
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
