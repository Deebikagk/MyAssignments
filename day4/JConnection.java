package week2.day4;


//Concrete class JavaConnection implements the DBConnection interface
public class JConnection implements DBConnection
{

	//Concrete implementation of connect method
	@Override
	public void connect()
	{
		System.out.println("Connecting to the db");
	}
	
	//Concrete implementation of disconnect method
	@Override
		public void disconnect()
		{
			System.out.println("Disconnecting from the db");
		}
	
		
		//Concrete implementation of executeUpdate method
	@Override
		public void executeUpdate()
		{
			System.out.println("Executing update on the db");
		}
}
