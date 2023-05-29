package String_class;

public class scanner3
{
	public static void main(String[] args) {
		scanner3 s2=new scanner3();
		        s2.upercase();
		        s2.lowercase();
		        s2.concat();
		        s2.trim();
	}
	
	public void upercase() {
		String text="hello world";
		String  text2= text.toUpperCase() ;
		System.out.println("Old string is" +text);
		System.out.println("New string is " +text2);
		
		System.out.println("--------------------------------------");
	}
	public void lowercase() {
		String text="HELLO WORLD";
		String  text2= text.toLowerCase();
		System.out.println("Old string is"   +text);
		System.out.println("New string is "  +text2);
		System.out.println("--------------------------------------");
	}
	public void concat() {
		String  fname="pramod ";
		String   lname="gawade ";
		 String fullname=fname.concat(lname);
		 System.out.println("full name is   "  +fullname);
		 System.out.println("---------------------------------------------");
	}
	public void trim() {
		String text="           hello             ";
		 String newtext=text.trim();
		 System.out.println("text after removing the spaces "+newtext);
	}
}
