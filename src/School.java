import java.util.Arrays;
import java.util.Scanner;

class School
{
	
	public void acceptStudentDetails(Student s[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Enter Student Record1:");
		System.out.println("Enter Student Marks1");
		int m1 = sc.nextInt();
		
		s[i] = new Student(m1,45, "AMol", "Fail");
		}
		//showStudents(s);
		
	}
	public void showStudents(Student arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			arr[i].showRecord();
			System.out.println("________________________________________");
		}
//		for(Student x : arr)
//		{
//			System.out.println(x);
//			System.out.println("_______________________");
//		}
	}
	public static void main(String str[])
	{
		//Student s = new Student("A+", 190, 98, 90, "Amol");
		//System.out.println(s); //s.toString();
		//s.showRecord();
		
		Student[] s;
		s = new Student[5];
		
		System.out.println(Arrays.toString(s));
		
		School o = new School();
		o.acceptStudentDetails(s);
		o.showStudents(s);
}

}
