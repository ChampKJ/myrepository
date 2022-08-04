

//1 anonymous inner class as subclass of some class

abstract class Authentication
{
	abstract public void doAuthentication(String user,String pass);
	
}

class DigitalAuthentication extends Authentication
{
	public void authenticateUserDigitally()
	{
		System.out.println("Digital signature used for authentication");
	}
	public void doAuthentication(String user,String pass)
	{
		System.out.println(" Authenticating user : " + user);
		authenticateUserDigitally();
	}
	
}


//1 anonymous inner class as implementor class of some interface

interface Calculator
{
	void add(int x,int y);
	void multi(int x,int y);
}
class School implements Calculator
{

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multi(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}

public class InnerClass {

	 Authentication a =new Authentication()
	{
		public void authenticateUserDigitally()
		{
			System.out.println("Digital signature used for authentication");
		}
		public void doAuthentication(String user,String pass)
		{
			System.out.println(" Authenticating user : " + user);
			authenticateUserDigitally();
		}
		
	};
	
	
	
		
	public void doTak()
	{
		 Authentication b =new Authentication()
			{
				public void authenticateUserDigitally()
				{
					System.out.println("Digital signature used for authentication");
				}
				public void doAuthentication(String user,String pass)
				{
					System.out.println(" Authenticating user : " + user);
					authenticateUserDigitally();
				}
				
			};
		b.doAuthentication("KKK", "sdfdsf");
	}
	
	public void doTask1()
	{
	Calculator c = 	new Calculator()
		{
			@Override
			public void add(int x, int y) {
				System.out.println("Addition is " + (x+y));
				div(x,y);
			}
			@Override
			public void multi(int x, int y) {
				// TODO Auto-generated method stub
				System.out.println("Multiplication is "+(x*y));
			}
			public void div(int x,int y)
			{
				System.out.println("Division is "+(x/y));
			}
		
		};
		
		c.add(4, 45);
		c.multi(67,3);
	
	}
	
	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.doTask1();
		//a.doAuthentication("KKK", "dad");
//		Bank boi=new Bank("Bank of India", "BOIC3434");
//		//Bank.Locker lo = boi.new Locker(3232323,"Lakshmi Road,Pune");
//		//lo.lockerInfo();
//		Bank.RBIRules r = new Bank.RBIRules("Initial 1Ruppee value is $75");
//		r.showRulesApplicable();
//		Bank.RBIRules.changeRule("changed 1Ruppee value is $85");
//		r.showRulesApplicable();
//		
//		//Anonymous inner class

	
	
		
		
		
		
		
	
	
	
	
	}

}




