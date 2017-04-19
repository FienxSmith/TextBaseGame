package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import Controller.GameController;

public class Rm {

	private int rmLevel;
	private String rmID;
	private String rmName;
	private String rmDescription;
	private String rmDoor;
	private HashMap<Integer, List<String>> rmNameMap;
	private String[] leadsTo;
	private Rm roomObj;

	public Rm() {

	}

	public Rm(String rmID) {

		if(rmID.equalsIgnoreCase("RM101")) {
			this.rmLevel = 1;
			this.rmID = "RM101";
			this.rmName = "Entrance";
			this.rmDescription = "The pink double doors in the middle of the south wall open to the main entry point to the mansion. This area is a full of bright colors, giving visitors a taste of the rest of the mansion. On west wall is a grand doorway leading to the rest of the rooms on the first level. A bright blue couch along the north wall faces the room. The walls are painted in a rainbow pattern with the colors Red, Orange, Yellow, Green, Blue, and Purple.";
			this.rmDoor = "DR101 and DR102";
		}

		if(rmID.equalsIgnoreCase("HW_L1")) {
			this.rmLevel = 1;
			this.rmID = "HW_L1";
			this.rmName = "Hallway Level 1";
			this.rmDescription = "You have entered the hallway to the mansion’s lower level.  There are several rooms in which you can freely roam on your quest.  The hallway walls are adorned with a mosaic gold leaf design. The doors that lead to various rooms are various shades of the rainbow.  Choose wisely!";
			this.rmDoor = "DR101, DR102,DR103, DR104, DR105, DR106, DR107, DR108";		
		}	
	}

	public String getRmID() {
		return rmID;
	}

	public void setRmID(String rmID) {
		this.rmID = rmID;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getRmDescription() {
		return rmDescription;
	}

	public void setRmDescription(String rmDescription) {
		this.rmDescription = rmDescription;
	}

	public String getRmDoor() {
		return rmDoor;
	}

	public void setRmDoor(String rmDoor) {
		this.rmDoor = rmDoor;
	}

	public HashMap<Integer, List<String>> getRmNameMap(int rmLevel) {

		rmNameMap = new HashMap<Integer, List<String>>();

		if(rmLevel == 1) {
			rmNameMap.put(1, Arrays.asList(new String[] {"Entrance", "Hallway Level 1", "Greeting Area", "Living Room", "Game Room", "Kitchen", "Dining Room", "Landing"}));
		}

		if(rmLevel == 2) {
			rmNameMap.put(2, Arrays.asList(new String[]{"Hallway Level 2", "Waiting Room", "Supply Room", "Bedroom", "Cleaning Supply Room", "Music Room", "Wine Celler", "Library"}));
		}

		if(rmLevel == 3) {
			rmNameMap.put(3, Arrays.asList(new String[]{"Hallway Level 3", "Colorful Room", "Library", "Work Room", "TV Room", "Red Chest Room"}));
		}

		if(rmLevel == 4) {
			rmNameMap.put(4, Arrays.asList(new String[]{"Hallway Level 4","Game Room", "Study Room", "Dream Room", "Garden Room", "Theater Room", "Dining Room", "Dark Room"}));
		}
		return rmNameMap;
	}

	public String [] getLeadsTo(String rmName) {

		if(rmName.equalsIgnoreCase("Entrance")) {
			leadsTo = new String[] {"Hallway Level 1", "Outside"};
		}

		if(rmName.equalsIgnoreCase("Hallway Level 1")) {
			leadsTo = new String[] {"Entrance", "Hallway Level 1", "Greeting Area", "Living Room", "Game Room", "Kitchen", "Dining Room", "Landing"};
		}

		if(rmName.equalsIgnoreCase("Greeting Area")) {
			leadsTo = new String[] {"Entrance", "Hallway Level 1", "Greeting Area", "Living Room", "Game Room", "Kitchen", "Dining Room", "Landing"};

		}

		return leadsTo;
	}

	public Rm getRoomObj(String rmID) {
		//LEVEL 1 ROOMS --> 8
		Rm rm1_1 = new Rm("RM101");
		Rm rm1_2 = new Rm("HW_L1");
		Rm rm1_3 = new Rm("RM102");
		Rm rm1_4 = new Rm("RM103");
		Rm rm1_5 = new Rm("RM104");
		Rm rm1_6 = new Rm("RM105");
		Rm rm1_7 = new Rm("RM106");
		Rm rm1_8 = new Rm("RM107");

		//LEVEL 2 ROOMS --> 8

		Rm rm2_1 = new Rm("HW_L2");
		Rm rm2_2 = new Rm("RM201");
		Rm rm2_3 = new Rm("RM202");
		Rm rm2_4 = new Rm("RM203");
		Rm rm2_5 = new Rm("RM204");
		Rm rm2_6 = new Rm("RM205");
		Rm rm2_7 = new Rm("RM206");
		Rm rm2_8 = new Rm("RM207");

		Rm rm3_1 = new Rm("HW_L3");
		Rm rm3_2 = new Rm("RM301");
		Rm rm3_3 = new Rm("RM302");
		Rm rm3_4 = new Rm("RM303");
		Rm rm3_5 = new Rm("RM304");
		Rm rm3_6 = new Rm("RM305");



		return roomObj;
	}

	public void setLeadsTo(String[] leadsTo) {
		this.leadsTo = leadsTo;
	}

	//case 1 in GameController
	public void printRoomDetails() {
		Rm room = new Rm();
		Scanner input = new Scanner(System.in);
		System.out.println("Where would you like to go on this ? ");
		int currentRmLevel = 1;

		
		System.out.println(Arrays.deepToString(getRmNameMap(1).entrySet().toArray()));

		//System.out.println(set);
		System.out.println("Room options: ");


	}



}
