import java.util.Scanner;

public class quizGame_36 {
    static void quizGame(){
        //Java quiz game

        //questions array[]
        String[] questions={"What is the main function of a router?",
                            "Which part of the computer is considered the brain",
                            "What year was Facebook launched?",
                            "Who is known as the father of computer?",
                            "What was the first programming language?"};
        //options array[][]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3.Directing internet traffic", "4.Managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3.RAM", "4.GPU"},
                              {"1. 2000", "2. 2004", "3.2006", "4.2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3.Alan Turing", "4.Charles Babbage"},
                              {"1. Cobol", "2. C", "3.Fortran", "4.Assembly"}};

        //declare message
        //answers array
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        //welcome message
        System.out.println("******************************");
        System.out.println("Welcome to the java quiz game!");
        System.out.println("******************************");

        //逐一展示Question(loop)和options，并等待用户如输入选项；
        for(int i=0; i < questions.length;i++){
            System.out.println(questions[i]);
            //  options
            for(String option:options[i]){
                System.out.print(option+"   ");
            }
            System.out.println();

            //  get guess from user
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //  check our guess
            if(guess == answers[i]){
                System.out.println("Correct! ");
                score++;
            }else{
                System.out.println("Wrong! ");
            }
        }
        //Disply final score
        System.out.println("Your final score is: " + score + " out of "+questions.length);

        scanner.close();
    }
}
