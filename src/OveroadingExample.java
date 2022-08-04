import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Train
{
	public void bookTickets(int qty)
	{
		System.out.println("Train Booking Done!");
	}
}
class Flight
{
	public void bookTickets(int qty)
	{
		System.out.println("Flight Booking Done!");
	}
}
class Bus
{
	public void bookTickets(int qty)
	{
		System.out.println("Bus Booking Done for" + qty + " people" );
	}
}

public class OveroadingExample {

	public void bookMyTickets(Bus b)
	{
		b.bookTickets(4);
	}
	public void bookMyTickets(Flight b)
	{
		b.bookTickets(2);
	}
	public void bookMyTickets(Train b)
	{
		b.bookTickets(10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OveroadingExample o = new OveroadingExample();
	
		System.out.println(" Which Booking you wanted to do?");
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String choice=null;
		try {
		 choice = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(choice.equals("Bus"))
		{
			Bus b = new Bus();
			o.bookMyTickets(b);
		}
		else if(choice.equals("Flight"))
		{
			Flight f = new Flight();
			o.bookMyTickets(f);
		}
		else
		{
			Train t = new Train();
			o.bookMyTickets(t);
		}
	}

}
