package practice;

public class upcasting2 extends upcasting1
{
	 public void e1() 
	    {
			System.out.println("method from e1: up2"); 
		} 
	 
	 public  void e2() 
	    {
			System.out.println("method from e2: up2"); 
		} 
	 
	 public void e3() 
	    {
			System.out.println("method from e3: up2"); 
		} 
	 
	 public void e4() 
	    {
			System.out.println("method from e4"); 
		} 
	 
	 public static void main(String[] args) 
	 {
		upcasting1 up1=new upcasting2();
		up1.e1();
		up1.e2();
		up1.e3();
		
	 }
}
