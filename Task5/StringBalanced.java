/**
* Write a JAVA program that gives boolean values; true, if the string has balanced braces and false, if the string has unbalanced braces: 
* For eg, => “({{)}[}]()” //output => true //valid parenthesis 
*             {{( [ ) ] }} => “[})(” //output => false. 
*/
public class StringBalanced {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		String input = read.nextLine();
		System.out.println(isBalanced(input));
	}

	static boolean isBalanced(String expr) {
		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;

			switch (x) {
			case ')':
				stack.pop();
				if (x == '{' || x == '[')
					return false;
				break;

			case '}':
				stack.pop();
				if (x == '(' || x == '[')
					return false;
				break;

			case ']':
				stack.pop();
				if (x == '(' || x == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

}
