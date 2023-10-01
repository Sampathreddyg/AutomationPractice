	package utility;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(223);
		list.add(516);
		list.add(435);
		list.add(655);
		list.add(986);
		list.add(768);
		System.out.println(list);
		
		System.out.println(list.get(4));
		System.out.println("First element in list : "+list.getFirst());
		System.out.println("Last element in list : "+list.getLast());
		System.out.println(list.peek());
		System.out.println("List before poll "+list);
		list.pollFirst();
		list.pollLast();
		System.out.println("List after poll "+list);
	}

}
