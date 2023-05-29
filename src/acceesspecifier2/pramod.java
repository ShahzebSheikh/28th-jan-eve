package acceesspecifier2;

public class pramod 
{
	
	public static void main(String[]artgs)
	{
	 String name="12321";
	String rev="";
	

	for(int i=name.length()-1;i>=0;i--)
	{
		
	rev=rev+name.charAt(i);
	}
	System.out.println(rev);

	if(name.equals(rev))
	{
	System.out.println("no is palindrom");

	}
	else
	{
	  System.out.println("no is not palindrom");
	}

	}

	}
	
	
	

