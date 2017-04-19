package Model;

import java.util.ArrayList;
import java.util.Random;

import View.ViewConsole;

public class ArtifactTest {

	private String itemID;
	private String itemName;
	private String itemDescription;
	private int itemStrength;
	private boolean canHeal = false;
	protected int itemDropChance; 
	
	private ArtifactTest artifactObj;

	public ArtifactTest()
	{
		
	}

	public ArtifactTest(String itemID) 
	{
		this.getArtifactObj(itemID);
		this.itemDropChance = 50; //percentage
	}

	public ArtifactTest getArtifactObj(String itemID)
	{
		if (itemID.equals("A0000"))
		{
			this.itemID = itemID;
			this.itemName = "Healing Mushroom";
			this.itemDescription = "If you find this mushroom your character will be able to heal itself. You can consume the mushroom to regain 60HP";
			this.itemStrength = 2;
			this.canHeal = true;
		}
		if (itemID.equals("A0001"))
		{
			this.itemID = itemID;
			this.itemName = "Poison Goomba";
			this.itemDescription = "If you find this item you will be able to poison your enemy (making the opposition nauseous), and gain the opportunity to catch your breath.";
			this.itemStrength = 4;
			this.canHeal = true;
		}
		if (itemID.equals("A0002"))
		{
			this.itemID = itemID;
			this.itemName = "Paralyzing Boo";
			this.itemDescription = "This ghost, if selected, can paralyze your enemy for you to catch your breath quickly";
			this.itemStrength = 2;
			this.canHeal = true;		
		}
		if (itemID.equals("A0003"))
		{
			this.itemName = "Tri-Shroombow";
			this.itemDescription = "This is an ordinary crossbow, but it can shoot three arrows at a time. It�s better than your normal crossbow, which can only shoot one. This crossbow can deal 3 times the damage than your normal crossbow.";
			this.itemStrength = 6;
			canHeal = false;
			
		}
		if (itemID.equals("A0004"))
		{
			this.itemName = "Fire Flower";
			this.itemDescription = "The fire flower is very useful if you want to keep your distance from your enemy. If blown, it will create a line of fire between you and your enemy. It lasts the duration of the fight. If the enemy happens to touch the fire it can deal up to 5 damage. Until the enemy stops touching the fire.";
			this.itemStrength = 5;			
		}
		if (itemID.equals("A0005"))
		{
			this.itemName = "Bowser's Flaming Sword";
			this.itemDescription = "This weapon is the rarest of them all. If found, you�re in luck. Bowsers sword does very heavy damage.";
			this.itemStrength = 10;
			canHeal = false;		
		}
		
		if (itemID.equals("A0006"))
		{
			this.itemName = "Shroom Sword";
			this.itemDescription = "A long white piece of mushroom dotted with red spots and sharpened.";
			this.itemStrength = 2;
			canHeal = false;			
		}
		if (itemID.equals("A0007"))
		{
			this.itemName = "Shroom Bow";
			this.itemDescription = "A curved piece of brown mushroom with a string connecting the two ends.";
			this.itemStrength = 2;
			canHeal = false;			
		}
		if (itemID.equals("A0008"))
		{
			this.itemName = "Shroom Hammer";
			this.itemDescription = "A short mushroom stick with a very wide and dense end.";
			this.itemStrength = 2;
			canHeal = false;			
		}
		if (itemID.equals("A0009"))
		{
			this.itemName = "Shroom Gun";
			itemDescription = "A small, hollow curved mushroom with small mechanical components.";
			itemStrength = 5;
			canHeal = false;			
		}
		if (itemID.equals("A0010"))
		{
			itemName = "Coin of Constitution";
			itemDescription = "A green coin that shimmers and hums with magical energy";
			itemStrength = 5;
			canHeal = true;			
		}
		if (itemID.equals("A0011"))
		{
			itemName = "Coin of Toughness";
			itemDescription = "A red coin that shimmers and hums with magical energy";
			itemStrength = 10;
			canHeal = true;			
		}
		if (itemID.equals("A0012"))
		{
			itemName = "Coin of Brutality";
			itemDescription = "A blue coin that shimmers and hums with magical energy";
			itemStrength = 5;
			canHeal = false;		
		}
		return artifactObj;		
	}

	public String getItemID() {
		return this.itemID;
	}

	public void setID(String itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return this.itemName;
	}

	public void setName(String name) {
		this.itemName = name;
	}

	public String getDescription() {
		return itemDescription;
	}

	public void setDescription(String description) {
		this.itemDescription = description;
	}

	public int getStrength() {
		return itemStrength;
	}

	public void setStrength(int strength) {
		this.itemStrength = strength;
	}

	public void add(ArtifactTest itemObj) {
	
	}

	public void remove(ArtifactTest itemObj) {
		// TODO Auto-generated method stub
		
	}
	
	public int getItemDropChance() {
		return itemDropChance;
	}

	public void setItemDropChance(int itemDropChance) {
		this.itemDropChance = itemDropChance;
	}
	
	public ArtifactTest getArtifactObj() {
		Random rand = new Random();
		int n = rand.nextInt(5) + 1;
		ArtifactTest a1 = new ArtifactTest("A0000");
		ArtifactTest a2 = new ArtifactTest("A0001");
		ArtifactTest a3 = new ArtifactTest("A0002");
		ArtifactTest a4 = new ArtifactTest("A0003");
		ArtifactTest a5 = new ArtifactTest("A0004");
		ArtifactTest a6 = new ArtifactTest("A0005");
		ArtifactTest a7 = new ArtifactTest("A0006");
		ArtifactTest a8 = new ArtifactTest("A0007");
		ArtifactTest a9 = new ArtifactTest("A0008");
		ArtifactTest a10 = new ArtifactTest("A0009");
		ArtifactTest a11 = new ArtifactTest("A0010");
		ArtifactTest a12 = new ArtifactTest("A0011");
		ArtifactTest a13 = new ArtifactTest("A0012");

		if (n == 1)  { //assigns items with a strength value of 2

			Random r = new Random();
			ArrayList<ArtifactTest> possibleItems = new ArrayList<ArtifactTest>();
			possibleItems.add(a1);
			possibleItems.add(a3);
			possibleItems.add(a7);
			possibleItems.add(a8);
			possibleItems.add(a9);

			int x = r.nextInt(possibleItems.size());
			artifactObj = possibleItems.get(x);	
		}

		else if (n == 2) { //assigns item with a strength value of 4

			artifactObj = a2;
		}

		else if (n == 3) { //assigns item with a strength value of 5

			Random r = new Random();

			ArrayList<ArtifactTest> possibleItems = new ArrayList<ArtifactTest>();
			possibleItems.add(a5);
			possibleItems.add(a10);
			possibleItems.add(a11);
			possibleItems.add(a13);

			int x = r.nextInt(possibleItems.size());
			artifactObj = possibleItems.get(x);	
		}

		else if (n ==  4) { //assigns items with a string value of 6

			artifactObj = a4;
		}

		else if (n == 5) {

			Random r = new Random();
			ArrayList<ArtifactTest> possibleItems = new ArrayList<ArtifactTest>();
			possibleItems.add(a6);
			possibleItems.add(a12);

			int x = r.nextInt(possibleItems.size());
			artifactObj = possibleItems.get(x);	
		}
		return artifactObj;
	}	
}

