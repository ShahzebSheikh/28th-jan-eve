package practice;

public class example2 
{
       public static void main(String[] args) 
       {
		 String s1="SHAHZEB sheikh";
		String s2[] =s1.split(" ");
	
		
		 for(int i=0;i<=s2.length-1;i++) 
		 {
			 String uppercase=s2[i].toUpperCase();
					 
             
					 if(s2[i]==uppercase) 
              {
            	  System.out.println(s2[i].toLowerCase()+" ");
              }
              
		 }
		 
		 for(int j=0;j<=s2.length-1;j++) 
		 {
			 String lowercase=s2[j].toLowerCase();
			 
			 if(s2[j]==lowercase) 
			 {
				 System.out.println(s2[j].toUpperCase()+" "); 
			 }
		 }
		
	   }
}
