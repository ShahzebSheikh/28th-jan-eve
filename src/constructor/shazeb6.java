package constructor;

public class shazeb6
{
  shazeb6(int a)
  {
	  System.out.println("single argument constructor:="+ a);
  }
  shazeb6(int b, int c)
  {
	  this(10);
	  System.out.println("second argument constructor:="+ b +c);
  }
  shazeb6(int p,int q,int r)
  {
	  this(20,10);
	System.out.println("third argument constructor:="+ p + q + r);		  
  }
  public static void main(String[] args) {
	shazeb6 s1=new shazeb6(5,10,15);
}
}
