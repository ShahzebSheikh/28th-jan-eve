package practice;

public class overriding2 extends overriding
{
	 public static void m1() 
	    {
			System.out.println("printing from m1 ov2");  
		} 
	
	 public static void main(String[] args) 
	 {
		overriding2 o2=new overriding2();
		o2.m1();
		
		overriding o1=new overriding2();
		o1.m1();
		
		
	 } 
}
