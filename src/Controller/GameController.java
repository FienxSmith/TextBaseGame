package Controller;

import Model.*;
import View.ViewConsole;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


public class GameController {


	public static void main(String[] args) {
		
		ViewConsole view = new ViewConsole();
		Rm room = new Rm();
		LoadRooms loadRmList = new LoadRooms();
		HashMap<String, Rm> roomInventory = new HashMap<String, Rm>();
		roomInventory = loadRmList.loadRooms("roomObjects.txt");
		Scanner input = new Scanner(System.in);
		String currentRoom;
		String str = "";
		
		// Title Screen
		System.out.println("+--------------------------------------------------------+");
		System.out.println("Welcome to Bowser’s Trek through Waluigi’s Mansion");
		System.out.println("\tCome On In.....Don't Be Afraid");
		System.out.println("+--------------------------------------------------------+");
		System.out.println();
		System.out.println("\t[1]  Start New Game");
		System.out.println("\t[2]  Load Saved Game");

		str = input.nextLine();
		if(str.equals("1")) 
		{	
				System.out.println(roomInventory.get("RM101"));
		}
		else if (str.equals("2"))
		{
			//load save game goes here
			String newStr = "No saved game to load";
			view.print(newStr);
		}

		GAME:
			while(true) {

				//View Commands
				System.out.println("Please CHOOSE ONE of the following Menu of Options");
				System.out.println("\t> TYPE IN THE NUMBER ONLY");
				System.out.println("\t[1]  Enter Room");
				System.out.println("\t[2]  Equipt an Item");
				System.out.println("\t[3]  View Inventory");
				System.out.println("\t[4]  Check Health Status");
				System.out.println("\t[5]  Save Game");
				System.out.println("\t[6]  Exit Game");
				
				String optionStr = input.nextLine();
				String newStr = "";
				
				switch(optionStr) {
				case "1": 
					//enter room code
					newStr = "You have entered the Room zone\n";
					view.print(newStr);
					room.printRoomDetails();
					break;
				/*case "2":
					//attack monster code
					MonsterTest m = new MonsterTest();
					newStr = "Are you ready to Rummmmble....You asked for it!!! ";
					if(room.getRmID().equalsIgnoreCase("HW_L1")) {
						newStr = "No Monster in this room";
					}
					else {
					m.attackMonster();
					}
					break;
				case "3":
					//solve puzzle code
					PuzzleTest puzzle = new PuzzleTest();
					newStr = "You have entered the Puzzle zone\n";	
					view.print(newStr);
					puzzle.printPuzzle();
					break;*/

				case "2": 
					//equip item
					break;
				case "3":
					//view inventory
					break;
				case "4":
					//check health
					break;
				case "5":
					//save game
					break;
				case "6":
					//exit game
					break;
				default:
					System.out.println("Not a valid command.  Enter in a number please");

				}
			}
	}

}

