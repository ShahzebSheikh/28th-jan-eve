package String_class;

  public class length_method 
    {
       public static void main(String[] args) 
      {
	String s1="shahzeb";
	String s2="SHAHZEB";
	String s3="";
	String s4="velocity institute of pune";
	
	System.out.println(s1.length());   // to  calculate length of string
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s2.equals(s1));
	System.out.println(s2.equalsIgnoreCase(s1));
	System.out.println(s1.contains("h"));
	System.out.println(s3.isEmpty());
	System.out.println(s4.charAt(9));
	System.out.println(s4.startsWith("v"));
	System.out.println(s4.endsWith("pune"));
	System.out.println(s2.concat(s4));
	System.out.println(s4.indexOf("t"));
	System.out.println(s4.lastIndexOf("t"));
	System.out.println(s4.replace("pune","Mumbai"));
	System.out.println(s4.substring(9));
	System.out.println(s4.substring(9, 19));
	
	
	
     }
   }
