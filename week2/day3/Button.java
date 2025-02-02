package week2.day3;


//Subclass: Button (Inherits from WebElement)
public class Button extends WebElement
{
	
//Creating the method - submit()
	public void submit() {
        System.out.println("Button submitted");
    }

public static void main(String[] args)
{
	Button ObjButton = new Button();
	ObjButton.click();
	ObjButton.submit();
}
}