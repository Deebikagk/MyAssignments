package week1.day3;

public class LibraryManagement
{

	public static void main(String[] args) 
	{
		Library library = new Library();
		
        String book = library.addBook("To kill a Mockingbird");
        System.out.println("Added book: " + book);
        library.issueBook();
    }

}
