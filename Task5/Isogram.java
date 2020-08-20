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