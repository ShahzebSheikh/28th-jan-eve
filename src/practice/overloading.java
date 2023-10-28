package practice;

public class overloading 
{
	     public static void d1() 
	     {
			System.out.println("non parameterize method");
		 }
	     
	     public static void d1(int a,int b) 
	     {
			int sub=a-b;
			System.out.println(sub); 
		 }
	     
	     public static void d1(int a,int b,int c) 
	     {
			int sum=a+b+c;
			System.out.println(sum); 
		 }
	     
	     public static void main(String[] args) 
	     {
			
			d1();
			d1(100, 50);
			d1(10, 20, 30);
		 }
	     

}
