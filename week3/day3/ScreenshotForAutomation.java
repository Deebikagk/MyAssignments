package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotForAutomation {
	public static void main(String[] args) throws IOException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("./Screenshot/homepage.png");
	
	FileUtils.copyFile(source, destination);
	
	}

}
