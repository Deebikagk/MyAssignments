package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLowestPriceMobilePhone {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		try 
		{
			//Navigation to Amazon india
			//driver.get("https://www.amazon.in/");
			driver.get("https://www.amazon.com.au/");
			driver.manage().window().maximize();
			
			//Search for mobile phones
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("mobile phones");
		searchBox.submit();
		
		//Wait for results to load(use explicit wait in real-world scenarios)
		Thread.sleep(3000);
		
		//Get list of all price elements
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> prices = new ArrayList<>();
		
		//Extract prices and convert to integers
		for(WebElement priceElement : priceElements)
		{
			String priceText = priceElement.getText().replaceAll("[^0-9]", ""); //Remove non-numeric characters
			if(!priceText.isEmpty())
			{
				prices.add(Integer.parseInt(priceText));
			}
		}
		//Find the lowest price
		
		if(!prices.isEmpty()) {
			int lowestPrice = Collections.min(prices);
			System.out.println("Lowest mobile phone price on Amazon:$. " + lowestPrice);
		}
		else
		{
			System.out.println("No prices found");
		}
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
	finally
	{
		//Close the browser
		driver.quit();
	}
	}
}
