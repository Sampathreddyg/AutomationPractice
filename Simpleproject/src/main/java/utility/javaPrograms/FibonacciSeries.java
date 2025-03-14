package utility.javaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of terms");
		int size = sc.nextInt();
		int first = 0, second = 1, next;
		System.out.println("FibonacciSeries is ");
		
		for(int i=0;i<size;i++) {
			System.out.print(first+ " ");
			next = second+first;
			first = second;
			second = next;
		}
		sc.close();
	}

}
