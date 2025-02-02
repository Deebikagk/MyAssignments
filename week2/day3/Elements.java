package week2.day3;

//Created new class as Elements - Execution class
public class Elements {

	public static void main(String[] args) 
	{
	//Creating objects and calling methods
		
	 //Create the object for Button
		//Button ObjButton = new Button();
		//ObjButton.click();
		//ObjButton.submit();
        
     //Create the object for TextField
     TextField ObjTextField = new TextField();
     ObjTextField.setText("Hello Java");
     System.out.println("TextField contains:  " + ObjTextField.getText());
     
     //Create the object for CheckBoxButton
     CheckBoxButton ObjCheckBoxButton = new CheckBoxButton();
     ObjCheckBoxButton.click();
     ObjCheckBoxButton.clickCheckButton();
     
     //Create the object for RadioButton
     RadioButton ObjRadioButton = new RadioButton();
     ObjRadioButton.click();
     ObjRadioButton.selectRadioButton();
	}
}
