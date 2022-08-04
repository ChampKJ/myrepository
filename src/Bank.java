
public class Bank 
{
	public static void main(String s[])
	{
		RBIRules r = new RBIRules("Initial 1Ruppee value is $75");
		Locker l = new Bank().new Locker();
		l.lockerInfo();
	}
	String bName,ifscCOde;
	int x=100;
	Bank(){}
	Bank(String n,String i)
	{
		bName = n;
		ifscCOde = i;
	}
	private void showBankDetails()
	{
		System.out.println(bName + " has IFSC Code "+ifscCOde);
	    Bank.RBIRules r = new Bank.RBIRules("Rs.1 is equivalent to 80$");
	    r.showRulesApplicable();
	    Bank.RBIRules.changeRule("Rs.1 is equivalent to $70");
	    r.showRulesApplicable();
		//Locker l = this.new Locker();
//		l.lockerInfo();
	}
	
	static class RBIRules
	{
		static String rule;
		public RBIRules(String s)
		{
			rule=s;
			System.out.println("RBI Rules inintialized!");
		}
		public  void showRulesApplicable()
		{
			System.out.println(rule);
			//System.out.println(bName); // w=can access only static members of outer class
		}
		public static void changeRule(String newRule)
		{
			rule=newRule;
		}
		
		
	}

	private class Locker
	{
		int x=90;
		int lId;
		String lockerLocatioin;
		Locker()
		{}
		Locker(int i,String n)
		{
			lId=i;
			lockerLocatioin = n;
		}
		public void lockerInfo()
		{
			int x=200;
			//showBankDetails();
			System.out.println(bName + " has IFSC Code "+ifscCOde);
			System.out.println("Locker system id is "+lId);
			System.out.println("Locker system avaibale is available at Location" + lockerLocatioin);
			System.out.println("Local variable x = " + x);
			System.out.println("x of Locker class ="+x);
			System.out.println("x of Bank Class ="+Bank.this.x);
		}
	}
	
	
}
