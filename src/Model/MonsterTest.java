package Model;

import java.util.Random;
import java.util.Scanner;

public class MonsterTest extends CharacterTest {

	private String monsterID;
	private String monsterDescription;
	private int maxEnemyHealth;
	private int enemyAttackDamage;
	private ArtifactTest itemDrop;
	private PlayerTest player;
	private boolean isAlive;

	public MonsterTest() {
		
	}
	
	public MonsterTest(String monsterID) {
	
		if (monsterID.equals("ML00"))
		{
			name = "Yoshi";
			health = 5;
			attackPower = 1;
			itemDrop = new ArtifactTest("A0000");
			monsterDescription = "An intriguingly mesmerizing horse-lizard that appears to be plain, dumb and insignificant. You�re not really sure if it wants to eat or whether it knows you are even there. Feel free to consider it harmless... if you are a fool.";
		}
		else if (monsterID.equals("ML01"))
		{
			name = "Toad";
			health = 5;
			attackPower = 1;
			itemDrop = new ArtifactTest("A0003");
			monsterDescription = "A seemingly asexual being, possibly a human being that happens to have a living mushroom on its head. He seems moderately friendly. You�re not sure whether to ignore it or to make mushroom pizza.";
		}
		else if (monsterID.equals("ML02"))
		{
			name = "Luigi";
			health = 8;
			attackPower = 2;
			itemDrop = new ArtifactTest("A0010");
			monsterDescription = "A medium sized, clumsy, defenseless man. If you�re not careful he�ll give you some damage. As long as you stay on your toes, you should be good.";
		}
		else if (monsterID.equals("ML03"))
		{
			name = "Daisy";
			health = 8;
			attackPower = 2;
			itemDrop = new ArtifactTest("A0006");
			monsterDescription = "A lean, agile, and weak girl. She is as afraid of you as you are of her. But don�t underestimate her, she can give you significant damage.";
		}
		else if (monsterID.equals("ML04"))
		{
			name = "Mario";
			health = 12;
			attackPower = 3;
			itemDrop = new ArtifactTest("A0011");
			monsterDescription = "A short, stubby, hyperactive man with a lot of will and determination. He will mess you up if you don�t put up a good fight.";
		}
		else if (monsterID.equals("ML05"))
		{
			name = "Peach";
			health = 12;
			attackPower = 3;
			itemDrop = new ArtifactTest("A0007");
			monsterDescription = "A beautiful, graceful girl with a lot of guts. She won�t take you lightly, and you shouldn�t take her lightly either.";
		}
		else if (monsterID.equals("ML06"))
		{
			name = "Wario";
			health = 15;
			attackPower = 4;
			itemDrop = new ArtifactTest("A0007");
			monsterDescription = "A fat, slow, yet dangerous old man. One moment he�s trying to tell you a bad joke, the next you are staring death in the face.";
		}
		else if (monsterID.equals("ML07"))
		{
			name = "Waluigi";
			health = 16;
			attackPower = 5;
			itemDrop = new ArtifactTest("A0009");
			monsterDescription = "A tall, lanky old man. He smells as bad as he looks. He will totally rip your heart out if you let him, so beware.";
		}
		else

			System.out.println("Invalid ID");
	}

	public String getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(String monsterID) {
		this.monsterID = monsterID;
	}

	public String getMonsterDescription() {
		return monsterDescription;
	}

	public void setMonsterDescription(String monsterDescription) {
		this.monsterDescription = monsterDescription;
	}

	public int getMaxEnemyHealth() {
		return maxEnemyHealth;
	}

	public void setMaxEnemyHealth(int maxEnemyHealth) {
		this.maxEnemyHealth = maxEnemyHealth;
	}

	public int getEnemyAttackDamage() {
		return enemyAttackDamage;
	}

	public void setEnemyAttackDamage(int enemyAttackDamage) {
		this.enemyAttackDamage = enemyAttackDamage;
	}

	public ArtifactTest getItemDrop() {
		return itemDrop;
	}

	public void setItemDrop(ArtifactTest itemDrop) {
		this.itemDrop = itemDrop;
	}

	public PlayerTest getPlayer() {
		return player;
	}

	public void setPlayer(PlayerTest player) {
		this.player = player;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	//Need to test out how the monster loop would work
	public void attackMonster() {
		MonsterTest m = new MonsterTest();
		player = new PlayerTest();
		itemDrop = new ArtifactTest();
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		String[] enemies = {"Yoshi","Toad","Luigi", "Daisy", "Mario", "Peach", "Wario", "Waluigi"};
		maxEnemyHealth = 75;
		enemyAttackDamage = 25;
		
		int enemyHealth = rand.nextInt(maxEnemyHealth);
		String enemy = enemies[rand.nextInt(enemies.length)];
		System.out.println("\t# " + enemy + " appeared! #\n");
		
		ENCOUNTER_MONSTER:
		while(enemyHealth > 0) {
			System.out.println("\tYour health is: " + player.getHealth());
			System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
			System.out.println("\n\tWhat would you like to ");
			System.out.println("\t[1]  Attack");
			System.out.println("\t[2]  Equip Weapon");
			System.out.println("\t[3]  Attack");
			System.out.println("\t[4]  Run");
			
			String response = input.nextLine();
			if(response.equals("1")) {
				
				int damageDealt = rand.nextInt(player.getAttackPower());
				int damageTaken = rand.nextInt(enemyAttackDamage);
				enemyHealth -= damageDealt;
				player.health -= damageTaken;
				System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
				System.out.println("\t> You receive " + damageTaken + " in retaliation!");
				
				if(player.health < 1) {
					System.out.println("\tYou have taken to much damage.  You are to weak from battle");
					break;
				}
				
			}
			
			else if (response.equals("2")) {
				
				if(player.getNumHealthPoints() > 0) {
					player.health += player.getHealingPower();
					player.numHealthPoints--;
					System.out.println("\t> You used a health point, healing yourself for " + player.healingPower + "."
							+ "\n\tYou now have " + player.healingPower + "HP"
							+ "\n\tYou have " + player.numHealthPoints + " left.");
				}
				
			}
			else if (response.equals("3")) {
				
			}
			else if (response.equals("4")) {
				
			}
			else {
				System.out.println("Not a valid response");
				
			}
			
			
		}
		
		System.out.println(""); //if player dies
		
		}	
}
