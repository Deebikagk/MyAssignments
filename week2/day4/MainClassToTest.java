package week2.day4;

public class MainClassToTest {

	public static void main(String[] args) {
		
		//Create an instance of JavaConnect
		DataBaseConnect ObjDataBaseConnect = new JavaConnect();
		
		//Calling methods through interface reference
		
		ObjDataBaseConnect.connect();
		ObjDataBaseConnect.executeUpdate();
		ObjDataBaseConnect.disconnect();
		
	}

}
