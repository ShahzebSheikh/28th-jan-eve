package loops;

public class assignment2 
{
public static void main(String[] args) 
  {
	String methodname="m1";
	switch(methodname)
	{
	case "m1":
	   {
		System.out.println("switchcase even and odd no");
		m1();
		break;
	   }
	   default:
	   {
		   System.out.println("methodname not found");
	   }
	}
	
	
	
	
  }
	public static void m1() {
	int a=20;
	while(a>=1) 
	{
		if(a%2==0) 
		{
			System.out.println("Even no square "+a+"="+(a*a));
		}
		else 
		{
			System.out.println("Odd no cube "+a+"="+(a*a*a));
		}
		a--;
	}
  }

}