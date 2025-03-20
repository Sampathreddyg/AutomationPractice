package utility.javaPrograms.arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {

	public static void main(String[] args) {

		int[] array1 = {21,34,54,36,78,57,78};
		int[] array2 = {78,34,57,78,44,72,85};
		
		Set<Integer> commonElements = findCommonElements(array1,array2);
		System.out.println("Common Elements: "+commonElements);
	}

	public static Set<Integer> findCommonElements(int[] array1,int[] array2){
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonSet = new HashSet<>();
		
		
		
		for(int num : array1) {
			set1.add(num);
		}
		
		for(int num : array2) {
			if(set1.contains(num)) {
				commonSet.add(num);
			}
		}
		return commonSet;
	}
}
