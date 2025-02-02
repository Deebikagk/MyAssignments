package week2.day3;

//Super Class creation - Basepage
public class BasePage {
	
	//Method to finding an element
	public void findElement()
	{
		System.out.println("Finding an elemnent on the webpage");
	}
	//Method to clicking an element
	public void clickElement()
	{
		System.out.println("Clicking an element on the web page");
	}
	//Method to entering the text into the field
	public void enterText(String text)
	{
		System.out.println("Entering the text: " + text);
	}
	//Method to perform common tasks
	public void performCommonTasks()
	{
		System.out.println("Performing the common tasks on the webpage");
	}
	public static void main(String[] args) {
		//Creating object of Basepage
	    BasePage ObjectBP = new BasePage();
		ObjectBP.performCommonTasks();
		ObjectBP.findElement();
		ObjectBP.clickElement();
        ObjectBP.enterText("Sample Text to check");
	}
}
