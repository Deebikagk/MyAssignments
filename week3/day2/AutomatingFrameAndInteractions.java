package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndInteractions {

	public static void main(String[] args) throws InterruptedException {
		
		
	//Initialising the chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        
         //Switch to the frame
         //driver.switchTo().frame("iframeResult");
        
         //Added an implicit wait to ensure the webpage elements are fully loaded
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          Thread.sleep(3000);
          
          //Switch to the frame
          driver.switchTo().frame("iframeResult");
	 
         //Click the "Try It" button inside the frame
         driver.findElement(By.xpath("//button[text()='Try it']")).click();
         
         Alert alert = driver.switchTo().alert();
         alert.accept();

	}

}
