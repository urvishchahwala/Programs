public class Rectangle {

	Rectangle (int number) {
		System.out.println("Area of Rectangle : "+ (number*number));
	}
	Rectangle (int length,int breadth) {
		System.out.println("Area of Rectangle : "+ (length*breadth));
	}
	Rectangle() {
		System.out.println("Area of Rectangle : 0");
	}

	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5);
		Rectangle r3 = new Rectangle(5,10);
		
	}
}