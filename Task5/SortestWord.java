/**
* Write a JAVA program that takes given String of words and return the length of the shortest word. 
*/

import java.util.Scanner;

public class SortestWord {

	public static void main(String args[]) {

		Scanner readInput = new Scanner(System.in);
		String input = readInput.nextLine();
		String[] arrInput = input.split("\\s");
		int max = arrInput[0].length();
		String output = arrInput[0];
		for (int i = 1; i <= arrInput.length - 1; i++) {
			int len = arrInput[i].length();
			if (max > len) {
				max = len;
				output = arrInput[i];
			}
		}
		System.out.println("Sortest word is....." + output);
	}
}
