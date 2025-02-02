package week2.day3;


//Subclass: TextField (Inherits from WebElement)
public class TextField extends WebElement{
	
	private String text;
	
	//Creating method for setText - String text
	public void setText(String text)
	{
		this.text = text;
		System.out.println("TextField text set:  " + text);
	}
	
	public String getText()
	{
		return text;
	}

}
