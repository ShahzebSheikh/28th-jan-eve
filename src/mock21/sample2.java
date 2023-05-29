package mock21;

public class sample2 
{
	// method overloading
	
  public void add(int a, int b) 
  {
	  System.out.println(a+b);
  }
  
  public void add(int x,int y,int z) 
  {
	System.out.println(x+y+z);
  }
  
  public static void main(String[] args) 
  {
	sample2 s2=new sample2();
	s2.add(5, 10);
	s2.add(50, 100, 200);
  }
}
