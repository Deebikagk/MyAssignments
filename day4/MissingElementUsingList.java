package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		
		//Declaring an array
		int[] array = {1, 2, 3, 4, 10, 6, 8};
		
		//Convert the array to a list
		List<Integer> list = new ArrayList<>();
		for(int num: array)
		{
			list.add(num);
		}
		
		//Sort the list in ascending order
		Collections.sort(list);
		
		//Find and print the missing elements
		System.out.println("Missing Elements: ");
		for(int i = 0; i < list.size() - 1; i++)
		{
			//Check if there is a gap between consecutive elements
			int current = list.get(i);
			int next = list.get(i + 1);
			
			//If the gap is more than i, print the missing numbers
			for(int j = current + 1; j < next; j++)
			{
				System.out.println(j);
			}
		}

	}

}
