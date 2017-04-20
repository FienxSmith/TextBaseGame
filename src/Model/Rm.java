package Model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Rm {

	private int rmLevel;
	private String rmID;
	private String rmName;
	private String rmDescription;
	private String rmDoor;
	private HashMap<Integer, String[]> rmNameMap;
	private String[] leadsTo;
	private Rm room;
	private Rm roomObj;
	private MenuOptions mo;


	public Rm() {

	}

	public Rm(String rmID) {

		if(rmID.equalsIgnoreCase("RM101")) {
			setRmLevel(1);
			setRmID("RM101");
			setRmName("Entrance");
			setRmDescription("The pink double doors in the middle of the south wall open to the main entry point to the mansion. This area is a full of bright colors, giving visitors a taste of the rest of the mansion. On west wall is a grand doorway leading to the rest of the rooms on the first level. A bright blue couch along the north wall faces the room. The walls are painted in a rainbow pattern with the colors Red, Orange, Yellow, Green, Blue, and Purple.");
			setRmDoor("DR101 and DR102");
			
		}

		if(rmID.equalsIgnoreCase("HW_L1")) {
			setRmLevel(1);
			setRmID("HW_L1");
			setRmName("Hallway Level 1");
			setRmDescription("You have entered the hallway to the mansion’s lower level.  There are several rooms in which you can freely roam on your quest.  The hallway walls are adorned with a mosaic gold leaf design. The doors that lead to various rooms are various shades of the rainbow.  Choose wisely!");
			setRmDoor("DR101, DR102,DR103, DR104, DR105, DR106, DR107, DR108");		
		}

		if(rmID.equalsIgnoreCase("RM102")) {
			setRmLevel(1);
			setRmID("RM102");
			setRmName("Greeting Area");
			setRmDescription("This room is full of comfy chairs and tables. The door on the north wall towards the east end of the room is solid pink. The chairs are colored Red, Orange, and Yellow. The Tables are colored Green, Blue, and Purple.");
			setRmDoor("DR103");
		}

		if(rmID.equalsIgnoreCase("RM103")) {
			setRmLevel(1);
			setRmID("RM103");
			setRmName("Living Room");
			setRmDescription("This large room is the entertainment center. The door on the south wall of the room is bright blue and is directly in the middle of the wall. On the east end of the room is a stage with a television screen on the wall. Cabinets cover the north side of the room. In these cabinets are chairs, tables, Dvds, video games, and other entertainment items.");
			setRmDoor("DR104");
		}

		if(rmID.equalsIgnoreCase("RM104")) {
			setRmLevel(1);
			setRmID("RM104");
			setRmName("Game Room");
			setRmDescription("This rectangular room is full of all sorts of arcade games. A burnt sienna door is on the south wall towards the west end of the room. There are always loud noises and lots of activities going on. This is where the kids hang out while the adults talk.");
			setRmDoor("DR104");
		}




	}

	public int getRmLevel(String rmID) {
		return this.rmLevel;
	}

	public void setRmLevel(int rmLevel) {
		this.rmLevel = rmLevel;
	}

	public String getRmID() {
		return this.rmID;
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

	public String getRmDescription(String rmID) {
		return this.rmDescription;
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

	public HashMap<Integer, String[]> getRmNameMap(int rmLevel) {

		rmNameMap = new HashMap<Integer, String[]>();

		if(rmLevel == 1) {
			rmNameMap.put(1, new String [] {"Entrance", "Hallway Level 1", "Greeting Area", "Living Room", "Game Room", "Kitchen", "Dining Room", "Landing"});
		}

		if(rmLevel == 2) {
			rmNameMap.put(2, new String[]{"Hallway Level 2", "Waiting Room", "Supply Room", "Bedroom", "Cleaning Supply Room", "Music Room", "Wine Celler", "Library"});
		}

		if(rmLevel == 3) {
			rmNameMap.put(3, new String[]{"Hallway Level 3", "Colorful Room", "Library", "Work Room", "TV Room", "Red Chest Room"});
		}

		if(rmLevel == 4) {
			rmNameMap.put(4, new String[]{"Hallway Level 4","Game Room", "Study Room", "Dream Room", "Garden Room", "Theater Room", "Dining Room", "Dark Room"});
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

		Scanner input = new Scanner(System.in).useDelimiter("\\s*");
		mo = new MenuOptions();  //menuOptions object
		room = new Rm("RM101");  //Rm object
		String currentRmID = room.getRmID();
		int currentRmLevel = room.getRmLevel(currentRmID);
		int numOptions = 1;      //displays a number value next to array of options

		System.out.println("Where would you like to go on this level? ");
		
			if(currentRmLevel == 1) {
				room.setRmLevel(currentRmLevel);
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");

				for(String key : getRmNameMap(1).get(1)){
					System.out.println("[" + numOptions + "] " + key);
					numOptions++;
				}

				String response = input.nextLine();
				
				switch(response) {
				case "1":
					room.setRmID("RM101");
					currentRmID = room.getRmID();
					currentRmLevel = 1;
					System.out.println("Entrance\t: " + getRmDescription(currentRmID));

					break;

				case "2":
					room.setRmID("HW_L1");
				
					currentRmID = room.getRmID();
					
					System.out.println("Your are here --> " + currentRmID);
					currentRmLevel = 1;
					System.out.println("Hallway Level 1\t:"  + this.room.getRmDescription(currentRmID));
					break;

				case "3":
					currentRmID = "RM102";
					currentRmLevel = 1;
					System.out.println("Greeting Area\t" + room.getRmDescription(currentRmID));
					break;
				}
				}

			
			if(currentRmLevel == 2) {
				room.setRmLevel(currentRmLevel);
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");

				for(String key : getRmNameMap(2).get(2)){
					System.out.println("[" + numOptions + "] " + key);
					numOptions++;
				}
				System.out.println(Arrays.deepToString(getRmNameMap(2).entrySet().toArray()) + "\n");
			}
			if(currentRmLevel == 3) {
				room.setRmLevel(currentRmLevel);
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
				System.out.println(Arrays.deepToString(getRmNameMap(3).entrySet().toArray()) + "\n");
			}
			if(currentRmLevel == 4) {
				room.setRmLevel(currentRmLevel);
				System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
				System.out.println(Arrays.deepToString(getRmNameMap(4).entrySet().toArray()) + "\n");
			}

			System.out.println("\t[1]  Select New Room");
			System.out.println("\t[2]  Search Room");
			System.out.println("\t[3]  Exit Room");

			System.out.println("\t[2]  Attack Monster");
			System.out.println("\t[3]  Solve Puzzle");
		}
	}

