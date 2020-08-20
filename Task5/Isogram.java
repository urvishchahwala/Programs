/**
*  Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive
*  i.e.all the letters of the string be unique (isogram) else false. 
*/
public class Isogram {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		System.out.print(is_isogram(read.nextLine()));
	}

	static boolean is_isogram(String str) {
		str = str.toLowerCase();
		int len = str.length();

		char arr[] = str.toCharArray();

		Arrays.sort(arr);
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}
}
