package practice;

public class mehods2 extends methods
{
    public static void main(String[] args) 
    {
    	mehods2 m2=new mehods2();
    	m2.n1();
    	m2.n2();
    	m2.a1();
	} 
    
    public void n1() 
    {   this.n2();
		super.a1();
		System.out.println("printing from method n1");
		
	}
    
    public void n2() 
    {
		super.a2();
		System.out.println("printing from method n2");
	}
    
    public static void a1() 
    {
    	System.out.println("printing from method 2: a1");
    }
    
    
    
}
