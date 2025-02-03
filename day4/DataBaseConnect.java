package week2.day4;

//DataBaseConnect interface with abstract methods
public interface DataBaseConnect {

	//Method to establish a connection
	void connect();
	
	//Method to disconnect
		void disconnect();
		
		//Method to execute and update
		void executeUpdate();

	
}
