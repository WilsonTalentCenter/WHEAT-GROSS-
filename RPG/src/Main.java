import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to the world of Dam!");
	System.out.println("I am the gracious voice in your head! I am also known as 'Damnable creature'! You may call me Bailey O'Brownian!");
	System.out.println("You are a man. A man on a mission!");
	System.out.println("This mission is to have the biggest numbers that ever numbered!");
	System.out.println("To complete this mission; you will kill things, read words like an English Major, and play the ultimate game of pretend!");
	System.out.println("");
	System.out.println("Your journey begins on the road, and the first decision comes to you on a fork. Do you go left, right, or look around?");
		Scanner choice = new Scanner(System.in);
		String decision = choice.nextLine();
		if(decision.equalsIgnoreCase("fuck")){
			System.out.println("");
			System.out.println("CONGRATULATIONS! YOU WON!");
			System.out.println("You beat the English Majors at their own game!");
			System.out.println("This calls for rum!");
			System.out.println("I like rum");
		}
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
				System.out.println("Continuing to analyze the turtle, you see it has a cannon, complete with a squirell operator");
				System.out.println("Seeing this dynamic duo, you determine that the squirell operated turtle-tank could be a very valuable ally.");
				System.out.println("Or a prized kill... So, do you befriend, fight, or pass this turtle?");
				decision = choice.nextLine();
			}
			if(decision.equalsIgnoreCase("Befriend")){
				System.out.println("");
				System.out.println("You decide to engage in diplomatic relations with the turtle and have agreed in alliance.");
				System.out.println("Although the turtle has agreed to ally with you, the squirell seems disgruntled.");
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
		}
		if(decision.equalsIgnoreCase("Left")){
			System.out.println("");
			System.out.println("I can see your need for a town, perhaps you are in need of rest, or work, or maybe rum!");
			System.out.println("I like rum!");
			System.out.println("You have arrived in Chamell!");
			System.out.println("A quick glance shows all that is needed to know of this small series of hovels.");
			System.out.println("There is a small store, two houses, and an inn. You also see a bounty board.");
			System.out.println("So, what has brought you to Chamell?");
			System.out.println("Rest");
			System.out.println("Work");
			System.out.println("Rum");
			System.out.println("Passing through");
			decision=choice.nextLine();
			if(decision.equalsIgnoreCase("Rest")){
				System.out.println("");
				System.out.println("You walk in the inn.");
				System.out.println("Hucklefurd:Howdy! Name's Hucklefurd. What can I do fur ye?");
				System.out.println("");
				System.out.println("Rest (10gold)");
				System.out.println("Converse");
				System.out.println("Leave");
				decision=choice.nextLine();
				if(decision.equalsIgnoreCase("rest")){
					System.out.println("");
					System.out.println("Hucklefurd: At'll be 10 peeses.");
					System.out.println("As you pay the kind innkeeper, you find yourself asleep.");
					//code for payment
					//code for sleep
					System.out.println("You return to the front desk well rested, seeing Hucklefurd sort potatoes.");
					System.out.println("Converse");
					System.out.println("Leave");
					decision=choice.nextLine();
				}
				if(decision.equalsIgnoreCase("Converse")){
					System.out.println("");
					System.out.println("Hucklefurd: What ye want tuh knoew?");
					System.out.println("");
					System.out.println("Work");
					System.out.println("Life story");
					System.out.println("Chamell");
					System.out.println("Politics");
					System.out.println("Rum");
					decision=choice.nextLine();
					if(decision.equalsIgnoreCase("Work")){
						System.out.println("");
						System.out.println("Hucklefurd: As ye mite noetice, this is aye rather cawlm place.");
						System.out.println("Hucklefurd: The boord outsied don offer much, but ye can git sumtin from it.");
						System.out.println("Hucklefurd: Af cours, the problem wit teh boord, is the bountis ar against eachother, so ultimately, ye choos a sied.");
						System.out.println("Hucklefurd: Disgraceful.");
						System.out.println("Hucklefurd: Now ten, is theyr anytin els?");
						System.out.println("");
						System.out.println("Life Story");
						System.out.println("Chamell");
						System.out.println("Politics");
						System.out.println("Rum");
						decision=choice.nextLine();
					}
					if(decision.equalsIgnoreCase("Life Story")){
						System.out.println("");
						System.out.println("Hucklefurd: I've ben an inkeepeh oll me loife.");
						System.out.println("Hucklefurd: Ther han't a reesin fur me tuh leev, an' I doun' inten teh noew.");
						System.out.println("Hucklefurd: Anytin els?");
						System.out.println("");
						System.out.println("Work");
						System.out.println("Chamell");
						System.out.println("Politics");
						System.out.println("Rum");
					}
					if(decision.equalsIgnoreCase("Chamell")){
						System.out.println("");
						System.out.println("Hucklefurd: You'v seen teh size here, soh I can' really say what yeh don't knoew.");
						System.out.println("Hucklefurd: Actualee, teh stor has a gud selecshun of items if yeh need 'em.");
						System.out.println("");
						System.out.println("What kind of items?");
						System.out.println("Neat, thanks!");
						System.out.println("Didn't have a problem getting here, shouldn't have a problem at all.");
						decision = choice.nextLine();
						if(decision.equalsIgnoreCase("What kind of items?")){
							System.out.println("");
							System.out.println("Hucklefurd: Ben a wile since I wes theyr, but I beeleev they haf a smoll selecshun of swords and armors.");
							System.out.println("Rum, too.");
							System.out.println("");
							System.out.println("I like rum");
							System.out.println("Any potions?");
							System.out.println("Thanks, I'll take a look");
							decision=choice.nextLine();
							if(decision.equalsIgnoreCase("Any potions?")){
								System.out.println("");
								System.out.println("Hucklefurd: Last I wes theyr, noe. But as I saed, it's ben 'wile.");
							}
						}
					}
				}
			}
		}



    }
}

