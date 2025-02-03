package week2.day4;

//Abstract class MySqlConnection implements DataBaseConnect
public abstract class MySqlConnection implements DataBaseConnect {

	  // Abstract method added in MySqlConnection to execute a query
    public abstract void executeQuery();
	
 // Concrete implementation of connect method
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database");
    }

    // Concrete implementation of disconnect method
    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database");
    }

    // Concrete implementation of executeUpdate method
    @Override
    public void executeUpdate() {
        System.out.println("Executing update on MySQL database");
    }
}