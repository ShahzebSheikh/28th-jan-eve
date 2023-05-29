package methods3;

public class sample10 {
	public static void main(String[] args) {
		int shopping = 1000;
		
		if (shopping>=1000) {
			System.out.println("20% discount");
		
		if (shopping>=3000) {
		System.out.println("10% discount");	
		}
		if (shopping >=2000) {
			System.out.println("5% discount");
		}
		if (shopping>=1000) {
			System.out.println("No discount");
		}
		
		else {
			System.out.println("delivery charges apply");
		}
		} 
		else {
			System.out.println("50 rs delivery charges");
	}
	}
}
