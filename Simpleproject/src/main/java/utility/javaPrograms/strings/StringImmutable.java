package utility.javaPrograms.strings;

public class StringImmutable {

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println("Original String: "+str+ " and Hashcode: "+System.identityHashCode(str));
		
		str.concat("World");
		System.out.println("After modification: "+str+ " and Hashcode: "+System.identityHashCode(str));

		str = str.concat("World");
		System.out.println("After assigning: "+str+ " and Hashcode: "+System.identityHashCode(str));
		
	}

}
