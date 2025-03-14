package utility.javaPrograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number ");
		int number = sc.nextInt();

		if(number<0) {
			System.out.println("Factorial is not defined for negetive numbers.");
		}else {
			for(int i=1;i<=number;i++) {
				factorial *= i;
			}
			System.out.println("Factorial of "+number+ " is : "+factorial);
		}
		sc.close();
	}
}
