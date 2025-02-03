package week2.day4;

public class MainClassToImplement {

	public static void main(String[] args) {
		
		//Create an instance of Java Connection
		
		DBConnection DataBaseConnection = new JConnection();
		
		//CAll the methods through the interface reference
		DataBaseConnection.connect();
		DataBaseConnection.executeUpdate();
		DataBaseConnection.disconnect();
	}

}
