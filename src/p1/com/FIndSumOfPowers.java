package p1.com;

import java.util.Scanner;

public class FIndSumOfPowers {

	public int countDigits(int x)
	{
		int cnt=0;
		while(x>0)
		{
			cnt++;
			x=x/10;
		}
		return cnt;
	}
	public int findPower(int base,int power)
	{
		int multi=1;
		for( ;power >=1;power--)
		{
			multi=multi*base;
		}
		return multi;
	}
	public int calPowersSum(int number)//345
	{
		int sum=0;
		int digit=countDigits(number); //3
		while(number>0)
		{
			int rem = number%10;
			sum+=findPower(rem, digit);
			number/=10; // 0
			digit--;//0
		}
		return sum;
	}
	public static void main(String[] args) {
		FIndSumOfPowers p = new FIndSumOfPowers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int no = sc.nextInt();
		int sum = p.calPowersSum(no);
		System.out.println("Answer is : " + sum );
	}

}
