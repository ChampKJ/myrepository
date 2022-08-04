import java.util.Scanner;

public class ModularAproach {

	
	//how to write method in java?
	// accessspecifier return-type methodName(optional parameters)
	//{
	//   .....
	//   .....
	//}
	
	public void findMaximum()
	{
		
	}
	
	public int addNumbers(int x,int y)
	{
		int z=0;
		z=x+y;
		return z;
	}
	
	public static void main(String[] args)
	{
		loop1:
		for(int i=2;i<=10;i++)
		{	
			if(i==6)
				continue;
			for(int j=1;j<=10;j++)
			{
				if(j==5)
					continue loop1;
				System.out.print(i*j + "  ");
			}
		    System.out.println();
		    System.out.println("_____________________________");
		}
//		int a,b;
//		//Scanner sc = new Scanner(System.in);
//		ModularAproach o = new ModularAproach();	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ENter Number 1 : ");
//		a = sc.nextInt();
//		System.out.println("ENter Number 2 : ");
//		b = sc.nextInt();
//		int ans = o.addNumbers(a,b);
//		System.out.println("Addition is : " + ans);
//		//o.addNumbers();
	}

}
