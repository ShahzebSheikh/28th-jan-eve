package mock21;

public class Rev_string 
{
public static void main(String[] args)
{
	String s1="domarP";
	String rev="";
	for(int i=s1.length()-1;i>=0;i--) 
	{
		rev=rev+s1.charAt(i);}
		System.out.println(rev);
		
		if(s1.equals(rev)) 
		{
		System.out.println("palindrom");
		}
		else 
		{
			System.out.println("not palindrom");
			}
	
}

}
