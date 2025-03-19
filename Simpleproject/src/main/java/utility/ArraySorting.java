package utility;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr = { 29, 45, 67, 43, 21, 37, 98 };
		System.out.println("Before swap: ");
		for (int x : arr)
			System.out.print(x + " ");

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting: ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
