package week2.day4;

public interface DBConnection {
	
	//Method to establish a connection
	void connect();
	//Method to disconnect
	void disconnect();
	//Method to execute an update(eg: insert, update, delete)
	void executeUpdate();
	

}
