package week2.day3;

public class APIClient {
	
//Overloaded method: accepting 1 input argument
	public void sendRequest(String endpoint)
	{
		System.out.println("Sending request to endpoint: " + endpoint);
	}
	
   //Overloaded method: accepting 3 input arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		if(requestStatus)
		{
			System.out.println("Sending request to endpoint: " + endpoint);
			System.out.println("Request Body: " + requestBody);
			System.out.println("Request was successfull");
		}
		else
		{
			System.out.println("Failed to send request to: " + endpoint);
		}
	}
	
	public static void main(String[] args) {
	//Creating an object for APIClient
    APIClient Objclient = new APIClient();
    
    //Calling the first overloaded method
    Objclient.sendRequest("https://api.example.com/getData");
    
    //Calling 2nd overloaded method
    Objclient.sendRequest("https://api.example.com/postData", "{\"name\":\"Deebika\", \"age\":34}", true);
    }
}
