package constructor;

public class sample3 extends sample2

// constructor calling from another class by using super keyword
{
   sample3()
   {
	   super();
	   
	   System.out.println("constructor from othe clas");
   }
   
   public static void main(String[] args) 
  {
	new sample3();
   }
}
