package mashalkar_sir;

public class prime_no
{
public static void main(String[] args) 
{
	int count=0;
	for(int i=1;i<=100/2;i++) 
	{
		
		if(100%i==0) 
		{
			
		}	
		
		count++;
	    if(count>1) {
	    	System.out.println("no is not prime "+i);
	    }
	    else {
	    	System.out.println("no is prime "+i);
	    }
	
	}
}

}
