package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindingIntersectionUsingList {

	public static void main(String[] args) {
	
    // Declaring the arrays
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		
		
		//Converting arrays into list
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		//Adding elements to list1
		for(int num: array1)
		{
			list1.add(num);
		}
		
		//Adding elements to list2
	   for(int num: array2)
		{
		    list2.add(num);
		}
		
		//Finding Intersection
	   System.out.println("Intersection of both lists: ");
	   for(int num: list1)
	   {
		   if(list2.contains(num))
		   {
			   System.out.println(num);
		   }
	   }
	}

}
