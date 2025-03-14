package utility.javaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();

		if(isArmstrong(num)) {
			System.out.println(num+ " is an armstrong number ");
		}else {
			System.out.println(num+ " is not an armstrong number ");
		}
		sc.close();
	}

	public static boolean isArmstrong(int num) {
		int arm = 0, temp=num, digits=0;

		while(temp>0) {
			temp/=10;
			digits++;
		}
		temp = num;

		while(temp>0) {
			int a = temp % 10;
			arm += power(a,digits);
			temp/=10;
		}
		return arm==num;
	}

	public static int power(int base, int comp) {
		int result = 1;
		for(int i=0;i<comp;i++) {
			result*=base;
		}
		return result;
	}
}
