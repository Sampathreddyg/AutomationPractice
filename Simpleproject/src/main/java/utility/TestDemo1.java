package utility;

import java.util.HashSet;

public class TestDemo1 {

	public static void main(String[] args) {
		
		HashSet<Character> ref = new HashSet<Character>();
		ref.add('C');
		ref.add('B');
		ref.add('C');
		ref.add('A');
		ref.add('G');
		System.out.println(ref);
		
	}
}
