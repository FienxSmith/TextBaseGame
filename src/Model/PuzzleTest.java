package Model;

import java.util.Random;
import java.util.Scanner;



public class PuzzleTest {

	private String ID;
	private String pzlName;
	private String pzlDescription;
	private String pzlHint;
	private String answer;
	private boolean pzlStatus;
	private PuzzleTest puzzleObj;
	
	//private ArtifactTest reward;
	//private TBRoom rmID;
	
	
	public PuzzleTest () {
		
	}

	public PuzzleTest (String ID, String plzName, String plzDescription, String pzlHint, String answer){
		this.ID = ID;
		this.pzlName = plzName;
		this.pzlDescription = plzDescription;
		this.pzlHint = pzlHint;
		this.answer = answer;
		//this.reward = reward;
		

	}

	public PuzzleTest(String ID ) {

		if(ID.equals("PL0001")) {
			pzlStatus = false;
			pzlName = "Shiny days";
			pzlDescription = "What people can go five days without sleep?";
			pzlHint = "Sleeping during...";
			answer = "Sleeping during the night";
			//reward = new ArtifactTest("A0000");
			
		}

		if(ID.equals("PL0002")) {
			pzlStatus = false;
			pzlName = "Fire";
			pzlDescription = "If you enter into the 'dark room'. Inside the room has oil lamp, kindling wood, match, and candle. Which one do you light first?";
			pzlHint = "Not the candle";
			answer = "Match";
			//reward = new ArtifactTest("A0003");
			
		}

		if(ID.equals("PL0003")) {
			pzlStatus = false;
			pzlName = "Up and Down";
			pzlDescription = "What goes up and down but remain in the same place?";
			pzlHint = "Sta...";
			answer = "Stairs";
			//reward = new ArtifactTest("A0012");
		}
		if(ID.equals("PL0004")) {
			pzlStatus = false;
			pzlName = "Quarter";
			pzlDescription = "What has a head and a tail?";
			pzlHint = "A pair of them can jingle in your pocket";
			answer = "A Coin";
			//reward = new ArtifactTest("A0011");
		}
		if(ID.equals("PL0005")) {
			pzlStatus = false;
			pzlName = "Light";
			pzlDescription = "You feed me and I live, but you gave me drink and I die. Who am I?";
			pzlHint = "... and Ice";
			answer = "Fire";
			//reward = new ArtifactTest("A0004");
		}
		if(ID.equals("PL0006")) {
			pzlStatus = false;
			pzlName = "Mirrors";
			pzlDescription = "Imagine you are in a beautiful garden, full of gorgeous flowers, you see a building at the end of the garden. You enter to the building, mirrors are everywhere you just see yourself. You are scared.'How do you get out???'";
			pzlHint = "'Imagine'";
			answer = "Stop Imagining";
			//reward = new ArtifactTest("A0001");
		}

		if(ID.equals("PL0007")) {
			pzlStatus = false;
			pzlName = "Special Room";
			pzlDescription = "What room does not have a door/window, and no one can enter?";
			pzlHint = "Aren't these puzzle Fun, Gus?";
			answer = "Mushroom";
			//reward = new ArtifactTest("A0000");
		}	
	}

	public String getID() {
		return ID;
	}

	public void setPzlId(String ID) {
		this.ID = ID;
	}

	public String getPzlName() {
		return pzlName;
	}

	public void setPzlName(String plzName) {
		this.pzlName = plzName;
	}

	public boolean getIsDone() {
		return pzlStatus;
	}

	public void setIsDone(boolean pzlStatus) {
		this.pzlStatus = pzlStatus;
	}

	public String getPzlDescription() {
		return pzlDescription;
	}

	public void setPzlDescription(String pzlDescription) {
		this.pzlDescription = getPzlDescription();
	}

	public String getHint(){
		return pzlHint;
	}

	public void setHint(String pzlHint){
		this.pzlHint = pzlHint;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public PuzzleTest getPuzzleObj() {
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;
		PuzzleTest p1 = new PuzzleTest("PL0001");
		PuzzleTest p2 = new PuzzleTest("PL0002");
		PuzzleTest p3 = new PuzzleTest("PL0003");
		PuzzleTest p4 = new PuzzleTest("PL0004");
		PuzzleTest p5 = new PuzzleTest("PL0005");
		PuzzleTest p6 = new PuzzleTest("PL0006");
		PuzzleTest p7 = new PuzzleTest("PL0007");

		if(n < 16) {
			puzzleObj = p1;	
		}
		else if(n > 16 && n < 31) {
			puzzleObj = p2;
		}
		else if(n > 31 && n < 46) {
			puzzleObj = p3;
		}
		else if(n > 46 && n < 61) {
			puzzleObj = p4;
		}
		else if(n > 61 && n < 76) {
			puzzleObj = p5;
		}
		else if(n > 76 && n < 91) {
			puzzleObj = p6;	
		}
		else if(n > 91 && n < 100) {
			puzzleObj = p7;
		}

		return puzzleObj;
	
	}
	//case 3 in Game controller 
	public void printPuzzle() {
		
		Scanner input = new Scanner(System.in);
		PuzzleTest puzzle = new PuzzleTest();
		
		System.out.println("Do you want to solve " + puzzle.getPuzzleObj().getPzlName() + " puzzle? \n" +
				"\t > [1]  Yes  OR  [2]  No");
		String response = input.nextLine();
		int guess = 3;
		if(response.equalsIgnoreCase("1")) {

			System.out.println("Here's your Puzzle: \n" + puzzle.getPuzzleObj().getPzlDescription());
			System.out.println("Your Answer? \n");
			response = input.nextLine();

			if(response.equalsIgnoreCase(puzzle.getPuzzleObj().getAnswer()) && guess > 0) {
				System.out.println("Congrats that is the correct answer! \n" 
						+ "Here is your Reward: "); //add artifact reward
			}

			else if (!response.equalsIgnoreCase(puzzle.getPuzzleObj().getAnswer())) {

				for (int i = 0; i <= guess; i++) {
					System.out.println("Wrong Answer, Try again");
					response = input.nextLine();
					guess--;
				}
				System.out.println("Sorry! You used up all your quesses.  Move On");
				System.out.println();
			}	

			if(response.equalsIgnoreCase("2")) {
				System.out.println("You'll be back!");			
			}
		}
	}

	/*public ArtifactTest getReward() {
		return reward;
	}

	public void setReward(ArtifactTest reward) {
		this.reward = reward;
	}

	public TBRoom getRmID() {
		return rmID;
	}

	public void setRmID(TBRoom rmID) {
		this.rmID = rmID;
	}*/
}

	


