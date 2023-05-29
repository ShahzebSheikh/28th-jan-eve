package constructor;

public class sample2
{

	// within same class Using this() keyword
	
	    // default constructor 1
	    // default constructor will call another constructor
	    // using this keyword from same class
	    
	   
	     sample2()
	    {
	        // calls constructor 2
	        this(5);
	        System.out.println("The Default constructor");
	    }
	 
	    // parameterized constructor 2
	    sample2(int x)
	    {
	        // calls constructor 3
	        this(5, 15);
	        System.out.println(x);
	    }
	 
	    // parameterized constructor 3
	    sample2(int x, int y)
	    {
	        System.out.println(x * y);
	    }
	 
	    public static void main(String args[])
	    {
	        // invokes default constructor first
	        new sample2();
	    }
	}
	

