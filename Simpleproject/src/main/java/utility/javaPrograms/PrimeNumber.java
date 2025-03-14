package utility.javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();

		if(number<=1) {
			System.out.println(number+" is Not a Prime Number");
		}else if(isPrime(number)) {
			System.out.println(number+" is a Prime Number");
		}else {
			System.out.println(number+" is Not a Prime Number");
		}
		sc.close();
	}

	public static boolean isPrime(int num) {
		if(num<=1) return false;
		if(num==2) return true;
		
		for(int i = 2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		} return true;
	}
}


