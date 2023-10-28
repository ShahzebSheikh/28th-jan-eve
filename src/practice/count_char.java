package practice;

public class count_char 
{
	public static void main(String[] args) 
	{
		String str="shahzeb";
		int count=0;
		
		for(int i=0; i<=str.length()-1;i++) 
		{
			char ch=str.charAt(i);
			System.out.println(ch);
			count++;
			
		}
		System.out.println(count);
	}
}
