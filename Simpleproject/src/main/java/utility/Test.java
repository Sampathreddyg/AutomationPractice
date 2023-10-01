package utility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		int[] aa = { 29, 10, 9, 22 };

		List<Integer> li = new ArrayList<>();
		li.add(989);
		li.add(352);
		li.add(782);
//		li.add(395);
		li.add(246);
		li.add(675);
		
//		li.addAll(li,{});
		
		System.out.println("Before sort : "+li);
		
		Collections.sort(li);
		
		System.out.println("After sort : "+li+"\n");
		
		if(li.size()%2==0) {
			System.out.println("Middle numbers are "+li.get(li.size()/2-1)+" and "+li.get(li.size()/2));
		}else {
			System.out.println("Middle Number is : "+li.get(li.size()/2));
		}
		
		int total = aa.length;

		for (int i = 0; i < aa.length; i++) {
			for (int j = i + 1; j < aa.length; j++) {

				int temp = 0;

				if (aa[i] > aa[j]) {
					temp = aa[i];
					aa[i] = aa[j];
					aa[j] = temp;
				}
			}
			System.out.println(aa[i]);
		}
		if (total % 2 == 0) {
			System.out.println("even Middle Numbers " + aa[(total / 2)-1] + " and " + aa[total / 2]);

		} else {
			System.out.println("odd Middle Number " + aa[total / 2]);
		}
	}

}
