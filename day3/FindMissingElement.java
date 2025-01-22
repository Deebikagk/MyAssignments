package week1.day3;
import java.util.Arrays;


public class FindMissingElement {

	public static void main(String[] args) 
	{
     int[] array = {1, 4, 3, 2, 8, 6, 7};
     Arrays.sort(array);
     
     int missingNumber = -1;
     for(int i = 0; i < array.length - 1; i++) 
     {
    	 if(array[i + 1] != array[i] + 1)
    	 {
    		 missingNumber = array[i] + 1;
    		 break;
          }
     }
     if(missingNumber != -1)
     {
    	 System.out.println("Missing Number: " + missingNumber);
     }
     else
     {
    	 System.out.println("No missing number found in the sequence");
     }

  }

}
