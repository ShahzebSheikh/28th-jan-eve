package mashalkar_sir;

import java.util.Scanner;

public class Split_after_comma 
{
	public static void main(String[] args)
	{
	String s1;
	Scanner s2 =new Scanner(System.in);
	System.out.println("Enter the string");
	s1=s2.nextLine();
	String s[]=s1.split(",");
	for(int i=0;i<=s1.length()-1;i++) {
	
	System.out.println(s[i]+" ");
	}

	}


}
