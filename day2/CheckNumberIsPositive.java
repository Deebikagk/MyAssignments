package week1.day2;

public class CheckNumberIsPositive {
	
	//Declare a version variable with a value of 10
	private static int version = 10;

	public static void main(String[] args) 
	{
      int number = 10; 
      //int number = -5;  // You can change this value to test other cases 
    		  
      //Logic to check if the number is positive or negative
    		  
    		  if(number > 0)
    		  {
    			  System.out.println("The number " + number + " is Positive");
    		  }
    		  else if(number < 0)
    		  {
    			  System.out.println("The number " + number + " is Negative");
    		  }
    		  else
    		  {
    			  System.out.println("The number is Zero");
    		  }		
    		  
    		  //Printing the version
    		  System.out.println("Version: " + version);

	}

}
