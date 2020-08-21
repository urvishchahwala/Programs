/*
*  Program to find the intersection of two arrays in java.
*/

import java.util.HashSet;

public class Intersaction {

	static void printIntersection(int arr1[], int arr2[]) {
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr1.length; i++)
			hs.add(arr1[i]);

		for (int i = 0; i < arr2.length; i++)
			if (hs.contains(arr2[i]))
				System.out.print(arr2[i] + " ");
	}

	public static void main(String[] args) {
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };

		System.out.println("Intersection of two arrays is : ");
		printIntersection(arr1, arr2);
	}
}