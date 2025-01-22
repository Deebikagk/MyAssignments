package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 8;
		int firstTerm = 0;
		int secondTerm = 1;
		
		System.out.println("Fibonacci series till " + n + " terms ");
		
		for(int i = 1; i <= n; ++i)
		{
			System.out.println(firstTerm + " , ");
			
			//compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}
		
	}

}
