package Controller;

import Model.*;
import View.ViewConsole;
import java.util.Scanner;


public class GameController {
	
	private String currentRoom;
	private Rm room;
	
	public GameController() {
		
	}
	
	public GameController(Rm room, String currentRoom) {
		this.room = room;
		this.currentRoom = currentRoom;
	}
	
	public String getCurrentRoom() {
	
		return currentRoom;
	}

	public void setCurrentRoom(String currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public Rm getRoom() {
		return room;
	}

	public void setRoom(Rm room) {
		this.room = room;
	}

	public static void main(String[] args) {
		Rm room = new Rm("RM101"); //start of the game
		GameController status = new GameController(room, "RM101");
		ViewConsole view = new ViewConsole();
		
		// Title Screen
		System.out.println("+--------------------------------------------------------+");
		System.out.println("Welcome to Bowser’s Trek through Waluigi’s Mansion");
		System.out.println("\tCome On In.....Don't Be Afraid");
		System.out.println("+--------------------------------------------------------+");
		System.out.println();
		System.out.println("\t[1]  Start New Game");
		System.out.println("\t[2]  Load Saved Game");

		Scanner input = new Scanner(System.in);
		String currentRoom = room.getRmID() + " --> " + room.getRmName();
		String str = "";

		str = input.nextLine();
		if(str.equals("1")) 
		{
			String newGameStr = "You have just entered the Mansion. You are are currently in:\n\t" + status.getCurrentRoom() + ":\t"
								+ room.getRmDescription(currentRoom);
			String newStr = "\nHere are your Menu of Options";
			view.print(newGameStr + "\n" + newStr + "\n");	
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
					//currentRoom = room.getRmID() + " --> " + room.getRmName();
					//newStr = "You have entered the Room zone\n" + "Your currently are on level " + room.getRmLevel(currentRoom.substring(0, 1)) +
					//		". " + currentRoom;
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


