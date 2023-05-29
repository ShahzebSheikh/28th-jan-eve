package mock21;

public class prime_no 
{
public static void main(String[] args) 
{
	//int num;
	
	for(int i=0;i<=100;i++) 
	{
		boolean flag=true;
		for(int j=2;j<=i/2;j++) 
		{
			if(i%j==0) 
			{
				flag=false;
				break;
			}
			
		}
		if(flag) 
		{
			System.out.println("prime no is "+i);
		}
			
	}
	
}
}
