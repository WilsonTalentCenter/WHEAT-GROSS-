import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to the world of Dam!");
	System.out.println("You are a man. A man on a mission!");
	System.out.println("This mission is to have the biggest numbers that ever numbered!");
	System.out.println("To complete this mission; you will kill things, read words like an English Major, and play the ultimate game of pretend!");
	System.out.println("");
	System.out.println("Your journey begins on the road, and the first decision comes to you on a fork. Do you go left, right, or look around?");
		Scanner choice = new Scanner(System.in);
		String decision = choice.nextLine();
		if(decision.equalsIgnoreCase("Look Around")){
			System.out.println("");
			System.out.println("Looking around, you awe at the majesty of a sign. This sign holds knowledge of the paths set before you.");
			System.out.println("Examining the sign, you read that the right prong is only labeled as 'ADVENTURE!', and the left reads 'To Chamell'");
			System.out.println("Now that you are blessed by the knowledge of the sign, do you go right, or left?");
			decision = choice.nextLine();
		}
		if(decision.equalsIgnoreCase("Right")){
			System.out.println("");
			System.out.println("Ah! An adventurer enters the realm! Taking the right prong, you find a turtle!");
			System.out.println("Do you wish to befriend, fight, examine, or pass this creature?");
			decision = choice.nextLine();
			if(decision.equalsIgnoreCase("Examine")){
				System.out.println("");
				System.out.println("Examining the turtle, you realize that this is a very teeny turtle. Vary small. It is a miracle it got from the ocean to the forest.");
				System.out.println("You determine, based on the fact that this tiny turtle isn't dead, that it is quite durable, and would be a valuable ally.");
				System.out.println("Or a prized kill... So, do you befriend, fight, or pass this turtle?");
				decision = choice.nextLine();
			}
			if(decision.equalsIgnoreCase("Befriend")){
				System.out.println("");
				System.out.println("You decide to engage in diplomatic relations with the turtle and have agreed in alliance.");
				System.out.println("Congrats! A turtle has joined your party. Enjoy it");
				//insert code to actually add the turtle as a party member (Might be found in PetTurtle class)
			}else if(decision.equalsIgnoreCase("Fight")){
				System.out.println("");
				System.out.println("You engage in combat with a turtle! Not sure why... But DEATH TO THE SOUP MIX!");
				//insert the combat code (Might be found in enemy class) here
			}else if(decision.equalsIgnoreCase("pass")){
				System.out.println("");
				System.out.println("Seeing the turtle, you know the bad times won't be bad, and move on, blessed by the turtle's presence.");
			}
			/**
			 * if(decision.equalIgnoreCase("Left"){
			 * System.out.println("");
			 * System.out.println("On your voyage to Chamell, you encounter a merchant of interesting attire.");
			 * System.out.println("Do you talk with the merchant, examine the merchant, or fight the merchant");
			 * if(decision.equalIgnoreCase("examine"){
			 * System.out.println("Right off the bat you know this merchant is not human. He seems to have the body structure and features of a turtle.");
			 * System.out.println("On his shell, he has a pack of various wares and knick-knacks. As well as on a sash he wears over his white coat and blue shirt.");
			 * System.out.println("Now the various wares are turtle themed, and at such a small size!");
			 * System.out.println("Now that you have a vague idea of who this 'man' is, do you talk, or fight or pass this merchant?");
			 * decision = choice.nextLine();
			 * }
			 * if(decision.equalsIgnoreCase("talk"){
			 * We'll  need an array of 4 options for dialogue selection, as well as an array for the items sold by this merchant, or we could use some key phrases to trigger responses...
			 * }
			 * if(decision.equalsIgnoreCase("fight"){
			 * System.out.println("You ready a stance suggesting combat, yet the merchant seems unphased by this.");
			 * System.out.println("In fact, it seems as though he was expecting a conflict. Be wary");
			 * System.out.println("You engage in combat with the Turtle Merchant!");
			 * }
			 * if(decision.equalsIgnoreCase("pass"){
			 * System.out.println("");
			 * System.out.println("You have decided that this merchant is no interest to you, and move along the path, eager to arrive in town, or find something else.")
			 * And then Evan can type his prints and story here, or before this. I honestly don't care. 
			 */
			//Now for setting up some classes. We'll only need a Player class, a Turtle class, and a PetTurtle class. If you need any help with setting this up, take a look at the adv-objects assignment
			//I'll work on getting some basic stats for the player, as well as combat initiation. All I ask is for whoever plans on working in the Turtle and PetTurtle Class, to give the turtle low health and high defense, as well as a poison debuff, or something.
			//Now that I'm thinking about it, I think we should label all the hostile entities as enemies, and put the names and stats of each in that class... Lemme know what you guys think of that.

		}
		}


    }

