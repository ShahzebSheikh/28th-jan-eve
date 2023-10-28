package mashalkar_sir;


import java.util.Scanner;

public class prime


{
  public static void main(String[]args)
  {
      
      System.out.println("enter the number");
      int count;
      Scanner sc= new  Scanner(System.in);
      int n1=sc.nextInt();
      for(int j=2;j<=n1;j++)
      {
          count=0;
           
          for(int i=1;i<=j;i++)
          {
              if(j%i==0)
              {
                  count++;
              }
          }
          
         if(count==2)
         {
              System.out.println("The prime no is:"+j);
         } 
      }
      
      
  }  
}
