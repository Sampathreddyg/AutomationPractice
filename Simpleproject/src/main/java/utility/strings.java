package utility;

public class strings {

	public static void main(String[] args) {

		String name1 = "chennur";
		
		String name2 = "Proddatur town";
		
		String name3 = "KADAPA";
		
		String name4 = "   chidvi reddy    ";
		
		System.out.println(name1.equals(name3));
		
		System.out.println(name1.equalsIgnoreCase(name3));
		
		System.out.println(name2.charAt(6));
		
		System.out.println(name1.concat(name2));
		
		System.out.println(name2.contains("tur"));
		
		System.out.println(name2.endsWith("Tur"));
		
		System.out.println(name2.indexOf("u"));
		
		System.out.println("Text lenth : "+name2.length());
		
		System.out.println(name3.toLowerCase());
		
		System.out.println(name1.toUpperCase());
		
		System.out.println("Before trim : "+name4+", After trim : "+name4.trim());
		
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		
		System.out.println(s1.replace("index", "INDEX"));
		
		System.out.println(s1.startsWith("t"));
		
		System.out.println(s1.substring(8, 13));
		
		char[] ch = name1.toCharArray();
		int l = ch.length;
		System.out.println("Lenght of array : "+l);
		for(char k:ch) {
			System.out.println(k);
		}
		
	}

}