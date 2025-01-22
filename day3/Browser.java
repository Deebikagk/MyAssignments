package week1.day3;

public class Browser {
	
	public String launchBrowser()
	{
		return "Chromebrowser";
	}
	
	public void loadUrl()
	{
		System.out.println("Url loaded was successful");
	}

	public static void main(String[] args) {
		
		Browser returnValue = new Browser();
		System.out.println(returnValue.launchBrowser());
		returnValue.loadUrl();
	

	}

}
