package practice;

public class methods4 extends methods3 
{
  public static void main(String[] args) 
  {
	methods4 m4=new methods4();
	m4.c2();
  }
  public void c1() 
  {
	  System.out.println("printing from c1"); 
  }
  
  public void c2() 
  {
	  
	  super.b1(50, 100);
	  this.c1();
	  System.out.println("printing from c2"); 
  }
}
