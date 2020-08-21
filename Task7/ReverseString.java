/*
*  Program to reverse a string in java.
*/
import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		String input = read.nextLine();

		char[] strArray = input.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--)
			System.out.print(strArray[i]);
	}
}