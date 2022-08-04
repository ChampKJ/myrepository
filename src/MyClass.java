import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MyClass {

	public static void main(String[] args) {
		
		int a=90,b=67;
		
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		
		String msg = a>b ? a +" is Bigger" : b + " is Bigger";
		System.out.println(msg);
		
		
//		BufferedReader br = 
//		new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			System.out.println("ENter some data ..");
//			String input_form_String = br.readLine();
//			int val = Integer.parseInt(input_form_String);
//			boolean flag=true;
//			for(int i=2;i<val/2;i++)
//			{
//				if(val%2==0)
//				{
//					flag=false;
//					break;
//				}
//			}
//			if(flag==true)
//				input_form_String ="Prime";
//			else
//				input_form_String ="Not";
//			
//			//print output
//			System.out.println(input_form_String);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
	//
	}

}
