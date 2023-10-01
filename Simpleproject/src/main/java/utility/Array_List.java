package utility;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("sampath");
		arr.add("saritha");
		arr.add("Chidvilas");
		arr.add("Venkata aadya Mokshitha");
		
		System.out.println(arr);
		System.out.println(arr.contains("saritha"));
		System.out.println(arr.get(3));
		System.out.println(arr.size());
		System.out.println(arr.indexOf("sampath"));
		arr.add(0, "Uma");
		System.out.println(arr);
		System.out.println(arr.indexOf("Uma"));
		System.out.println(arr.set(4, "Mokshitha"));
		System.out.println(arr.size()+" "+arr);
		arr.remove(4);
		System.out.println(arr);
		arr.add(0, "Mokshitha");
		System.out.println(arr);
		System.out.println("====================");
		arr.set(0, "Aadya");
		System.out.println(arr);
		System.out.println("====================");
		
		for(String x:arr) {
			System.out.println(x);
		}
		System.out.println("==================================");
		ArrayList<Integer> listint = new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			listint.add(i);
		}
		for(int x:listint)
			System.out.print(x+" ");
	}

}
