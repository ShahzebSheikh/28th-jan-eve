package String_class;

public class split
{
  public static void main(String[] args) 
  {
	String s1="velocity institute of testing in pune";
	String b1[]=s1.split(" ");
	
	System.out.println(b1[3]);
	System.out.println(b1.length);
	
	for (int i=0; i<=b1.length-1;i++) 
	{
		System.out.println(b1[i]);
	}
  }
	
}
