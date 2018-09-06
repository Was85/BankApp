import java.util.Random;
import java.util.UUID;

public class Checking extends Account {
	
	// list properties belong to Checking class
	private long debitCardNumber ;
	private int pinCode;
	
	// checking constructor 
	
	public Checking (String name , String ps ,double initDeposite){
		super(name,ps,initDeposite);
		
		accountNumber = "c"+accountNumber;
		setCardInfo();
		
		
	}
	

	@Override
	public void setRate() {
		rate = getBaseRate()*.15 ;
		
	}
	
	
	
	// method belong to this class 
	
	private  long generateRandomLongNumber(int length) {
	    Random random = new Random();
	    char[] digits = new char[length];

	    digits[0] = (char) (random.nextInt(9) + '1');
	   
	    for (int i = 1; i < length; i++) {
	        digits[i] = (char) (random.nextInt(10) + '0');
	    }
	     
	    
	    return Long.parseLong(new String(digits));
	}
	
	private void setCardInfo() {
		debitCardNumber = generateRandomLongNumber(12);	
		pinCode = randomNumber(1000, 9999);
	}
	
	public void showDetails(){
		super.showDetails();
		
		System.out.println("Debit Card Number : "+ debitCardNumber+
				"\nPinCode: "+ pinCode);
			
			
			
		}





	

}
