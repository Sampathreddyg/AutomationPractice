package utility;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.println("Enter the element for row"+(i+1)+" and column"+(j+1));
			arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Given array is  ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
