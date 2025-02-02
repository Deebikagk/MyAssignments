package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Created the class Editleadinformation
public class EditLeadInformation {

	public static void main(String[] args) {
		//Initialising the Chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		//maximize window
		driver.manage().window().maximize();
		
		//Leaftaps login page details
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Navigating to CRMSFA and Leads section
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
        //Filling the form
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Target Group");
		driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']")).sendKeys("Mark");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("John");
		driver.findElement(By.name("departmentName")).sendKeys("Finance");
		driver.findElement(By.name("description")).sendKeys("This is a Test Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mark.smith@gmail.com");
		
		//Selecting state
		Select stateDropdown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateDropdown.selectByVisibleText("Hawaii");
		
		//Create Lead
		driver.findElement(By.name("submitButton")).click();
		
		//Clicking edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear description and update the inportant note
		WebElement descriptionField = driver.findElement(By.name("description"));
		descriptionField.clear();
		driver.findElement(By.name("importantNote")).sendKeys("Updated Lead Details");
		
		//Click update button
		driver.findElement(By.name("submitButton")).click();
		
		//Get title of resulting page
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		
		//Close the browser
		driver.quit();
	}

}
