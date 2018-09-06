
public class Savings  extends Account {

	// list properties belong to Saving class
private 	int safetyBoxId ;
private	int safetyBoxKey;
	
		// Saving constructor 
	
	public Savings (String name , String ps ,double initDeposite){
		super(name,ps,initDeposite);
		accountNumber = "S"+accountNumber;
		
		setSafetyBox();
		
		
	}
	
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate()-.25 ;
	}
	
		
		


		// method belong to this class 
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Safety Box ID :" + safetyBoxId +
				" \n Safety Box Key :"+safetyBoxKey);
		
			
			
		}
	
	private void setSafetyBox() {
		safetyBoxId = randomNumber(100, 999);
		
		safetyBoxKey =randomNumber(1000, 9999);
			
		}
}
