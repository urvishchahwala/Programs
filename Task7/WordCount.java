/*
*  Program to Count the number of words in the String.
*/
import java.util.Scanner;

public class WordCount {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String input = sc.nextLine();
		if (isUnique(input)) {
			System.out.println("All characters of String are unique");
		} else {
			System.out.println("All characters of String are not unique");
		}
	}

	public static boolean isUnique(String input) {
		Set<Character> set = new HashSet<>();
		char[] characters = input.toCharArray();
		for (Character c : characters) {
			if (!set.add(c)) {
				return false;
			}
		}
		return true;
	}
}