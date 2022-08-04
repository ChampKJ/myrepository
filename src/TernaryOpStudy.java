import java.util.Scanner;

public class TernaryOpStudy {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number 1 : ");
	int n1 = sc.nextInt();
	System.out.println("Enter number 2 : ");
	int n2 = sc.nextInt();
	
	//int msg = n2> n1 ? n2  : n1;
	//System.out.println(msg + " is biggest number");
	
	String m = n2>0 ? n2+ " is  positive" : n2<0? n2+ " is negative"  : " It is ZERO"    ;
	System.out.println(m);
	}

}
