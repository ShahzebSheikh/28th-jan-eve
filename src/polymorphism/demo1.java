package polymorphism;

public class demo1 
{
  public void add(int a,int b) 
  {
	  System.out.println(a+b);
  }
  
  public void add (int a,int b,int c) 
  {
	  System.out.println(a+b+c);
  }
  
  public static void main(String[] args)
  {
	demo1 d1=new demo1();
	d1.add(5, 10);
	d1.add(100, 200, 300);
  }
}
