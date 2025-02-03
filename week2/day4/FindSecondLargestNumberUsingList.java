package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		
      //Declaring the array
		int[] array = {3, 2, 11, 4, 6, 7, 9};
		
		//Convert array to list
		List<Integer> list = new ArrayList<>();
		
		//Add elements to list
		for(int num : array)
		{
			list.add(num);
		}
		
		//Sort the list in ascending order
		Collections.sort(list);
		
		//Print the second largest element
		System.out.println("Second largest number is: " + list.get(list.size() - 2));
	}

}
