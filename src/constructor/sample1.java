package constructor;

public class sample1 
{

// constructor and method having same name
     sample1()
       {
    	 System.out.println("calling from constructor");
       }
    void sample1()
     {
  	 System.out.println("calling from method sample1");
     }
    
    public static void main(String[] args) 
    {
    
		new sample1().sample1();
		sample1 s1=new sample1();
		//System.out.println(s1);
		
		// it will show object and show hexadecimal
	}
}
