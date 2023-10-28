package practice;

public class construct2 extends construct
{
	construct2 ()
	{
        this(50000, 5000);
		
	}
	construct2 (int a,int b)
	{
		int sub=a-b;
		System.out.println(sub); 
		
	}
	
	public static void main(String[] args) 
	{
		construct2 c2=new construct2();
	}
	
}
