package assignment4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*Write a program that will remove duplicate values from List
Input – Java, TestNG, Maven, Java, 
Output – Java, TestNG, Maven */
public class ConvertListToSet {

	public static void main(String[] args) {
		
		List<String> l1=Arrays.asList("Java","TestNG","Maven","Java");
		
		System.out.println(l1);
		
		HashSet<String>s1=new HashSet<>(l1);
		
		System.out.println(s1);
		
	}

}
