
class Book
{
	int bid;
	float cost;
	String bName;
	public void accetDetails(int id,float c, String b)
	{
		bid = id;
		cost=c;
		bName=b;
		System.out.println("Object Initialized!!");
	}
	public void display()
	{
		System.out.println("Book Id : " +bid);
		System.out.println("Book Price Rs. " +cost);;
		System.out.println("Book Name : " +bName);
	}
}


public class Library {
	
	String libName;
	
	public void showBookDetails(Book obj)
	{
		System.out.println(libName);
		System.out.println("Book id : " + obj.bid);
		System.out.println("Book Name : " + obj.bName);
		System.out.println("Book Costs Rs. " + obj.cost);
		System.out.println("Changing book cost..");
		obj.cost=5000.00f;
	}
	public static void main(String[] args) {
		Book b = new Book();
		b.display();
		b.accetDetails(12123, 200.50f, "Panipat");
		b.display();
		System.out.println("Hash cde of Object is : "+ b.hashCode());
		
		Book b1 = new Book();
		System.out.println("Hash code of Object b1 is : "+ b1.hashCode());
		
		Book b2;
		b2=b;
		System.out.println("Hash code of Object b2 is : "+ b2.hashCode());
		
		Library l1 = new Library();
		l1.libName = "British Library,FC Rd.Pune";
		l1.showBookDetails(b);
		
		System.out.println("+++++++++");
		b.display();
	}

}
