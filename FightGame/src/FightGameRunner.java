import java.util.ArrayList;
import java.util.Scanner;

public class FightGameRunner
	{
		static ArrayList <Fight> deck = new ArrayList <Fight>( );
		static String firstName;
		static String secondName;
		static int firstChosenName;
		static int secondChosenName;
		
		public static void main(String[] args)
			{
				defineFighters();
				discovered();
				playerOneName();
				playerTwoName();
				compareNames();
				fight();

			}
		static void playAgain()
		{
			deck.get(firstChosenName).setCharacterHealth(deck.get(firstChosenName).getMaxHp());
			deck.get(secondChosenName).setCharacterHealth(deck.get(secondChosenName).getMaxHp());
			Scanner playAgain = new Scanner (System.in);
			System.out.println("Would you like to play again?");
			System.out.println("(1) Yes");
			System.out.println("(2) No");
			int again = playAgain.nextInt();
			if (again == 1)
				{
					discovered();
					playerOneName();
					playerTwoName();
					compareNames();
					fight();
				}
			else
				{
					System.exit(0);
				}
		}
		public static void defineFighters()
		{
			deck.add(new Fight("Andrew", 100, 20, "Super-Slam", "Get Rekt", "You missed the slam", 33, 25, "Extreme Punch", "Ka-Pow!", "You miss and hit the wall instead", 33, 40, "Super Kick", "You didn't skip a leg day! LEGenDArY!", "Maybe next time spend a little more time on those legs", 50 , 20, "Karate Chop", "Nice!", "You have missed", 33, 100, "EPIC ATTACK", 50, false, 100));
			deck.add(new Fight("Trump", 1000, 40, "Build a Wall", "DEPORTED!", "The Democrats will not let you", 33, 65, "RACISM", "Now everyone hates your opponent", "Backfire", 33, 80, "Piss off everyone", "That somehow injured your opponent?", "Backfire", 50 , 20, "Karate Chop", "Nice!", "You have missed", 33, 1000, "DESTROY HILARY", 70, false, 1000));
			deck.add(new Fight("Jack", 1000, 50, "Wimpy Punch", "That is kinda good... I guess", "Your wimpy punch has missed", 33, 4, "Wimpy Kick", "Wow! I'm kinda suprised you hit your opponent", "Unsurprisingly you have missed", 33, 4, "Unimpressive Slam", "Unimpressive", "Even more unimpressive", 33 , 2, "Karate Chop", "That was amusingly bad!", "HAHAHAHA", 33, 30, "Dank Meme", 15, true, 40));
			deck.add(new Fight("Chris", 40, 5, "Wimpy Punch", "That is kinda good... I guess", "Your wimpy punch has missed", 33, 4, "Wimpy Kick", "Wow! I'm kinda suprised you hit your opponent", "Unsurprisingly you have missed", 33, 4, "Unimpressive Slam", "Unimpressive", "Even more unimpressive", 33 , 2, "Karate Chop", "That was amusingly bad!", "HAHAHAHA", 33, 30, "Dank Meme", 15, true, 40));
			deck.add(new Fight("Michael", 30, 3, "Wimpy Punch", "That is kinda good... I guess", "Your wimpy punch has missed", 33, 2, "Wimpy Kick", "Wow! I'm kinda suprised you hit your opponent", "Unsurprisingly you have missed", 33, 2, "Unimpressive Slam", "Unimpressive", "Even more unimpressive", 33 , 1, "Karate Chop", "That was amusingly bad!", "HAHAHAHA", 33, 30, "Dank Meme", 15, true, 30));
			deck.add(new Fight("Sassy Sarah", 9, 1, "Super-Slap", "POW!", "Gosh Dang it", 10, 25, "Extreme Punch", "Ka-Pow!", "You miss and hit the wall instead", 33, 40, "Super Kick", "You didn't skip a leg day! LEGenDArY!", "Maybe next time spend a little more time on those legs", 50 , 20, "Karate Chop", "Nice!", "You have missed", 33, 100, "EPIC ATTACK", 50, false, 9999999));
			deck.add(new Fight("Chancellor Palpatine", 200, 20, "Execute Order 66", "Order 66 has been executed", "You were stopped by Yoda before it could happen", 34, 25, "Kill him now", "DO IT", "DONT DO IT", 33, 40, "Lightning", "UNLIMITED POWER", "It's not late enough in the movie for you to be using that", 50 , 24, "Convince Anakin to kill all the younglings", "do it", "it's not late enough in the movie for you to use that", 33, 1000, "*STAR WARS THEME INTENSIFIES*", 50, false, 200));
		}
		public static void discovered()
		{
			System.out.println("DISCOVERED FIGHTERS ARE:");
			for (Fight f: deck)
				{
					if (f.isDiscovered() == true)
						{
					System.out.println(f.getName());
						}
				}
		}
		public static void playerOneName()
			{
				System.out.println("A new hero is approaching.  What is your name?");
				Scanner firstPlayerName = new Scanner(System.in);
				firstName = firstPlayerName.nextLine();
			}
		public static void playerTwoName()
			{
				System.out.println("Hey you! Yeah you! Choose your name!");
				Scanner secondPlayerName = new Scanner(System.in);
				secondName = secondPlayerName.nextLine();
				if (firstName.equals(secondName))
					{
						System.out.println("Please choose a different name than the first hero!");
						playerTwoName();
					}
			}
		public static void compareNames()
		{
			for (int i = 0; i < deck.size(); i++)
				{
					if (deck.get(i).getName().equals(firstName))
						{
							firstChosenName = i;
						}
				}
			if (firstChosenName == 0)
				{
					deck.add(new Fight(firstName, 50, 5, "Slam", "Get Rekt", "You missed the slam", 33, 15, "Punch", "Ka-Pow!", "You miss and hit the wall instead", 33, 12, "Kick", "You didn't skip a leg day! LEGenDArY!", "Maybe next time spend a little more time on those legs", 50 , 10, "Karate Chop", "Nice!", "You have missed", 33, 35, "EPIC ATTACK", 20, true, 50));
					firstChosenName = deck.size() - 1;
				}
			for (int i = 0; i < deck.size(); i++)
				{
					if (deck.get(i).getName().equals(secondName))
						{
							secondChosenName = i;
						}
				}
			if (secondChosenName == 0)
				{
					deck.add(new Fight(secondName, 50, 5, "Slam", "Get Rekt", "You missed the slam", 33, 15, "Punch", "Ka-Pow!", "You miss and hit the wall instead", 33, 12, "Kick", "You didn't skip a leg day! LEGenDArY!", "Maybe next time spend a little more time on those legs", 50 , 10, "Karate Chop", "Nice!", "You have missed", 33, 35, "EPIC ATTACK", 20, true, 50));
					secondChosenName = deck.size() - 1;
				}
			deck.get(firstChosenName).setDiscovered(true);
			deck.get(secondChosenName).setDiscovered(true);
		}
		public static void fight()
		{
			Scanner firstPlayerChoice = new Scanner(System.in);
			Scanner secondPlayerChoice = new Scanner(System.in);
			int choice = 0;
			int computerOrHuman = 0;
			int firstSpecial = 0;
			int secondSpecial = 0;
			double addPlayerOneSpecial = 0;
			double addPlayerTwoSpecial = 0;
			
		System.out.println("Would you like to play against:");
		System.out.println("(1) Another Player");
		System.out.println("(2) The Computer");
		computerOrHuman = firstPlayerChoice.nextInt();
		if (computerOrHuman == 1)
		{
		while (deck.get(firstChosenName).getCharacterHealth() >= 0 && deck.get(secondChosenName).getCharacterHealth() >= 0)
			{
				System.out.println(deck.get(firstChosenName).getName() + "                       " + deck.get(secondChosenName).getName());
				System.out.println(deck.get(firstChosenName).getCharacterHealth() + "                              " + deck.get(secondChosenName).getCharacterHealth());
				System.out.println("First Hero's Turn!");
				System.out.println("(1) " + deck.get(firstChosenName).getFirstAttack());
				System.out.println("(2) " + deck.get(firstChosenName).getSecondAttack());
				System.out.println("(3) " + deck.get(firstChosenName).getThirdAttack());
				System.out.println("(4) " + deck.get(firstChosenName).getFourthAttack());
				if (deck.get(firstChosenName).getSpecialPercentage() <= addPlayerOneSpecial)
				{
					System.out.println("(5) " + deck.get(firstChosenName).getSpecialAttack());
				}
			else if (deck.get(firstChosenName).getSpecialPercentage() > addPlayerOneSpecial)
					{
						System.out.println("(5) " + (int)(addPlayerOneSpecial / deck.get(firstChosenName).getSpecialPercentage() * 100) + "%");
					}
				int accuracy = (int)(Math.random()*100);
				
				choice = firstPlayerChoice.nextInt();
					if (choice == 1 && deck.get(firstChosenName).getFirstAttackAccuracy() <= accuracy)
						{
							deck.get(secondChosenName).setCharacterHealth(deck.get(secondChosenName).getCharacterHealth() - deck.get(firstChosenName).getFirstAttackDamage());
							System.out.println(deck.get(firstChosenName).getFirstAttackHit() + " HP -" + deck.get(firstChosenName).getFirstAttackDamage());
							addPlayerTwoSpecial = addPlayerTwoSpecial + deck.get(firstChosenName).getFirstAttackDamage();
						}
					else if (choice == 1 && deck.get(firstChosenName).getFirstAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(firstChosenName).getFirstAttackMiss());
						}
					else if (choice == 2 && deck.get(firstChosenName).getSecondAttackAccuracy() <= accuracy)
						{
							deck.get(secondChosenName).setCharacterHealth(deck.get(secondChosenName).getCharacterHealth() - deck.get(firstChosenName).getSecondAttackDamage());
							System.out.println(deck.get(firstChosenName).getSecondAttackHit() + " HP -" + deck.get(firstChosenName).getSecondAttackDamage());
							addPlayerTwoSpecial = addPlayerTwoSpecial + deck.get(firstChosenName).getSecondAttackDamage();
						}
					else if (choice == 2 && deck.get(firstChosenName).getSecondAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(firstChosenName).getSecondAttackMiss());
						}
					else if (choice == 3 && deck.get(firstChosenName).getThirdAttackAccuracy() <= accuracy)
						{
							deck.get(secondChosenName).setCharacterHealth(deck.get(secondChosenName).getCharacterHealth() - deck.get(firstChosenName).getThirdAttackDamage());
							System.out.println(deck.get(firstChosenName).getThirdAttackHit() + " HP -" + deck.get(firstChosenName).getThirdAttackDamage());
							addPlayerTwoSpecial = addPlayerTwoSpecial + deck.get(firstChosenName).getThirdAttackDamage();
						}
					else if (choice == 3 && deck.get(firstChosenName).getThirdAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(firstChosenName).getThirdAttackMiss());
						}
					else if (choice == 4 && deck.get(firstChosenName).getFourthAttackAccuracy() <= accuracy)
						{
							deck.get(secondChosenName).setCharacterHealth(deck.get(secondChosenName).getCharacterHealth() - deck.get(firstChosenName).getFourthAttackDamage());
							System.out.println(deck.get(firstChosenName).getFourthAttackHit() + " HP -" + deck.get(firstChosenName).getFourthAttackDamage());
							addPlayerTwoSpecial = addPlayerTwoSpecial + deck.get(firstChosenName).getFourthAttackDamage();
						}
					else if (choice == 4 && deck.get(firstChosenName).getFourthAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(firstChosenName).getFourthAttackMiss());
						}
	//				else if (deck.get(firstChosenName).getSpecialPercentage() > addPlayerTwoSpecial && choice == 5)
	//					{
	//						System.out.println("You got way to excited! Calm down there!");
	//					}
	//				else if (deck.get(firstChosenName).getSpecialPercentage() <= addPlayerTwoSpecial && choice == 5)
	//					{
	//						deck.get(secondChosenName).setCharacterHealth(deck.get(secondChosenName).getCharacterHealth() - deck.get(firstChosenName).getSpecialAttackDamage());
	//						System.out.println("EPIC!!" + " HP -" + deck.get(firstChosenName).getSpecialAttackDamage());
	//						addPlayerOneSpecial = addPlayerOneSpecial + deck.get(firstChosenName).getSpecialAttackDamage();
	//					}
					else
						{
							System.out.println("Because you're stupid you missed your turn.");
						}
					if (deck.get(secondChosenName).getCharacterHealth() <= 0)
						{
							System.out.println(deck.get(firstChosenName).getName() + " wins!");
							playAgain();
						}
					System.out.println(deck.get(firstChosenName).getName() + "                       " + deck.get(secondChosenName).getName());
					System.out.println(deck.get(firstChosenName).getCharacterHealth() + "                              " + deck.get(secondChosenName).getCharacterHealth());
					System.out.println("Second Hero's Turn!");
					System.out.println("(1) " + deck.get(secondChosenName).getFirstAttack());
					System.out.println("(2) " + deck.get(secondChosenName).getSecondAttack());
					System.out.println("(3) " + deck.get(secondChosenName).getThirdAttack());
					System.out.println("(4) " + deck.get(secondChosenName).getFourthAttack());
	//				if (deck.get(secondChosenName).getSpecialPercentage() <= addPlayerTwoSpecial)
	//					{
	//						System.out.println("(5) " + deck.get(secondChosenName).getSpecialAttack());
	//					}
	//				else if (deck.get(secondChosenName).getSpecialPercentage() > addPlayerTwoSpecial)
	//					{
	//						System.out.println("(5) " + (int));
	//								(addPlayerOneSpecial / deck.get(firstChosenName).getSpecialPercentage() * 100) + "%");
	//					}
					choice = firstPlayerChoice.nextInt();
					
					accuracy = (int)(Math.random()*100);
					
					if (choice == 1 && deck.get(secondChosenName).getFirstAttackAccuracy() <= accuracy)
						{
							deck.get(firstChosenName).setCharacterHealth(deck.get(firstChosenName).getCharacterHealth() - deck.get(secondChosenName).getFirstAttackDamage());
							System.out.println(deck.get(secondChosenName).getFirstAttackHit() + " HP -" + deck.get(secondChosenName).getFirstAttackDamage());
							addPlayerOneSpecial = addPlayerOneSpecial + deck.get(secondChosenName).getFirstAttackDamage();
						}
					else if (choice == 1 && deck.get(secondChosenName).getFirstAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(secondChosenName).getFirstAttackMiss());
						}
					else if (choice == 2 && deck.get(secondChosenName).getSecondAttackAccuracy() <= accuracy)
						{
							deck.get(firstChosenName).setCharacterHealth(deck.get(firstChosenName).getCharacterHealth() - deck.get(secondChosenName).getSecondAttackDamage());
							System.out.println(deck.get(firstChosenName).getSecondAttackHit() + " HP -" + deck.get(secondChosenName).getSecondAttackDamage());
							addPlayerOneSpecial = addPlayerOneSpecial + deck.get(secondChosenName).getSecondAttackDamage();
						}
					else if (choice == 2 && deck.get(secondChosenName).getSecondAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(secondChosenName).getSecondAttackMiss());
						}
					else if (choice == 3 && deck.get(secondChosenName).getThirdAttackAccuracy() <= accuracy)
						{
							deck.get(firstChosenName).setCharacterHealth(deck.get(firstChosenName).getCharacterHealth() - deck.get(secondChosenName).getThirdAttackDamage());
							System.out.println(deck.get(secondChosenName).getThirdAttackHit() + " HP -" + deck.get(secondChosenName).getThirdAttackDamage());
							addPlayerOneSpecial = addPlayerOneSpecial + deck.get(secondChosenName).getThirdAttackDamage();
						}
					else if (choice == 3 && deck.get(secondChosenName).getThirdAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(secondChosenName).getThirdAttackMiss());
						}
					else if (choice == 4 && deck.get(secondChosenName).getFourthAttackAccuracy() <= accuracy)
						{
							deck.get(firstChosenName).setCharacterHealth(deck.get(firstChosenName).getCharacterHealth() - deck.get(secondChosenName).getFourthAttackDamage());
							System.out.println(deck.get(secondChosenName).getFourthAttackHit() + " HP -" + deck.get(secondChosenName).getFourthAttackDamage());
							addPlayerOneSpecial = addPlayerOneSpecial + deck.get(secondChosenName).getFourthAttackDamage();
						}
					else if (choice == 4 && deck.get(secondChosenName).getFourthAttackAccuracy() > accuracy)
						{
							System.out.println(deck.get(secondChosenName).getFourthAttackMiss());
						}
					else if (deck.get(secondChosenName).getSpecialPercentage() > addPlayerTwoSpecial && choice == 5)
						{
							System.out.println("You got way to excited! Calm down there!");
						}
					else if (deck.get(secondChosenName).getSpecialPercentage() <= addPlayerTwoSpecial && choice == 5)
						{
					deck.get(firstChosenName).setCharacterHealth(deck.get(firstChosenName).getCharacterHealth() - deck.get(secondChosenName).getSpecialAttackDamage());
						System.out.println("EPIC!!" + " HP -" + deck.get(secondChosenName).getSpecialAttackDamage());
						    addPlayerOneSpecial = addPlayerOneSpecial + deck.get(secondChosenName).getSpecialAttackDamage();
						}
					else
						{
							System.out.println("Because you're stupid you missed your turn.");
						}
						if (deck.get(firstChosenName).getCharacterHealth() <= 0)
							{
								System.out.println(deck.get(secondChosenName).getName() + " wins!");
								playAgain();
							}
			}
			}
		}
}
