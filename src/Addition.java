import java.util.Scanner;

public class Addition {

	public void makeAddition(byte x,byte y)
	{
		System.out.println("(byte)");
		System.out.println("Addition is :" + (x+y));
	}
	public void makeAddition(int x,int y)
	{
		System.out.println("(int,int)");
		System.out.println("Addition is :" + (x+y));
	}
	protected double makeAddition(double x,int z)
	{
		System.out.println("(double,int)");
		return x+z;
	}
	public void makeAddition(String s1,String s2)
	{
		System.out.println("(String,String)");
		System.out.println(" Addition : " + s1+s2);
	}
	
	public static void main(String[] args) {
	
		Addition obj = new Addition();	
		double ans=obj.makeAddition(34.0, 89);
		System.out.println("Addition is : "+ ans);
		
		obj.makeAddition((byte)3, (byte)5);
		
		obj.makeAddition("Wel", " come");
	}

}
