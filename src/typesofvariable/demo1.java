package typesofvariable;

public class demo1 {
	
	int a=20;
	
	public void m1() 
	{
		int b=10;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void m2() 
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		{
			demo1 d1=new demo1();
			d1.m1();
			d1.m2();
			
			
			
		}
	}
	
	

}
