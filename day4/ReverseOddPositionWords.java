package week1.day4;

public class ReverseOddPositionWords {

	public static void main(String[] args) 
	{
		String test = "I am a software tester";
		
		String[] words = test.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < words.length; i++)
		{
			if(i % 2 != 0)
			{
				String reversedWord = new StringBuilder(words[i]).reverse().toString();
				result.append(reversedWord);
			}
			else
			{
				result.append(words[i]);
			}
			if(i < words.length - 1)
			{
				result.append(" ");
			}
		}
		System.out.println(result.toString());
		
	}
}
