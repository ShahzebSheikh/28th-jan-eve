package mashalkar_sir;

public class count_no_string 
{
public static void main(String[] args) 
{
	String s1="mashalkar sir form velocity";
	String b1[]=s1.split(" ");
	int count=0;
	//System.out.println(b1.length);
	
	for(int i=0;i<=b1.length-1;i++) 
	{
		System.out.println(b1[i]+" ");
	
	count++;
	}
	System.out.println("Number of words "+count);

	
	
	
	//System.out.println(s1.length());
}
}
