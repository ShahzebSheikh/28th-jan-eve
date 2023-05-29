package mashalkar_sir;

import java.util.Scanner;

public class split_word
{
	public static void main(String[] args)
	{
	String s1;
	System.out.println("enter the word");
	Scanner sc= new Scanner(System.in);
	s1=sc.nextLine();
	String s[]=s1.split("");

	for(int i=0;i<=s.length-1;i++)
	{
	  System.out.println(s[i]);

	}



	}
}
