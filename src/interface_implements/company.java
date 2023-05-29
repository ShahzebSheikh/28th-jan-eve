package interface_implements;

public interface company 
{
	// Generalisation
	
   void labour();
   void helper();
   void engg();
   
   
   public static void main(String[] args) 
   {
	System.out.println("feature of wipro company");
	sample2 s2=new sample2();
	s2.labour();
	s2.helper();
	s2.engg();
	s2.HR();
	
	System.out.println("feature of facebook company");
	sample3 s3=new sample3();
	s3.labour();
	s3.helper();
	s3.engg();
	s3.HR();
	
	System.out.println("feature of google company");
	sample4 s4=new sample4();
	s4.labour();
	s4.helper();
	s4.engg();
	s4.HR();
	
	
	
	
   }
   
}
