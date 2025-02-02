package week2.day3;

//Subclass
public class LoginTestData extends TestData{
	
	//Creating method - enterUsername()
	public void enterUsername()
	{
		System.out.println("Enter the Username: ");
	}
	
	
//Creating method - enterPassword()
	public void enterPassword()
	{
		System.out.println("Enter the Password: ");
	}

	public static void main(String[] args) {
		
      LoginTestData newObject = new LoginTestData();
      newObject.navigateToHomePage();
      newObject.enterCredentials();
      newObject.enterUsername();
      newObject.enterPassword();
    
     
	}

}
