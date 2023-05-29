package String_class;

import java.util.Arrays;
import java.util.Scanner;

public class scanner 
{
	public static void main(String[] args) {

		String name;
		
		System.out.println("enter the name");
		
		Scanner sc=new Scanner(System.in);
		
		name=sc.next();
		System.out.println(name);
		String s[]=new String[5];
		
		System.out.println("please enter the name");
		for(int i=0;i<=s.length-1;i++)
		{
			s[i]=sc.nextLine();
		}
		Arrays.sort(s);
		
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]);
		}
	}

}
