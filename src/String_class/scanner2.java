package String_class;

public class scanner2 
{
	public static void main(String[] args) {
		scanner2 s1=new scanner2 ();
		         s1.length();
		          s1.substring();
		          s1.replace();
		          s1.replaceall();
	}
	public void length() {
		
		//to calculate length of string
		     String name="pramod";                         // if you write a number
			String text="abcdefghijklmnopqrstuvwxyz";
			  int size=text.length();
	System.out.println("the length of the string is "+size);
		System.out.println("the length of the name is"+name.length());
		
		
	}
	public void substring() {
		String name="pandharpur";
		//name.subSequence(7,9);
		System.out.println("the substring of string is "+name.substring(0, 7));
		System.out.println("the substring of string is "+name.substring(7));
		System.out.println("the substring of string is"+name.subSequence(0, 7));
	}
	public void replace() {
		String text="hi good morning";
		String newtext ="";    
		   newtext=text.replaceFirst("morning","night" );
		   System.out.println("The new text is  "+newtext);
		   
	}
	public void replaceall() {
		String text="I like cat ,Cat is very danger, Cat have four la,Cat have one tell.Cat have two ears";
		 String newtext=text.replaceAll("cat", "dog") ; 
		 System.out.println("The old text is "+text);
		 System.out.println("The replced text is "+newtext);
		 
	}

}
