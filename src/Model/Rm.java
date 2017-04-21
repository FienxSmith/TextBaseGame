package Model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Rm {

	private int rmLevel;
	private String rmID;
	private String rmDoor;
	private String rmName;
	private String rmDescription;


	public Rm()	{		
	}

	public Rm(int level, String ID, String door, String name, String description) {
		this.rmLevel = level;
		this.rmID = ID;
		this.rmDoor = door;
		this.rmName = name;
		this.rmDescription = description;
	}

	public int getRmLevel() {
		return this.rmLevel;
	}

	public void setRmLevel(int level) {
		this.rmLevel = level;
	}

	public String getRmID() {
		return this.rmID;
	}

	public void setRmID(String ID) {

		this.rmID = ID;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String name) {
		this.rmName = name;
	}

	public String getRmDescription() {
		return this.rmDescription;
	}

	public void setRmDescription(String description) {
		this.rmDescription = description;
	}

	public String getRmDoor() {
		return rmDoor;
	}

	public void setRmDoor(String door) {
		this.rmDoor = door;
	}

	@Override
	public String toString() {
		return "Room ==> Current Level: " + rmLevel + ". Your in the "  + rmName + ".\n\n\t" + rmDescription + "\n";
	}

	public void printRoomDetails() {
		LoadRooms loadRmList = new LoadRooms();
		HashMap<String, Rm> roomInventory = new HashMap<String, Rm>();
		roomInventory = loadRmList.loadRooms("roomObjects.txt");
		TreeMap<String, Rm> sortedRoomMap = new TreeMap<String, Rm>(roomInventory);
		Set<Entry<String, Rm>> keyValueSet = sortedRoomMap.entrySet();   

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in).useDelimiter("\\s*");
		String currentRmID = roomInventory.get("RM101").getRmID();

		int currentRmLevel = roomInventory.get("RM101").getRmLevel();
		int numOptions = 1;      //displays a number value next to array of options

		System.out.println("Where would you like to go on this level? ");

		if(currentRmLevel == 1) 
		{
			System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
			ArrayList<Rm> levelOneRooms = new ArrayList<Rm>();


			for(Entry<String, Rm> entry: keyValueSet) {
				levelOneRooms.add(entry.getValue());
			}
			for(Rm rm : levelOneRooms) {
				if(rm.rmLevel == 1) {
					System.out.println("[" + numOptions + "] " + rm.rmName);
					numOptions++;
				}
			}

			String response = input.nextLine();
			switch(response) {
			case "1":
				roomInventory.get("RM101").setRmID("RM101");


				break;

			case "2":
				roomInventory.get("RM101").setRmID("RM101");
				break;

			case "3":

				break;

			default: 
				System.out.println("Invalid");
			}			

		}
		if(currentRmLevel == 2) 
		{
			System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
			ArrayList<Rm> levelTwoRooms = new ArrayList<Rm>();

			for(Entry<String, Rm> entry: keyValueSet) {
				if(entry.getValue().equals("2")) {
					levelTwoRooms.add(entry.getValue());
				}
			}
			for(Rm rm : levelTwoRooms) {
				if(rm.rmLevel == 2) {
					System.out.println("[" + numOptions + "] " + rm.rmName);
					numOptions++;
				}
			}
		}

		if(currentRmLevel == 3) 
		{
			System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
			ArrayList<Rm> levelTwoRooms = new ArrayList<Rm>();

			for(Entry<String, Rm> entry: keyValueSet) {
				if(entry.getValue().equals("3")) {
					levelTwoRooms.add(entry.getValue());
				}
			}
			for(Rm rm : levelTwoRooms) {
				if(rm.rmLevel == 3) {
					System.out.println("[" + numOptions + "] " + rm.rmName);
					numOptions++;
				}
			}
		}
		
		if(currentRmLevel == 4) 
		{
			System.out.println("\tRoom options for Level " + currentRmLevel + "\n\t");
			ArrayList<Rm> levelTwoRooms = new ArrayList<Rm>();

			for(Entry<String, Rm> entry: keyValueSet) {
				if(entry.getValue().equals("4")) {
					levelTwoRooms.add(entry.getValue());
				}
			}
			for(Rm rm : levelTwoRooms) {
				if(rm.rmLevel == 4) {
					System.out.println("[" + numOptions + "] " + rm.rmName);
					numOptions++;
				}
			}
			}
		}
	}
}
