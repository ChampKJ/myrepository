
public class Operators {
/* I am studing Operators
	sfdfsdfsdf
	sfsdfdsf */
	public static void main(String[] args) {
		int a=10,b=4,c=12;
		int ans = 2*-a /3+c;
		//   2* -10 / 3+2
		// -20/3+2 = > -6+2
		//a-=5;
		
		ans = a+=3*3;  
		
		System.out.println("Answer is : " + ans);
		int age=19;
		float balAmt=200f;
		System.out.println(b!=c);
		
		if(age>=18 && balAmt>=1000)  //short circuit operators
		{
			System.out.println("You r allowed to open Account!");
		}
		else
		{
			System.out.println("Sorry ...You r NOT allowed to open Account!");
		}

	}

}
//20
//-4
//-6
//-16
//
