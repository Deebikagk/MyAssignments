package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistrationProcess {
	
	public static void main(String[] args) {
		//Initialize the Chrome WebDriver
		 ChromeDriver driver = new ChromeDriver();
		 //Load the URL
	     driver.get ("https://www.facebook.com/");
		 //Maximize the browser window
	     driver.manage().window().maximize();
	     //implicit wait to ensure the web page elements are fully loaded
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	     //Thread.sleep(5000);
	     
	     //Click on the Create new account button.
	     driver.findElement(By.linkText("Create new account")).click();
	     //Enter the First name
	     driver.findElement(By.name("firstname")).sendKeys("Deebika");
	     //Enter the Surname
	     driver.findElement(By.name("lastname")).sendKeys("Dinesh");
	     //Enter the Mobile number or email address
	     driver.findElement(By.name("reg_email__")).sendKeys("123456789");
	   //driver.findElement(By.name("reg_email__")).sendKeys("deebika123@gmail.com");
	     //Enter the New password
	     driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
	     //Handle all three drop downs in Date of birth
	     //Day
	     WebElement element1 = driver.findElement(By.id("day"));
	     Select day = new Select(element1);
	     day.selectByIndex(20);
	     //Month
	     WebElement element2 = driver.findElement(By.id("month"));
	     Select month = new Select(element2);
	     month.selectByValue("11");
	     //Year
	     WebElement element3 = driver.findElement(By.id("year"));
	     Select year = new Select(element3);
	     year.selectByVisibleText("2000");
	     //Select the radio button in Gender
	     driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();

	     //Close the browser
	     //driver.close();
	}


}
