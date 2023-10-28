package practice;

public class example3 
{
public static void main(String[] args) 
{

    String s1="SHAHZEB sheikh";
  String ar[]=s1.split(" ");
    
   // for(int j=0;j<=s1.length-1;j++)
   // {
        char ch[]=s1.toCharArray();
        
        for(int i=0;i<=ch.length-1;i++)
        {
            if(Character.isUpperCase(ch[i]))
            {
                System.out.print(Character.toLowerCase(ch[i]));
            }
            
            else
            {
                System.out.print(Character.toUpperCase(ch[i]));
            }
        }
    
}
}
