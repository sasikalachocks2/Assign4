package assignment4;
/*Create a list of String and print the values in reverse order
Input – Java, Selenium, TestNG, Git, Github
	Output- Github, Git, TestNG, Selenium, Java  */ 
 
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverseOrder {

	public static void main(String[] args) {
		
		
		//List<String> l1=Arrays.asList("Java","Selenium","TestNG","Git","Girhub");
		
		List<String> l1= new ArrayList<>();
		
		l1.add("Java");
		l1.add("Selenium");
		l1.add("TestNG");
		l1.add("Git");
		l1.add("Github");
		
		System.out.println(l1);
		
		Collections.reverse(l1);
		
		System.out.println(l1);
		
	}

}
