package CryptoLapp;

import java.util.*;
public class RockPaperScissor 
{
	public static void main(String[] args) {  
	   Scanner scanner = new Scanner(System.in);
	   
	    int playerScore = 0;
	    int computerScore = 0;
	    while (true)
	    {
	      String[] rps = {"rock", "paper", "scissor"};
	      String computerMove = rps[new Random().nextInt(rps.length)];
	     
	      String playerMove;
	     
	      while(true) 
	      {
	        System.out.println("Please enter your move (rock, paper, or scissor)");
	        playerMove = scanner.nextLine();
	        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor"))
	        {
	          break;
	        }
	        System.out.println(playerMove + " is not a valid move.");
	      }
	     
	      System.out.println("Computer played: " + computerMove);
	     
	      if (playerMove.equals(computerMove)) {
	        
	      }
	      else if (playerMove.equals("rock")) {
	        if (computerMove.equals("paper")) {
	          computerScore++;
	         
	        } else if (computerMove.equals("scissor")) {
	          playerScore++;
	        }
	      }
	     
	      else if (playerMove.equals("paper")) {
	        if (computerMove.equals("rock")) {
	         
	          playerScore++;
	         
	        } else if (computerMove.equals("scissor")) {
	          
	          computerScore++;
	        }
	      }
	     
	      else if (playerMove.equals("scissor"))
	      {
	        if (computerMove.equals("paper"))
	        {   
	          playerScore++;
	         
	        } else if (computerMove.equals("rock")) 
	        { 
	          computerScore++;
	        }
	      }
	     
	      System.out.println("Your Score = "+playerScore + " Computer Score = "+computerScore);
	      
	     
	      if (playerScore == 10 || computerScore == 10) 
	      {
	          if(playerScore ==  10) 
	          {
	              System.out.println("You Won...");
	          }
	          else
	          {
	              System.out.println("Computer Won...");
	          }
	        break;
	      }
	    }
	    System.out.println("Have a Nice day !!");
	    scanner.close();
   }
}
