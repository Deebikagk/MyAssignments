package week2.day4;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioWebsiteAutomation {

	public static void main(String[] args) throws InterruptedException {
		// Initialising the  chrome browser
          ChromeDriver driver = new ChromeDriver();

		// Load URL
          driver.get(" https://www.ajio.com/ ");

		// Maximize browser
          driver.manage().window().maximize();

		// Enter Bags in search bags
          driver.findElement(By.name("searchVal")).sendKeys("Bags");
		  driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);

		// click on men
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
				
		// Click on fashion bags under category
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(5000);

		// Print the count of items found
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		Thread.sleep(3000);

		System.out.println("Count of items " + text);

		// Get the list of brands of products
		List<WebElement> BrandList = driver.findElements(By.className("brand"));

		// Sizeof the list
		int sizeofthelist = BrandList.size();

		System.out.println("Sizeof the brandlist " + sizeofthelist);

		List<String> brandname = new ArrayList<String>();

		for (int i = 0; i < sizeofthelist - 1; i++) {

			String brand = BrandList.get(i).getText();
			brandname.add(brand);

		}

		System.out.println("List of brands displayed " + brandname);

		// Get the list of bag names
		List<WebElement> Baglist = driver.findElements(By.className("nameCls"));

		int sizeofbaglist = Baglist.size();

		System.out.println("Sizeofbaglist " + sizeofbaglist);

		List<String> Bagname = new ArrayList<String>();

		for (int i = 0; i < sizeofbaglist - 1; i++) {

			String bag = Baglist.get(i).getText();
			Bagname.add(bag);

		}

		System.out.println("List of bags displayed " + Bagname);
		driver.close();
	}

}
