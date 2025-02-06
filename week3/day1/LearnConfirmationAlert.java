package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//INitialise the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//To click the element
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//Transfer the driver focus to alert box
		Alert ConfirmationAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String text = ConfirmationAlert.getText();
		System.out.println(text);
		
		ConfirmationAlert.accept();
	}

}
