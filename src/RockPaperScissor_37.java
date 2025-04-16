import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor_37 {
    static void RPS(){
        //Rock paper scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Declare variables
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            //Get choice from the user
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if(!playerChoice.equals("rock")&&!playerChoice.equals("paper")&&!playerChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }

            //Get random choice from the computer
            computerChoice = choices[random.nextInt(0,3)];
            System.out.println("Computer choice: "+computerChoice);

            //Check win conditions
            //第一种：分开写，清晰易读
        /*
        if(playerChoice.equals(computerChoice)){
            System.out.println("It is a tie!");
        }else if(playerChoice.equals("rock")&&computerChoice.equals("scissors")){
            System.out.println("You win!");
        }else if(playerChoice.equals("paper")&&computerChoice.equals("rock")){
            System.out.println("You win!");
        }else if(playerChoice.equals("scissors")&&computerChoice.equals("paper")){
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }
         */
            //第二种：集中写
            if(playerChoice.equals(computerChoice)){
                System.out.println("It is a tie!");
            }else if(playerChoice.equals("rock")&&computerChoice.equals("scissors")
                    ||playerChoice.equals("paper")&&computerChoice.equals("rock")
                    ||playerChoice.equals("scissors")&&computerChoice.equals("paper")){
            }else{
                System.out.println("You lose!");
            }

            //Ask to play again?
            System.out.print("Play again(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while( playAgain.equals("yes"));

        //Goodbye message
        System.out.println("Thanks for playing!");


        scanner.close();
    }
}
