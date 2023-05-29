package loops;

public class assignment1 
{
	public static void main(String[] args) 
	{
		for(int i=20;i>=1;i--) 
		{
			if(i%2==0)
			{
				System.out.println("Even no square "+i+"="+(i*i));
			}
			else 
			{
				System.out.println("Odd no cube "+i+"="+(i*i*i));
			}
		}
	}

}
