package utility.javaPrograms.strings;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter a number");
		int b = sc.nextInt();
		System.out.println("Enter a number");
		int c = sc.nextInt();
		System.out.println("Enter a number");
		int d = sc.nextInt();
		sc.close();
		if(a>=b&&a>=c&&a>=d){
			System.out.println(a);
		}else if(b>=a&&b>=c&&b>d){
			System.out.println(b);
		}else if(c>=a&&c>=b&&c>=d){
			System.out.println(c);
		}else {
			System.out.println(c);
		}
	}
}
