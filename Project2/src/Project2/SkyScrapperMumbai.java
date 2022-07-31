package Project2;

import java.util.ArrayList;
import java.util.Scanner;

public class SkyScrapperMumbai {
	public boolean status = true;
	public ArrayList<Integer> populateFloors() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int totalFloors = scan.nextInt();
		ArrayList<Integer> floors = new ArrayList<Integer>(totalFloors + 1);
		for (int i=0; i<totalFloors+1;i++) {
			floors.add(null);
		}
		Integer floorSize;
		for (int i=1; i<totalFloors+1; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			floorSize = scan.nextInt();
			floors.set(floorSize,i);
		}
		scan.close();
		return floors;
	}
	
	public void printOutput(ArrayList<Integer> floors) {
		System.out.println("The order of construction is as follows");
		int j = floors.size()-1;
		
		for(int i=1;i<floors.size();i++){
            System.out.println("Day "+i+" :");
            while(j>=1 && floors.get(j) <= i){
                System.out.print(j +" ");
                j--;
            }
            System.out.println();
        }
	}		
}
