package week3.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAlertCode {

	public static void main(String[] args) {

        //Initialise the Chrome browser
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			
			//Added an implicit wait to ensure the webpage elements are fully loaded
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Clicking on the "Prompt Box" button to trigger the alert
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			
			//Switch to the alert and type a message in the alert box
			Alert PromptAlert = driver.switchTo().alert();
			PromptAlert.sendKeys("Deebi");
			String TextInPrompt = PromptAlert.getText();
			System.out.println("Text presented inside the alert box: " + TextInPrompt);
			//Dismiss the alert
			PromptAlert.dismiss();
			
			//Retrieve the typed text from the alert and verify it
			String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
			System.out.println("Text after dismissing the alert box: " + text);
			
			//driver.close();

}

}
