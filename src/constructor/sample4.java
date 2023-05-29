package constructor;

public class sample4 
{
   int a;  //5
   int b;  //10
   
   sample4(int x,int y)
   {
	  a=x;
	  b=y;
   }
   
   void swap() 
   {
	   int swap;
	   System.out.println("before swapping a "+ a+" and b "+ b);
	   swap=a;
	   a=b;
	   b=swap;
	   System.out.println("after swapping a "+ a +" and b "+ b);
	   
   }
    public static void main(String[] args) 
    {
		new sample4(5,10).swap();
	
	}
   
}
