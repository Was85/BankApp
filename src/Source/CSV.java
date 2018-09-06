package Source;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CSV {
	
	
	
	public LinkedList<String []> readCSV (String file){
		LinkedList<String[]> myList = new LinkedList<String[]>();
		String csvLine;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while ((csvLine = reader.readLine()) !=null){
			
			String[] splitedLine = csvLine.split(",");
			
			myList.add(splitedLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("There Is no such File !!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return myList ;
		
		
	}

}
