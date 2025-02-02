package week2.day3;


//Superclass - TestData
public class TestData {
	
	//Creating the method - enterCredentials()
	public void enterCredentials()
	{
		System.out.println("Enter the Credentials");
	}
	
	//Creating the method - navigateToHomePage()
	public void navigateToHomePage()
	{
		System.out.println("Navigation to the Home page opened successfully");
	}

	//Main method
	public static void main(String[] args) {
		
		TestData object1 = new TestData();
		object1.navigateToHomePage();
		object1.enterCredentials();
		
		

	}

}
