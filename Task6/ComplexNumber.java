import java.util.Scanner;

public class ComplexNumber {

	double real, img;

	ComplexNumber(double r, double i) {
		this.real = r;
		this.img = i;
	}

	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {

		ComplexNumber sum = new ComplexNumber(0, 0);
		sum.real = c1.real + c2.real;
		sum.img = c1.img + c2.img;

		return sum;
	}

	public static ComplexNumber diff(ComplexNumber c1, ComplexNumber c2) {

		ComplexNumber diff = new ComplexNumber(0, 0);
		diff.real = c1.real - c2.real;
		diff.img = c1.img - c2.img;

		return diff;
	}

	public static ComplexNumber product(ComplexNumber c1, ComplexNumber c2) {

		ComplexNumber product = new ComplexNumber(0, 0);
		product.real = c1.real * c2.real;
		product.img = c1.img * c2.img;

		return product;
	}

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		System.out.println("Enter First Real Number ");
		double real1 = read.nextDouble();
		System.out.println("Enter First Imaginary Number ");
		double img1 = read.nextDouble();
		System.out.println("Enter Second Real Number ");
		double real2 = read.nextDouble();
		System.out.println("Enter Second Imaginary Number ");
		double img2 = read.nextDouble();

		ComplexNumber c1 = new ComplexNumber(real1, img1);
		ComplexNumber c2 = new ComplexNumber(real2, img2);

		ComplexNumber sum = sum(c1, c2);
		ComplexNumber diff = diff(c1, c2);
		ComplexNumber product = product(c1, c2);

		System.out.println("Sum is: " + sum.real + " + " + sum.img + "i");
		System.out.println("Diffrence is: " + diff.real + " + " + diff.img + "i");
		System.out.println("Product is: " + product.real + " + " + product.img + "i");
	}
}