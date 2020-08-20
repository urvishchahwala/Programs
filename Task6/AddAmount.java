/**
* Suppose you have a Saving Box with an initial amount of $50 and you have to add some more to it. 
* Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows: 
* 	without any parameter - no amount will be added to the Saving Box 
* 	having a parameter which is the amount that will be added to Saving Box 
* Create object of the 'AddAmount' class and display the final amount in Saving Box. Also, create a method that can display how many transactions are done on the Saving Box. 
*/
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
