package week2.day4;


//Class creation for JavaConnection
public class JavaConnection implements DataBaseConnection{
	
	@Override
	public void connect() {
System.out.println("Connecting to the database");
		
	}

	@Override
	public void disconnect() {
	System.out.println("Disconnecting from the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execution updated");
		
	}
	
	public static void main(String[] args) {
		 //Creating an instance of JavaConnection
		DataBaseConnection db = new JavaConnection();
		
		//Using the implement methods
		db.connect();
		db.executeUpdate();
		db.disconnect();

	}
	  

}
