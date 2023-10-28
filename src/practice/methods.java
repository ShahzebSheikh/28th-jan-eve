package practice;

public class methods 
{
    public static void main(String[] args) 
     {
	     methods m1=new methods();
	     m1.a2();
	    
     }
    
    public static void a1() 
    {
    	System.out.println("i am from static method a1");
    }
    
    public void a2() 
    {
    	System.out.println("i am from non static method a2");
    	a1();
    }
}
