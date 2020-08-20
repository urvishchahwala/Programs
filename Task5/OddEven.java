public class OddEven {

		public static void main(String args[]) {

		int[] odd = { 23, 25, 75, 87, 47, 1, 91, 51, 2 };
		int[] even = { 22, 44, 64, 76, 98, 12, 43, 54, 90 };
		System.out.println("Odd Array : " + Arrays.toString(odd));
		System.out.println("Even Array : " + Arrays.toString(even));

		for (int i = 0; i < odd.length; i++) {
			if (odd[i] % 2 == 0)
				System.out.println("Even number from Odd array : " + odd[i]);
		}
		for (int i = 0; i < even.length; i++) {
			if (even[i] % 2 != 0)
				System.out.println("Odd number from Even array : " + even[i]);
		}
	}
}