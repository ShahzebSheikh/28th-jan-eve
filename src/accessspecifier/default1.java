package accessspecifier;

public class default1 
{
     private int a;
     
     private default1() 
     {
    	 a=20;
     }
     
     private void square() 
     {
    	 System.out.println(a*a);
     }
     
     public static void main(String[] args) 
     {
		default1 s1=new default1();
		s1.square();
	 }
}
