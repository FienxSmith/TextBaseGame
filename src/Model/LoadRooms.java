package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class LoadRooms {

	private HashMap<String, Rm> roomsList = new HashMap<String, Rm>(); //static to make available to entire class

	public HashMap<String, Rm> getRoomsList()
	{
		return roomsList;		
	}

	public HashMap<String, Rm> loadRooms(String fileName) {

		Scanner roomReader = null;  //open a Scanner to read data from File 
		File roomTextFile = new File("roomObjects.txt");
		
		try
		{
			roomReader = new Scanner(roomTextFile);  //open text file			
		}
		catch (FileNotFoundException nfe) 
		{
			System.out.println("No room object found- room file is empty");
		}

		String line; //used to store lines of text file
		while (roomReader != null && roomReader.hasNext())
		{
			line = roomReader.nextLine();
			String[] rawData = line.split("\\* "); //stores each piece of data delimited by "* " into an array

			if(rawData[1].equalsIgnoreCase("RM101")) {            
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM101", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L1")) { 
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()), rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L1", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM102")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM102", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM103")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM103", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM104")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM104", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM105")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM105", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM106")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM106", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM107")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM107", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L2")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L2", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM201")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM201", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM202")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM202", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM203")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM203", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM204")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM204", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM205")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM205", tempRoom);
			}

			if(rawData[1].equalsIgnoreCase("RM206")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM206", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM207")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM207", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L3")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L3", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM301")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM301", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM302")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM302", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM303")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM303", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM304")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM304", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM305")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM305", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("HW_L4")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("HW_L4", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM401")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM401", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM402")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM402", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM403")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM403", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM404")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM404", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM405")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM405", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM406")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM406", tempRoom);
			}

			else if(rawData[1].equalsIgnoreCase("RM407")) {
				Rm tempRoom = new Rm(Integer.parseInt(rawData[0].trim()),rawData[1], rawData[2], rawData[3], rawData[4]);
				roomsList.put("RM407", tempRoom);
			}

		}
		//roomReader.close();
		return roomsList;
	}
}

