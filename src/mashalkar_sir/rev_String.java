package mashalkar_sir;

public class rev_String
{
	public static void main(String[] args)
	{
	String name="velocity"	;
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--) 
	{
		rev=rev+name.charAt(i);
	}
			
		System.out.println(rev);
		
	}

}
