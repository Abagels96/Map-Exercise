import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileService {
Map<String, Integer > pokerCount= new HashMap<>();
	    	  String[] allOfIt= new String[2];

	 public void readFileToConsole(String fileName) throws IOException    {
	    	
	    	BufferedReader reader= new BufferedReader(new FileReader("PokerHands.csv"));
	    	
	    	String lines= "";
	    	reader.readLine();
	    	while((lines=reader.readLine())!=null) {
	    		System.out.println(lines);
	    	    	
	    	    	
	    	    	allOfIt= lines.split(",");
	    	    	
	    	    	System.out.println(Arrays.toString(allOfIt));
	    	    	
	    	    	
	    	     Integer counter=0;
String person=allOfIt[0];
 pokerCount.put(person,counter);
 System.out.println(pokerCount);	
 String hand="FLUSH";
 for (String firstHand:allOfIt) {
	 		pokerCount.put(person, 1);
	 		if(firstHand.contains(hand)) {
	 			System.out.println("found it ");
	 			
	 			pokerCount.put(person,pokerCount.get(person)+1);
	 			
	    	}
	 	
	 		
	    	  
	    pokerCount.forEach((key, value)-> System.out.println("Person is:" + key +"number of time it is found"+ value));		
}	
	 	

	    	}
	 }
}
	 
