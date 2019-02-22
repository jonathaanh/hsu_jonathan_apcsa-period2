//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		int choice = (int)(Math.random()*3);
		switch (choice) {
		case 0 : compChoice = "R";
		break;
		case 1 : compChoice = "P";
		break;
		case 2 : compChoice = "S";
		}
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		if(compChoice.equals(playChoice)) {
			winner = "Draw Game!";
		}
		else if(compChoice.equals("R")&&playChoice.equals("S")) {
			winner = "Computer Wins<<Rock Breaks Scissors>>!";
		}
		else if(compChoice.equals("P")&&playChoice.equals("S")) {
			winner = "Player Wins<<Scissors Cuts Paper>>!";
		}

		else if(compChoice.equals("S")&&playChoice.equals("R")) {
			winner = "Player Wins<<Rock Breaks Scissors>>!";
		}

		else if(compChoice.equals("P")&&playChoice.equals("R")) {
			winner = "Computer Wins<<Paper Covers Rock>>!";
		}

		else if(compChoice.equals("R")&&playChoice.equals("P")) {
			winner = "Player Wins<<Paper Covers Rock>>!";
		}

		else if(compChoice.equals("S")&&playChoice.equals("P")) {
			winner = "Computer Wins<<Scissors Cuts Paper>>!";
		}

		return winner;
	}

	public String toString()
	{
		String output="player had "+ playChoice +"\n" + "computer had "+ compChoice+"\n"+ determineWinner();
		return output;
	}
}