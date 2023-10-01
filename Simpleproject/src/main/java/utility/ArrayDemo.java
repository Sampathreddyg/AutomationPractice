package utility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] num = new int[4];
		num[0] = 120;
		num[1] = 200;
		num[2] = 300;
		num[3] = 200;

		//		for(int x:num)
		//			System.out.println(x);

		String [] data= new String[3];
		data[0]="Ram";
		data[1]= "Rahim";
		data[2]= "Mohan";

		ArrayList<String> data1= new ArrayList<>();
		data1.add("Chiranjeevi"); //add used for adding data
		data1.add("Balayya");
		data1.add("Nagarjuna");
		data1.add("Pawan");
		data1.add("Charitha");

		ArrayList<String> al= new ArrayList<>(data1);
		System.out.println("Constructor "+al);
		al.add("Ram");
		al.add("Rahim");
		al.add("Sham");
		al.add("Pawan");

		System.out.println("Elements in data1 "+data1);
		for(String k:al)
		System.out.println("Element "+(al.indexOf(k)+1)+" in List out of "+al.size()+" Elements is "+k);

		al.remove(2);
		boolean condition = false; 
			if(al.contains("Nagarjuna"))
				condition = true;
		if(condition) System.out.println("Nagarjuna available");
		else System.out.println("Nagarjuna not available");

		System.out.println("After removing 2 index in al "+al);
//		data1.clear();
		al.set(4, "Tarak");
		System.out.println("After set index 4 in al "+al);
//		al.removeAll(data1);
		System.out.println("After removing all "+al);
		System.out.println("Elements in data1 after clear() "+data1);
		al.add("Sham");
		System.out.println("Before HashSet "+al);
		
		HashSet<String> ref = new HashSet<>();
		ref.addAll(al);
		System.out.println("After HashSet "+ref);
		for(String x:ref) {
			System.out.print(x+",");
		}
		
		SortedSet<String> stset = new TreeSet<String>(al);
		
		Iterator<String> it= stset.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		

	}



}
