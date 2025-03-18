package utility.javaPrograms.strings;

public class RemoveLeadingZeros {

	public static void main(String[] args) {

		String input = "0000123000java000";
		String output = input.replaceFirst("^0+", "");
		System.out.println("Before removing zeros: "+input+"\nAfter removing leading zeros: "+output);
		
		input = "0009876543";
		int number = Integer.parseInt(input); //works when string contains only numeric values
		System.out.println("Before removing zeros: "+input+"\nAfter removing leading zeros: "+number);
		
		input = "00987testjava123";
		int i = 0;
		while(i<input.length() && input.charAt(i)=='0') {
			i++;
		}
		String output1 = input.substring(i);
		if(output1.isEmpty()) {
			output1 = "0";
		}
		System.out.println("Before removing zeros: "+input+"\nAfter removing leading zeros: "+output1);
	}
}
