package constructor;

public class reversestring 
{
public static void main(String[] args) {
	String line="AVAJ";
	String rev=" ";
	int l=line.length();// l=4
	for(int i=l-1; i>=0;i--) 
	{
		rev =rev+line.charAt(i);
	}
	System.out.println(rev);
}
}
