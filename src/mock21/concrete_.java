package mock21;

public class concrete_ extends abstract_

{
	public void d1() 
	   {
		   System.out.println("method d1 from concrete class");
	   }
	public void d2() 
	   {
		   System.out.println("method d2 from concrete class");
	   }
	
	public static void main(String[] args) 
	{
		concrete_ c=new concrete_();
		c.d1();
		c.d2();
		c.d3();
		c.d4();
	}
	   
}
