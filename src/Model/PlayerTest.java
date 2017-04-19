package Model;

import java.util.ArrayList;

public class PlayerTest extends CharacterTest {

	protected String name;
	protected int health;
	protected int attackPower;
	protected int healingPower;
	protected int numHealthPoints;
	

	public ArrayList<ArtifactTest> inventory = new ArrayList<ArtifactTest>();

	public PlayerTest()
	{
		this.name = "Player";
		this.health = 100;
		this.attackPower = 50;
		this.healingPower = 30;
		this.numHealthPoints = 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}


	public void setInventory(ArrayList<ArtifactTest> inventory) {
		this.inventory = inventory;
	}

	public ArrayList<ArtifactTest> getInventory() {
		return inventory;
	}
	
	public int getHealingPower() {
		return healingPower;
	}

	public void setHealingPower(int healingPower) {
		this.healingPower = healingPower;
	}
	
	public int getNumHealthPoints() {
		return numHealthPoints;
	}

	public void setNumHealthPoints(int numHealthPoints) {
		this.numHealthPoints = numHealthPoints;
	}

	public void printInventory()
	{
		for (int i = 0; i < inventory.size(); i++)
		{
			System.out.println(inventory.get(i).getName() + "\n\t" + inventory.get(i).getDescription());
		}
	}
}

