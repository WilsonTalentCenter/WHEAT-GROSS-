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
			System.out.println("You must be looking for rest, or work, or maybe some rum! I like rum!");
			System.out.println("You make your way to Chamell, and it is a rather small villa. A quick glance tells you this is a town of farmers and few merchants.");
			System.out.println("A billboard of papers catches your eye, and it looks like a bounty board.");
			System.out.println("So, why is it you came here, hm? What has brought you to Chamell?");
			System.out.println("Rest");
			System.out.println("Work");
			System.out.println("Rum");
			System.out.println("Passing through");
			decision = choice.nextLine();
			if(decision.equalsIgnoreCase("Rest")) {
				System.out.println("");
				System.out.println("Looking around, you find the inn and open the door.");
				System.out.println("You go towards the innkeeper");
				System.out.println("Innkeeper: Howdy friend! Welcome to the inn. Name's Hucklefurd. Whattaya need?");
				System.out.println("Examine");
				System.out.println("Rest (10 gold)");
				System.out.println("Converse");
				System.out.println("Leave");
				decision = choice.nextLine();
				if (decision.equalsIgnoreCase("Examine")) {
					System.out.println("");
					System.out.println("Looking around, you see that, for a small farming village, this inn is in quite an admirable condition.");
					System.out.println("Although that could be because of it's rather small size.");
					System.out.println("You see the front desk with Hucklefurd organizing what can only be potatoes.");
					System.out.println("So, now that you know what very little can be seen, what now?");
					System.out.println("Rest(10 gold)");
					System.out.println("Converse");
					System.out.println("Leave");
					decision = choice.nextLine();
					if (decision.equalsIgnoreCase("Rest")) {
						System.out.println("");
						System.out.println("Hucklefurd: Alright, that'll be 10 coin.");
						//code for paying this kind innkeeper
						System.out.println("You get a good night's rest and are ready to take on the day!");
						System.out.println("After thanking Hucklefurd for a place to rest, you find yourself in the lobby, watching Hucklefurd sort his potatoes with grace and skill.");
						System.out.println("Now what?");
						System.out.println("");
						System.out.println("Converse");
						System.out.println("Leave");
						decision = choice.nextLine();
					}
					if (decision.equalsIgnoreCase("Converse")) {
						System.out.println("");
						System.out.println("Hucklefurd: What is it ye wanta know?");
						System.out.println("");
						System.out.println("Chamell");
						System.out.println("Politics");
						System.out.println("Life Story");
						decision = choice.nextLine();
						if (decision.equalsIgnoreCase("Chamell")) {
							System.out.println("");
							System.out.println("Hucklefurd: Well, in case you didn't look, we're a small town. We only have a farm and if you was plannin at peekin the bounty board, don't.");
							System.out.println("Why?");
							System.out.println("Ok.");
							decision = choice.nextLine();
							if (decision.equalsIgnoreCase("Why?")) {
								System.out.println("Hucklefurd: Well, the bounties are other folk. He who controls the land controls the town. And I for one don't care for politics.");

							} else {
								System.out.println("");

							}
							System.out.println("Hucklefurd: Now, is there anything else I can do fur ye?");
							System.out.println("Politics");
							System.out.println("Life Story");
							System.out.println("Leave");
							decision = choice.nextLine();
							if (decision.equalsIgnoreCase("Politics")) {
								System.out.println("");
								System.out.println("Hucklefurd:I'm not one for politics, makes me head spin. That's also why I keep from the board outside. Disgraceful.");
								System.out.println("Life Story");
								System.out.println("Leave");
								decision = choice.nextLine();
							}
							if (decision.equalsIgnoreCase("Life Story")) {
								System.out.println("");
								System.out.println("Hucklefurd:I've never really been asked about me life.");
								System.out.println("But, if ye must know, I've been in Chamell all me life, known no other life than the life of an Innkeeper.");
								System.out.println("And I honestly don't intend to learn another life.");
							}
						}
					}
				}
				System.out.println("");
				System.out.println("You bid farewell to Hucklefurd, wishing him luck and good fortune.");
				System.out.println("Now you are back on the main road of Chamell, what now?");
				System.out.println("Work");
				System.out.println("Rum");
				System.out.println("Passing Through");
			}
			if(decision.equalsIgnoreCase("Work")){
				System.out.println("");
				System.out.println("You walk towards the bounty board, and see only two posters.");
				System.out.println("Examining the posters, you realize they read the same last name, and then you hear two doors open");
				System.out.println("Peasant 1:YOU'LL NEVER TAKE ME POTATOES!");
				System.out.println("Peasant 2:THOSE POTATOES ARE AS MUCH MINE AS YOURS, YOU GREEDY HARLOT!");
				System.out.println("Well, I guess that pretty much sums up the board, care to intervene or leave?");
				decision=choice.nextLine();
				if(decision.equalsIgnoreCase("Intervene")){
					System.out.println("");
					System.out.println("You step between the neighbors and demand names");
					System.out.println("Peasant 1: I am Cornelius Chuckle, rightful owner of this potato farm.");
					System.out.println("Peasant 2: LIKE HELL IT IS! Me name is Cornwall Chuckle, and I work these fields for me and me family.");
					System.out.println("Keep in mind you can leave at any point and let these filthy peasants kill each other.");
					System.out.println("Help the peasants");
					System.out.println("Rum");
					System.out.println("Leave");
				}
			}
			if(decision.equalsIgnoreCase("Rum")){
				System.out.println("");
				System.out.println("You look around and realize the only rum here is in potato form.");
				System.out.println("One could 'borrow' the potatoes, or one could never enjoy the sweet taste of rum.");
				System.out.println("Ask to borrow potatoes");
				System.out.println("Take potatoes and make rum");
				System.out.println("Live like a pleb (No rum)");
				decision = choice.nextLine();
				if(decision.equalsIgnoreCase("Ask")){
					System.out.println("");
					System.out.println("You knock on a door and a man appears.");
					System.out.println("Peasant: Is there something you require?");
					System.out.println("You explain your dire situation to this humble peasant.");
					System.out.println("Peasant: No rum!? What kind of savage would go rum-free!? Please, take as many potatoes as needed!");
				}
                if(decision.equalsIgnoreCase("Take")){
					System.out.println("");
					System.out.println("Finally! Some action!");
					System.out.println("You take as many potatoes as possible and pull out the Rum-o-matic 400!");
					System.out.println("As you make rum, a peasant spots you.");
					System.out.println("Peasant: What are you doing with them potatoes?");
					System.out.println("Lie");
					System.out.println("Attack");
					System.out.println("Truth");
					System.out.println("Ignore");
					decision=choice.nextLine();
					if(decision.equalsIgnoreCase("Truth")){
					    System.out.println("");
					    System.out.println("You explain the dire situation at hand");
					    System.out.println("Peasant: Ah, I understand. Although do ask, doing something like that can be real trouble.");
					    System.out.println("The peasant leaves, and your rum is done!");
                    }
				}

			}
		}
	}



    }

