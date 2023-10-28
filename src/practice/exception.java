package practice;

public class exception 
{
	public static void main(String[] args) 
	{
		String s1="rest assured";
		
		try 
		{
			System.out.println(s1.charAt(15));
		}
		
		catch(Exception s2)
		{
			System.out.println("Exception is: "+s2);  
		}
	}
	
	

}
