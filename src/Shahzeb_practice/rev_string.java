package Shahzeb_practice;

public class rev_string 
{
	public static void main(String[] args) 
	{
		String s1="hi in am pramod";
		String rev="";
	
		
		for(int i = s1.length()-1;i>=0;i--) 
		{
			rev=rev+s1.charAt(i);
	    }
System.out.println(rev);
}
}