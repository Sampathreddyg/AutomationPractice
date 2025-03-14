package utility.javaPrograms;

import java.util.Scanner;

public class NoOfDigitsInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		long number = sc.nextLong();

		long num = number;
		int count=0;

		if(number==0) {
			count = 1;
		}
		if(number<0) {
			number*=-1;
		}
		while(number>0) {
			number = number/10;
			count++;
		}
		System.out.println("No of digits in given number '"+num+ "' is : "+count);
		sc.close();
	}
}
