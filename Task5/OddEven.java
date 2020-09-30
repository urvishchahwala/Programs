/**
* Write a JAVA program that takes out the even from the odds and odd from the list of even numbers, 
* For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2 
* {22,44,64,76,98,12,43,54,90} // Output for this case =>43. 
*/
public class OddEven {

		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);//Use scanner class to take input
			//Instead of assuming the array make program a little Interactive and let user enter the array!
			// for Example
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int odd[]=new odd[n];
			System.out.println("Enter odd elements array");
			for(int i=0;i<n;i++){
				odd[i]=sc.nextInt();
			}
			//Similar way for the even array
			//Will make the program interactive
			

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
