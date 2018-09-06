import java.util.LinkedList;

import javax.xml.transform.Source;
import Source.*;
public class BankAccountApp {

	public static void main(String[] args) {
		
		/*Checking c1 = new Checking("waseem", 23569876, 2000);
		

		Savings s1 = new Savings("ZoZo", 54980919, 1500);
		
		
		c1.showDetails();
		c1.compundeRate();
	
		s1.showDetails();
		s1.compundeRate();*/
		
		String file = "C:\\Users\\Waseem\\workspace\\BankAccountApp\\src\\Source\\test.CSV";
		CSV re = new CSV();
		
		LinkedList<Account> accountsList = new LinkedList<>();
		
		LinkedList<String[]> holdersList=  re.readCSV(file);
		
		for(String[] holders :holdersList){
			
			String name =holders[0];
			String personalNumber=holders[1];
			String accountType =holders[2];
			
			double initAmount = Double.parseDouble(holders[3]);
			
			//System.out.println("\n Nmae: "+ name+"\n PersonalNumber : "+personalNumber+
				//	"\n Account Type : "+accountType+"\n initAmount : "+initAmount);
					
			if(accountType.trim().equals("Checking")){
				accountsList.add(new Checking(name, personalNumber, initAmount));
				
			}
			else if (accountType.trim().equals("Savings")){
				accountsList.add(new Savings(name, personalNumber, initAmount));
			}
			else System.out.println("Error !!!");
			
		}
		
		for(Account acc :accountsList){
			System.out.println("***********");
			acc.showDetails();
		}
		
	}

}
