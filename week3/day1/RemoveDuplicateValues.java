package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateValues {

	public static void main(String[] args) {

		//Given String
		String companyName = "google";
		
		//Create a set to store unique characters
		Set<Character> RemoveDuplicate =  new HashSet<>();
		
		//Iterate through each character in the string
		for(char c: companyName.toCharArray())
		{
			RemoveDuplicate.add(c);
		}

		//Print the unique characters
		System.out.println("Unique characters in the string: ");
		for(char c: RemoveDuplicate)
		{
			System.out.println(c);    //Print each unique character		
		}
	}

}
