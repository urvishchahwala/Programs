/**
* Write a JAVA program that reverse the words of a sentence. 
*  For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”. 
*/
public class ReverseWord {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		System.out.print(reverseWord(read.nextLine()));
	}

	static String reverseWord(String str) {

		str = str.toLowerCase();
		String arr[] = str.split("\\s");
		String reverseWord = "";
		for (String word : arr) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord;
	}

}
