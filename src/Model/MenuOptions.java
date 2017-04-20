/**
 * 
 */
package Model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * Class: Menu Options
 * 
 * @author Tobin Crone and Katrina Smith 
 * @version 1.1 
 * Course : ITEC 3860 Spring 2017
 * Written: April 11, 2017
 *
 *  This class – Maps a list of MenuOptions to a specific Room ID that the player can choose from.
 *          
 *  Purpose: – Orient the player to the available options i.e. adjacent doors to a specified Room ID and if a Monster, Artifact and/or Puzzle is present in that particular Room. Player can also view Inventory and view their stats (health level).
 **/
public class MenuOptions 
{
	private String rmID;
	

	private HashMap<String, List<String>> optionsMap;

	/**
	 * Method: MenuOptions() Constructor
	 */
	public MenuOptions() {

	}

	public MenuOptions(String rmID)
	{
		Rm room = new Rm();

		if(room.getRmID().equalsIgnoreCase("RM101")) {
			setRmID("RM101");
		}
		if(room.getRmID().equalsIgnoreCase("HW_L1")) {
			setRmID("HW_L1");
		}
		if(room.getRmID().equalsIgnoreCase("RM102")) {
			setRmID("RM102");
		}
		if(room.getRmID().equalsIgnoreCase("RM103")) {
			setRmID("RM103");
		}
		if(room.getRmID().equalsIgnoreCase("RM104")) {
			setRmID("RM104");
		}
		if(room.getRmID().equalsIgnoreCase("RM105")) {
			setRmID("RM105");
		}
		if(room.getRmID().equalsIgnoreCase("RM106")) {
			setRmID("RM106");
		}
		if(room.getRmID().equalsIgnoreCase("RM107")) {
			setRmID("RM107");
		}
		if(room.getRmID().equalsIgnoreCase("HW_L2")) {
			setRmID("HW_L2");
		}
	}

	public String getRmID() {
		return rmID;
	}


	public void setRmID(String rmID) {
		this.rmID = rmID;
	}

	public void setOptionsMap(HashMap<String, List<String>> optionsMap) {
		this.optionsMap = optionsMap;
	}


	/**
	 * Method: getOptionsMap() getter method for accessing optionsMap
	 * Creates an HashMap of room options based on a specific Room object ID
	 * @return optionsMap of type HashMap<String, ArrayList<String>()
	 */
	public HashMap<String, List<String>> getOptionsMap(String rmID)
	{
		optionsMap = new HashMap<String, List<String>>();

		//OPTIONS FOR LEVEL 1 ROOMS
		if(rmID.equalsIgnoreCase("RM101")) {	
			optionsMap.put("RM101", Arrays.asList(new String[] {"Doors: DR101, DR102","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("HW_L1")) {
			optionsMap.put("HW_L1", Arrays.asList(new String[] {"Doors: DR102, DR103, DR104, DR105, DR106, DR107, DR108", "View Inventory", "View Stats"}));			
		}
		if(rmID.equalsIgnoreCase("RM102")) {
			optionsMap.put("RM102", Arrays.asList(new String[] {"Door: DR103","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM103")) {	
			optionsMap.put("RM103", Arrays.asList(new String[] {"Door: DR104","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM104")) {	
			optionsMap.put("RM104", Arrays.asList(new String[] {"Door: DR105","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM105")) {
			optionsMap.put("RM105", Arrays.asList(new String[] {"Door: DR106","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM106")) {
			optionsMap.put("RM106", Arrays.asList(new String[] {"Door: DR107","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM107")) {	
			optionsMap.put("RM107",	Arrays.asList(new String[] {"Door: DR108","Attack Monster", "Check puzzle","View Inventory", "View Stats"}));
		}

		//OPTIONS FOR LEVEL 2 ROOMS
		if(rmID.equalsIgnoreCase("HW_L2")) {	
			optionsMap.put("HW_L2", Arrays.asList(new String[] {"Doors: DR201, DR202, DR203, DR205, DR208, DR209, DR211, DR212, DR213", "View Inventory", "View Stats"}));	
		}
		if(rmID.equalsIgnoreCase("RM201")) {
			optionsMap.put("RM201", Arrays.asList(new String[] {"Doors: DR201, DR202, DR203, DR204", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM202")) {
			optionsMap.put("RM202", Arrays.asList(new String[] {"Doors: DR205, DR206", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM203")) {	
			optionsMap.put("RM203", Arrays.asList(new String[] {"Doors: DR206, DR207", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM204")) {
			optionsMap.put("RM204", Arrays.asList(new String[] {"Doors: DR207, DR208", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM205")) {
			optionsMap.put("RM205", Arrays.asList(new String[] {"Doors: DR209, DR210", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM206")) {	
			optionsMap.put("RM206", Arrays.asList(new String[] {"Doors: DR210, DR211", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM207")) {	
			optionsMap.put("RM207", Arrays.asList(new String[] {"Doors: DR204, DR212", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}

		//OPTIONS FOR LEVEL 3 ROOMS
		if(rmID.equalsIgnoreCase("HW_L3")) {	
			optionsMap.put("HW_L3", Arrays.asList(new String[] {"Doors: DR300, DR301, DR302, DR303, DR304, DR306, DR307", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM301")) {
			optionsMap.put("RM301", Arrays.asList(new String[] {"Doors: DR300, DR301", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM302")) {
			optionsMap.put("RM302", Arrays.asList(new String[] {"Doors: DR302, DR303", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM303")) {	
			optionsMap.put("RM303", Arrays.asList(new String[] {"Doors: DR304, DR305", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM304")) {
			optionsMap.put("RM304", Arrays.asList(new String[] {"Doors: DR305, DR306", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM305")) {
			optionsMap.put("RM305", Arrays.asList(new String[] {"Door: DR307", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}

		//OPTIONS FOR LEVEL 4 ROOMS
		if(rmID.equalsIgnoreCase("HW_L4")) {	
			optionsMap.put("HW_L4", Arrays.asList(new String[] {"Doors: DR401, DR402, DR403, DR405, DR407, DR408, DR409", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM401")) {
			optionsMap.put("RM401", Arrays.asList(new String[] {"Door: DR401", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM402")) {
			optionsMap.put("RM402", Arrays.asList(new String[] {"Door: DR402", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM403")) {	
			optionsMap.put("RM403", Arrays.asList(new String[] {"Doors: DR403, DR404", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));	
		}
		if(rmID.equalsIgnoreCase("RM404")) {
			optionsMap.put("RM404", Arrays.asList(new String[] {"Doors: DR405, DR406", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM405")) {
			optionsMap.put("RM405", Arrays.asList(new String[] {"Doors: DR406, DR407", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM406")) {
			optionsMap.put("RM406", Arrays.asList(new String[] {"Door: DR408", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		if(rmID.equalsIgnoreCase("RM407")) {
			optionsMap.put("RM407", Arrays.asList(new String[] {"Door: DR409", "Attack Monster", "Check Puzzle", "View Inventory", "View Stats"}));
		}
		else if(rmID.equalsIgnoreCase("")){
			System.out.println("Not a valid Room ID number");
		}
		return optionsMap;
	}	
	
	//FOR TESTING OPTIONSMAP TOSTRING
	/*public static void main(String[] args) {

		MenuOptions mo = new MenuOptions();
		System.out.println(Arrays.deepToString(mo.getOptionsMap("RM202").entrySet().toArray()) + "\n");
	}*/
}

