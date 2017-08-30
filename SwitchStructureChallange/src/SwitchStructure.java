import java.util.Random;
import java.util.Scanner;

public class SwitchStructure
	{
		public static void main(String[] args)
			{
				
				//challenge 1
				
				Random rad = new Random();
				
				int randomNumber = rad.nextInt(20) +1;
				
				System.out.println("Your number is: " + randomNumber);
				
				switch(randomNumber){
					
					case 1:
					case 4:
					case 8:
					case 16:
					case 20:
					case 2:
							{
								System.out.println("You loose!");
							}
							break;
					case 3:
							{
								System.out.println("You Tie!");
							}
							break;
					case 6:
					case 10:
					case 12:
					case 14:
					case 18:
							{
								System.out.println("You Win!");
							}
							break;
					case 5:
					case 7:
					case 9:
					case 11:
					case 13:
					case 15:
					case 17:
					case 19:
							{
								System.out.println("You Tie!");
							}
					
					
				}
				
				//challenge 2
				
				Scanner randomWords = new Scanner(System.in);
				
				System.out.println("Enter your question!");
				
				String faveVar = randomWords.nextLine();
				
				Random radOne = new Random();
				
				int randomNumberOne = radOne.nextInt(20) +1;
				
				switch(randomNumberOne){
					
					case 1:
							{
						System.out.println("Ask again.");
							}
							break;
					case 4:
					case 8:
							{
						System.out.println("Do this and then give Ethan 5 dollars");
							}
							break;
					case 16:
					case 20:
					case 2:
							{
								System.out.println("Maybe");
							}
							break;
					case 3:
							{
								System.out.println("No!");
							}
							break;
					case 6:
					case 10:
					case 12:
							{
								System.out.println("Call your mom and ask her!");
							}
							break;
					case 14:
					case 18:
							{
								System.out.println("Yes");
							}
							break;
					case 5:
					case 7:
					case 9:
					case 11:
							{
								System.out.println("The Gods say Yes!");
							}
							break;
					case 13:
					case 15:
					case 17:
					case 19:
							{
								System.out.println("Absolutly Not!");
							}
							break;
					
					
				}

			}
	}
