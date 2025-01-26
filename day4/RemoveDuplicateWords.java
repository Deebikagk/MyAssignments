package week1.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Initialize the input string
		String text = "We learn Java basics as part of java sessions in java week1";
		// Split the text into an array of words using space as the delimiter
		String[] words = text.split(" ");
		//Initialize a variable to keep track of the number of duplicate words found 
		int count;
		
		//Outer loop to pick each word one by one
		for(int i = 0; i < words.length; i++)
		{
			count = 1;
			
		 //Skip if the word is already marked as duplicate
			if(words[i].equals(""))
			{
				continue;
			}
			
			//Inner loop to compare the picked word with the rest of the words
			for(int j = i + 1; j < words.length; j++)
			{
		      //Compare words case-insensitively
				if(words[i].equalsIgnoreCase(words[j]))
				{
					count++;
					//Mark the duplicate word as empty
					words[j] = "";
				}
			}
			
			//If the word appears more than once, it's a duplicate
			if(count > 1)
          {
        	  words[i] = words[i].toLowerCase();
          }
		}
		//Construct the modified string by skipping empty words
		StringBuilder result = new StringBuilder();
		for(String word : words)
		{
			if(!word.equals(""))
			{
				result.append(word).append(" ");
            }
		}
		
		//Printing the modified string
		System.out.println("Modified string: " + result.toString().trim());
	}
}
