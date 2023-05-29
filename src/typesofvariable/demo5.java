package typesofvariable;

public class demo5 
{
int c=20;
public static void main(String[] args) 
{ demo5 d4=new demo5();
System.out.println(d4.c);
demo6 d6=new demo6();
System.out.println(d6.e);
demo5.m1();
	
	
}
public static void m1() 
{
demo5 d5= new demo5();
System.out.println(d5.c);
	
}
public void m2() 
{
	System.out.println(c);
}

}
