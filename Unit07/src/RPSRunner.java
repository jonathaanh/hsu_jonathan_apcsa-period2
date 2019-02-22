//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		//add in a do while loop after you get the basics up and running
		while(response!="n") {
			String player = "";
			
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(player);
			System.out.println(game);
			out.println("Do you want to play again? ");
			response = keyboard.next();
			if(response.equals("n")) {
				break;
			}
		}
	}
}



