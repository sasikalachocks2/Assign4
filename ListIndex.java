package assignment4;

import java.util.Arrays;
import java.util.List;

/*Create a list of values and print the second element, second last element.
Input – 10,45, 90,45, 23, 90, 44
Output – 45,90 */
    
public class ListIndex {

	public static void main(String[] args) {
		
		
		List<Integer> num=Arrays.asList(10,45,90,45,23,90,44);
		
		System.out.println("Second element :"+num.get(1));
	
		System.out.println("Second last element :"+num.get(num.size() - 2));
		
	}

}
