package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//Declare the string array
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS" };
		
		//Add the array elements to a list
		List<String> companyList = new ArrayList<>();
		
        for(String company: companies)
        {
        	companyList.add(company);
        }
        
        //Reverse the list
        Collections.reverse(companyList);
        
        //Print the reversed list
        System.out.println("Reversed collection: ");
        for(String company : companyList)
        {
        	System.out.println(company + ",");
        }
	}

}
