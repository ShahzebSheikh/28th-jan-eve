package polymorphism;

public class son extends father
{
   public void bike() 
   {
	   System.out.println("Bike: Honda Shine");
   }
   
   public void car() 
   {
   	System.out.println("car: Fortuner");
   }
   
   public void farm() 
   {
   	System.out.println("farm: 5 Acre");
   }
   
   public void money() 
   {
   	System.out.println("Money: 15 lakh");
   }
   
   public static void main(String[] args) {
	father s5= new son();
	//s5.bike();
	s5.car();
	s5.farm();
	s5.home();
	s5.money();
}
}
