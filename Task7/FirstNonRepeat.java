/*
*  Program to find the first non-repeated character in the String 
*/
import java.util.Scanner;

	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		String input = read.nextLine();

		for (int i = 0; i < input.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println("The first non repeated character in String is: " + input.charAt(i));
				break;
			}
		}
	}
