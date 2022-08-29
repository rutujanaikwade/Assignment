package Finzly.Homework.Assignment;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.*;

	public class AssignmentOne {
		
			public static void main(String[] args) throws IOException {
				// Location the csv file
				
				String path ="C:\\Users\\Fresher1\\CurrencyPairs.csv";
				
				String line="";
				String[] values = null;
				
					ArrayList<CurrencyPair> al= new ArrayList<CurrencyPair>();
					BufferedReader buffererReader= new BufferedReader(new FileReader(path));
						while((line = buffererReader.readLine())!=null) {
							values = line.split(",");
							CurrencyPair currencyPair = new  CurrencyPair(values[0],values[1],values[2],values[3],values[4],values[5]);
							al.add(currencyPair);
						}
						
						searching(al); // retrieve data by searching values of Currency1+currency2
						
			
						}
			
			 private static void sortDate(ArrayList<CurrencyPair> al) {
				   Collections.sort(al, new AssignmentThree());
			}
			 
			 
			static CurrencyPair searching(ArrayList<CurrencyPair> al) {
				   Scanner sc = new Scanner(System.in);
				   System.out.println("Enter Ccy pairs :");
				   String currency = sc.next();
				  
					for(CurrencyPair cp : al) {
						if(currency.equalsIgnoreCase(cp.getCcy1()+cp.getCcy2())) {
							System.out.println(cp);
						}
					}
					return null;
					
			  }
			   static void sortion(ArrayList<CurrencyPair> al) {
					Collections.sort(al);
					for(CurrencyPair o: al) {
					System.out.println(o);
				   
			   }
					
			   	  }
		}