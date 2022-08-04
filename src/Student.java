
class Student
{
static int cnt,objectCount;
  public static String schoolName="City Internation school";
  int roll,m1,m2;
  String name,grade;
  
  public String toString()
  {
	  String str= "ROll : " + roll + " Mars1 : " +m1+ "Marks2 : " +m2
			  +"\nName :" + name;
	  return str;
  }
  
  static
  {
	  System.out.println(" THis is static block 1");
	  cnt=1000;
  }
  Student()  //Default Constructor
  {
	  System.out.println("I am in Default Constructor ");
	  roll=++cnt;
	  m1=67;
	  m2=78;
	  name="Savita";
	  grade="A";
	  objectCount++;
  }
  Student(String name,String grade)
  {

	  objectCount++;
	 // this(101,66,77,name,grade);
	  System.out.println("Constructor with two String called");
	  this.name=name;
	  this.grade=grade;
	  
  }
  
  Student(int mk1,int mk2,String n,String g) //Parametrized COnstrutor
  {
	  this(n,g);
	  System.out.println("I am in Parameterized Constructor ");
	  this.roll=++cnt;
	  m1=mk1;
	  m2=mk2;

	  
	  
  }
  Student(String g,int rr,int mk1,int mk2,String n) //Parametrized COnstrutor
  {
	  System.out.println("I am in Parameterized Constructor1 ");
	  roll=rr;
	  m1=mk1;
	  m2=mk2;
	  name=n;
	  grade=g;
	  
  }
  //Static methods helps to write general purpose uitility tasks
  public static void viewSchoolRating() // static / class method 
  {
	//  int roll=87878;
	  System.out.println("School Name is : "+ schoolName);
	  System.out.println(" It is with 5 Stars");
	  //System.out.println("Roll No is  : "+ roll);
  }
  
  public void showRecord() //instance /non static method
  {
	System.out.println("School Name is : "+ schoolName); 
    System.out.println("ROll:"+ roll + "M1:" + this.m1 +"M2:"+ this.m2);
    System.out.println("Name:"+ name+ "Pass with:"+ grade);
  }
  static
  {
	  System.out.println("Static block 2 has worked!");
	  	objectCount=500;

   }
  public void acceptDetails(int r,int marks1,int marks2,String n,String g) // instance method
  {  
	  m1=marks1;
	  m2=marks2;
	  roll=r;
      name=n;
      grade=g;
      System.out.println("Object initialized!");
  }
  
  
}
