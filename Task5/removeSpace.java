import java.util.Scanner;

public class removeSpace {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		System.out.print(removeSpace(read.nextLine()));
	}

	public static String removeSpace(String input) {
		return input.replaceAll("\\s", "");
	}
}