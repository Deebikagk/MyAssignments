package week2.day4;

//Concrete class JavaConnect inherits MySqlConnection
public class JavaConnect extends MySqlConnection {

	  // Concrete implementation of executeQuery method
    @Override
    public void executeQuery() {
        System.out.println("Executing query on MySQL database");
    }
}