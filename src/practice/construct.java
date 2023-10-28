package practice;

public class construct 
{
	int a;
	int b;
    construct(int n1,int n2) 
        {
    	this();
	          a=n1;
	         b=n2;
	         int add=a+b;
	         System.out.println(add);  
        }
     
     construct()
     {
    	 
    	System.out.println("printing from non parameterize constructor"); 
     }
     
     public static void main(String[] args) 
     {
    	
		construct c1=new construct(50,500);
		
	 }
}
