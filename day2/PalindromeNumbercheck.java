package week1.day2;

public class PalindromeNumbercheck
{
	public static void main(String[] args)
	{
		checkPalindrome(121);  // Expected output: It is a Palindrome
		checkPalindrome(12345);  // Expected output: It is not a Palindrome
	}
	
	public static void checkPalindrome(int input)
	{
		int originalInput = input;  // Store the original number
		int output = 0;   // To store the reverse number
		
		while (input > 0)
		{
			int rem = input % 10;  // Get the last digit
			output = output * 10 + rem;  // Add t to the reversed number
			input = input / 10; // Remove the last digit from the input
		}
		
		// Check if the original and reverse number are the same
		if(originalInput == output)
		{
			System.out.println(originalInput + " is a Palindrome");
		}
		else
		{
			System.out.println(originalInput + " is not a Palindrome");
		}
		
   }
}


