package mashalkar_sir;

public class duplicate_char_Array 
{
public static void main(String[] args) 
{
	//String name = "MADAMADAM";
	//char [] ar= name.toCharArray();
	
	int ar[]= {1,5,6,8,5,2,6,8,5,2,1,1,5,6,8};
	for(int i=0;i<ar.length;i++) 
	{
		for(int j=i+1;j<ar.length;j++) 
			
		{
			if(ar[i]==ar[j])
			
			System.out.println("duplicate character is = " + ar[j]);
		}
	}
}
}
