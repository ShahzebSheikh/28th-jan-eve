package typesofvariable;

public class demo2 {
	int a=30;     // global variable
	public static void main(String[] args) 
	{
		demo2 m3=new demo2();
		m3.m1();
		m3.m2();
	}
    public void m1() 
    {
    	int b=10;   //local variable
    	System.out.println(a);
    	System.out.println(b);
    }
    public void m2() 
    {
    	System.out.println(a);
    }
}
