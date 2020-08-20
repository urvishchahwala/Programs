public class ReverseCase {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		String input = read.nextLine();
		StringBuffer str = new StringBuffer();
		str.append(input);
		System.out.println(convertCase(str));
	}

	static String convertCase(StringBuffer str) {
		int ln = str.length();
		for (int i = 0; i < ln; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				str.replace(i, i + 1, Character.toUpperCase(c) + "");
			else
				str.replace(i, i + 1, Character.toLowerCase(c) + "");

		}
		return str.toString();
	}

}