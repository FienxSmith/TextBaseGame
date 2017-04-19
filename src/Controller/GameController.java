package Controller;

import Model.*;
import View.ViewConsole;
import java.util.Scanner;


public class GameController {
	
	private String currentRoom;
	private Rm room;
	
	
	public GameController() {
		
	}
	
	public String getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(String currentRoom) {
		this.currentRoom = "RM101";
	}
	
	public Rm getRoom() {
		return room;
	}

	public void setRoom(Rm room) {
		this.room = room;
	}

	public static void main(String[] args) {
		GameController status = new GameController();
		ViewConsole view = new ViewConsole();
		Rm room = new Rm("RM101"); //start of the game
		status.setRoom(room);
		
		
		// Title Screen
		System.out.println("+--------------------------------------------------------+");
		System.out.println("Welcome to Bowser’s Trek through Waluigi’s Mansion");
		System.out.println("\tCome On In.....Don't Be Afraid");
		System.out.println("+--------------------------------------------------------+");
		System.out.println();
		System.out.println("\t[1]  Start New Game");
		System.out.println("\t[2]  Load Saved Game");

		Scanner input = new Scanner(System.in);
		
		String currentRoom = room.getRmID();
		String str = "";

		str = input.nextLine();
		if(str.equals("1")) 
		{
			String newStr = "You are on level 1: Entrance \n\n\t" + room.getRmDescription();
			view.print(newStr + "\n");	
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
				System.out.println("Here are your Menu of Options");
				System.out.println("\t[1]  Enter a Room");
				System.out.println("\t[2]  Attack Monster");
				System.out.println("\t[3]  Solve Puzzle");
				System.out.println("\t[4]  Equipt an Item");
				System.out.println("\t[5]  View Inventory");
				System.out.println("\t[6]  Check Health Status");
				System.out.println("\t[7]  Save Game");
				System.out.println("\t[8]  Exit Game");
				String optionStr = input.nextLine();
				String newStr = "";
				switch(optionStr) {
				case "1": 
					//enter room code
					newStr = "You have entered the Room zone\n";
					currentRoom = room.getRmID() + " --> " + room.getRmName();
					view.print(newStr + currentRoom);
					room.printRoomDetails();
					
					break;
				case "2":
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
					break;

				case "4": 
					//equip item
					break;
				case "5":
					//view inventory
					break;
				case "6":
					//check health
					break;
				case "7":
					//save game
					break;
				case "8":
					//exit game
					break;
				default:

				}
			}
	}
}


