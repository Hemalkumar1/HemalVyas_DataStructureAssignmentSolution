package Project2;

import java.util.ArrayList;

public class SkyscraperTest {

	public static void main(String[] args) {
	
		SkyScrapperMumbai taj = new SkyScrapperMumbai(); 
		ArrayList<Integer> floors = new ArrayList<Integer>();
		floors = taj.populateFloors();
		taj.printOutput(floors);
	}
}
