package loops;

public class assignment5 
{
 int num1;
 int num2;
 
 assignment5()
 {
	 num1=40;
	 num2=35;
 }
	public void add() 
	{
	System.out.println(num1+num2);	
	}
	public void sub() 
	{
		System.out.println(num1-num2);
	}
	public void mul() 
	{
		System.out.println(num1*num2);
	}
	public void div() 
	{
		System.out.println(num1%num2);
	}
	public static void main(String[] args) 
	{
		assignment5 a1= new assignment5();
		a1.add();
		a1.mul();
		a1.div();
		a1.sub();
		
	}
	
	
}
