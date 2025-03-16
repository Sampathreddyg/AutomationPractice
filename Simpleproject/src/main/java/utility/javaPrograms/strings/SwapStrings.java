package utility.javaPrograms.strings;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String ");
		String str1 = sc.nextLine().toLowerCase();
		System.out.println("Enter second String ");
		String str2 = sc.nextLine().toLowerCase();
		sc.close();
		System.out.println("Before swapping:"+str1+" , "+str2);
		str1=str1+str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapping: "+str1+" , "+str2);
	}
}
