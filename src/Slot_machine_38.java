import java.util.Random;
import java.util.Scanner;

public class Slot_machine_38 {
    static void SlotMachine(){
        //Java slot machine
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout; //win
        String[] row;
        String playagain;

        //display welcome message
        System.out.println("***********************");
        System.out.println(" Welocme to java slots ");
        System.out.println("Symbols: 🍎 🍉 🍋 🔔 ⭐️");
        System.out.println("***********************");

        //play if balance > 0
        while(balance>0){
            System.out.println("Current balance: $"+balance);

            //enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //varify if bet > balance
            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            //varify if bet > 0
            }else if(bet<=0){
                System.out.println("Bet must be greater than 0");
                continue;
            //subtract bet from balance
            }else{
                balance-=bet;
                System.out.println(balance);
            }

            //spin row
            System.out.println("Spinning...");
            row = spinRow();

            //print rowx
            printRow(row);

            //get payout(win)
            payout = getPayout(row,bet);
            if(payout > 0){
                System.out.println("You won $" + payout);
                balance+=payout;
            }else{
                System.out.println("Sorry, you lost this round");
            }

            //ask to play again
            System.out.println("Do you want to play again? {Y/N}: ");
            playagain = scanner.nextLine().toUpperCase();

            if(!playagain.equals("Y")){
                break;
            }

        }
        //display exit message
        System.out.println("Game over! Your final balance is $"+balance);

        scanner.close();
    }
    static String[] spinRow(){
        String[] symbols = { "🍎"," 🍉"," 🍋", "🔔", "⭐️"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println(" "+String.join(" | ",row));//row中的每个元素用|分割
    }
    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {   //🍎 🍉 🍋 🔔 ⭐️
                case "🍎" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;
            };
        }else if (row[0].equals(row[1])) {
            return switch (row[0]) {   //🍎 🍉 🍋 🔔 ⭐️
                case "🍎" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
            else if(row[1].equals(row[2])){
                return switch (row[1]) {   //🍎 🍉 🍋 🔔 ⭐️
                    case "🍎" -> bet * 3;
                    case "🍉" -> bet * 4;
                    case "🍋" -> bet * 5;
                    case "🔔" -> bet * 10;
                    case "⭐️" -> bet * 10;
                    default -> 0;
                };
            }
            return 0;
        }


}
