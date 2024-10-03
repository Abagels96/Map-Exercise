import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapApplication1 {
    public static void main(String[] args) {

    	
    	

    FileService fileService= new FileService();
    
    try {
		fileService.readFileToConsole("PokerHands.csv");
		fileService.updateKey(fileService.pokerCount, fileService.allOfIt);
		fileService.updateValue(fileService.pokerCount, fileService.allOfIt);
		fileService.removeKeyValuePair(fileService.pokerCount, fileService.allOfIt);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        
    	
    	
    	
    	
    	}
    
    
   
    	
    		
    	
}
    

	

	
	


