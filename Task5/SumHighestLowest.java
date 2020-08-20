public class SumHighestLowest {

	public static void main(String args[]) {

		int[] input = { 11, 22, 55, 55, 33, 44, 7, 1, 4, 6 };
		int len = input.length;
		if (input.length >= 2) {
			int output = 0;
			Arrays.sort(input);
			int lowest = input[0];
			int highest = input[len - 1];
			for (int i = 1; i < input.length - 1; i++) {
				if (input[i] != lowest && input[i] != highest)
					output += input[i];
			}
			System.out.println("Sum of element except Highest and lowest value is ....." + output);
		} else
			System.out.println("Sum of element except Highest and lowest value is ....." + 0);

	}
}