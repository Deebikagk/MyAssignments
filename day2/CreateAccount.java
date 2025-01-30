package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	    //Enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click CRM/SFA link
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  
		  //Click Accounts tab
		  driver.findElement(By.linkText("Accounts")).click();
		  
		  //Click on the Create Account button
		  driver.findElement(By.linkText("Create Account")).click();
		  
		  //Entering Account name
		  driver.findElement(By.id("accountName")).sendKeys("TestLeafsample");
		  
		  //Enter description
		  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		  
		  //Selecting Computer Software as  industry
		  WebElement sourceDropdown1 = driver.findElement(By.name("industryEnumId"));
		  Select dd1 = new Select(sourceDropdown1);
		  //dd1.selectByValue("IND_SOFTWARE");
		  dd1.selectByIndex(3);
		  
		  //Selecting S-Corporation as Ownership dropdown
		  WebElement sourceDropdown2 = driver.findElement(By.name("ownershipEnumId"));
		  Select dd2 = new Select(sourceDropdown2);
		  dd2.selectByVisibleText("S-Corporation");
		  
		  //Selecting Employee as Source dropdown
		  WebElement sourceDropdown3 = driver.findElement(By.name("dataSourceId"));
		  Select dd3 = new Select(sourceDropdown3);
		  dd3.selectByValue("LEAD_EMPLOYEE");
		  
		  //Selecting cCommerce Site Internal Campaign in Marketing dropdown
		  WebElement sourceDropdown4 = driver.findElement(By.name("marketingCampaignId"));
		  Select dd4 = new Select(sourceDropdown4);
		  dd4.selectByIndex(6);
		  
		  //Selecting Texas as state
		  WebElement sourceDropdown5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		  Select dd5 = new Select(sourceDropdown5);
		  dd5.selectByValue("TX");
		  
		  //Click Create Account button
		  driver.findElement(By.className("smallSubmit")).click();
		  
		  //Verify the Account Name
		  WebElement element = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		  System.out.println(element.getText());
		  
		  //Close the browser
		  driver.close();
		  
	}

}
