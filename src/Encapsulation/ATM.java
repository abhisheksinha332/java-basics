package Encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Enc obj=new Enc();
		
		obj.updatePin(123456,1234,5454);
		
	   obj.withdrawAmount(123456,5454,4000);
	   
	   obj.depositCash(123456,5454,5000);
	}

}
