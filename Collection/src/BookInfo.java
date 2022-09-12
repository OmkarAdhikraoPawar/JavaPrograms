import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Book
{
	int bookid,price;
	String bookName,BookAuther;
	Book(){}
	Book(int id,String name,String aName,int p)
	{
		bookid = id;
		bookName = name;
		BookAuther = aName;
		price = p;
	}
	public String toString()
	{
		return "Book Id : "+bookid+"Book Name : "+bookName+"Book Auther : "+BookAuther+"Price : "+price;
	}
}
public class BookInfo {
	ArrayList <Book> al ;
	BookInfo()
	{
		al = new ArrayList<Book>();
	}
	public void createList()
	{
		al.add(new Book(101,"Ramayana","Abc",400));
		al.add(new Book(102,"NatSamarat","obj",300));
		al.add(new Book(103,"Mahabharat","xyz",500));
	}
	public void createSet()
	{
		Set<Book> s = new HashSet<>();
		for (Book b : al)
            s.add(b);
		
	}

	public static void main(String[] args) {
		
	}

}
