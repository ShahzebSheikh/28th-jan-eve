package useofstaticmethid;

public class assignment2 
{
	public static void main(String[] args) 
	{
		
	
  int orinum=12345;
  int revnum=0;
  
  for (int i=orinum; i>=0; i=i/10) 
  {
	    int rem=i%10;
	    revnum=i*10+rem;
	  
  }
  System.out.println(revnum);
	}
}
