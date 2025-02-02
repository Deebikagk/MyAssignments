package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Created the class for Deletelead
public class DeleteLeadTestleafApplication {

	public static void main(String[] args) throws InterruptedException {
		
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
				
				//Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(3000);  //Wait for results to load
				
				//Capturing lead id
				WebElement leadElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
				String leadID = leadElement.getText();
				leadElement.click();
				
				//Delete lead
				driver.findElement(By.linkText("Delete")).click();
				
				//Search for Deleted Lead
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.name("id")).sendKeys(leadID);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(4000);  //Wait for results to load
				
				//Verify the Deletion
				String resultMessage = driver.findElement(By.className("x-paging-info")).getText();
				if(resultMessage.equals("No records to display"))
				{
					System.out.println("Lead successfully deleted");
				}
				else
				{
					System.out.println("Lead deletion failed");
				}

				//Close browser
				driver.quit();
	}

}
