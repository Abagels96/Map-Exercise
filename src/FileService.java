import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileService {

	
	 public void readFileToConsole(String fileName) throws IOException    {
	    	Map<String, String > pokerCount= new HashMap<>();
	    	
	    	BufferedReader reader= new BufferedReader(new FileReader("PokerHands.csv"));
	    	
	    	String lines= "";
	    	reader.readLine();
	    	while((lines=reader.readLine())!=null) {
	    		System.out.println(lines);
	    	    	String[] allOfIt= new String[44];
	    	    	
	    	    	allOfIt= lines.split(",");
	    	    	
	    	    	System.out.println(Arrays.toString(allOfIt));
	    	    	int i=0;

	 

 pokerCount.put(allOfIt[0],allOfIt[1]);
 System.out.println(pokerCount);
	    	
	    }
	    	
	    	Integer hand= pokerCount.size();
	    	System.out.println(hand);
	    	String playerName="Patrick Stewart";
	     int i=0;
	    	
	    	pokerCount.forEach((playerName1,value)-> 
	    	{if(pokerCount.containsValue("FLUSH")) {
			
			
			
	};
	if (playerName!= null) {
		pokerCount.put(playerName,"i"+1);
	}
	    	

		
});
}
}