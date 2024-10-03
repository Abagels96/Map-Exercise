import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileService {
	Map<String, Integer> pokerCount = new HashMap<>();
	String[] allOfIt = new String[2];

	public void readFileToConsole(String fileName) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("PokerHands.csv"));

		String lines = "";
		reader.readLine();
		while ((lines = reader.readLine()) != null) {
			System.out.println(lines);

			allOfIt = lines.split(",");

			System.out.println(Arrays.toString(allOfIt));

			Integer counter = 0;

			String person = allOfIt[0];
			if(allOfIt[1].equals("FLUSH")) {
				if(pokerCount.get(person)!=null) {
			pokerCount.put(person, pokerCount.get(person)+1);	
			}
			else {
				pokerCount.put(person, 1);
			}
			}
			
			System.out.println(pokerCount);
			
			

			}


		
		}

	
	
	public void updateKey(Map<String,Integer> pokerCount, String[]allOfIt) {
		
					System.out.println(pokerCount.get("Rita Repulsa"));

		
		
		pokerCount.put("Zordon",pokerCount.get("Rita Repulsa"));
		pokerCount.remove("Rita Repulsa");
		
		
		System.out.println(pokerCount);
		
		
	}
	
	public void updateValue(Map<String,Integer> pokerCount, String[]allOfIt) {
		
		
		pokerCount.put("He Man", pokerCount.get("He Man")+1);
		System.out.println(pokerCount);

	}
	
	public void removeKeyValuePair(Map<String,Integer> pokerCount, String[]allOfIt) {
		pokerCount.remove("He Man", pokerCount.get("He Man"));
		System.out.println(pokerCount);

		
	}
	}
