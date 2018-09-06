import java.security.Permissions;

public abstract class Account implements IBaseRate {
	
	// list common properties for different account 
	private String name ;
	private String personalNumber;
	private 	double balance ;
	protected double rate ;
	 static int i = 10000;
	protected String accountNumber;
	
	// constructor 
	public Account(String name , String ps ,double initDeposite ){
		
		this.name = name ;
		personalNumber = ps;
		balance = initDeposite ;
		i++;
		// account Number
		accountNumber = generateAccountNumber();
		
		setRate();
			
	}
	
	// common method 
	
	
	public void deposit(double amount){
		balance+=amount;
		System.out.println(amount+"$ Added Successfully. ");
	}
	
	public void withdrwa(double amount){
		balance-=amount;
		System.out.println(amount+"$ Withdraw Successfully. ");
	}
	
	public void transactione(String reciverAccount , double amount){
		balance-=amount;
		System.out.println(amount+"$ transfer Successfully To"+reciverAccount);
		
	}
	
	public void currentBalance(){
		System.out.println("\nYour Current Balance is : "+ balance);
	}
	
	public void compundeRate(){
	double	positiveInterest = balance*(rate/100);
	balance+=positiveInterest;
	System.out.println("Accrued Interest : "+positiveInterest);
	currentBalance();
	}
	
	public abstract void setRate();
	
	private String generateAccountNumber(){
		String  twoDig=(personalNumber.substring(7));
		
		
		int lastTwodDigitsOfPN = Integer.parseInt(twoDig.trim());
		int UniqId = i;
		int upperBound = 999;
		int lowerBound = 100;
	
		
	   return lastTwodDigitsOfPN+""+UniqId+""+randomNumber(lowerBound,upperBound);
		
	}
	
	public int randomNumber(int lowerBound , int upperBound ){
		
		
		return ( lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1)));

		
	}
	
	// print details 
	
	public void showDetails(){
	System.out.println("Name "+name+"\n"+
						"Account Number "+ accountNumber+"\n"+
						"Balance "+ balance+"\n"+
						"Rate : "+rate+"%");	
		
		
	}
		
	}


