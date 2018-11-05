import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard;

        String chosenWord;
        String player1;
        String player2;
        String again;
        String wrongLetter;
        String guessedLetter;



        keyboard = new Scanner(System.in);
        do {
            again = "";
            for (int i=0;i<=15;i++) {
                System.out.println("Hello welcome to the game where you Hang A Man or maybe not.");
                System.out.println("Pretty much one person chooses a word and the other person has to guess the word.");
                System.out.println("Who is the person choosing the word name?");
                player1 = keyboard.nextLine();
                System.out.println("And who is the person guessing name?");
                player2 = keyboard.nextLine();
                System.out.println("Well, " + player1 + " what word/words would you like to choose?");
                chosenWord = keyboard.nextLine().toLowerCase();



                System.out.println("Ok," + player2 + " start by guessing a letter.");

               System.out.println(displayHangman(i));





            }


            System.out.println("Would you like to play again?");
            again = keyboard.next() .toLowerCase();
        }while(again.equals("yes"));

    }

    public static String displayHangman(int errors){
        String display = "";

        switch(errors){
            case 0:
                default:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "+---------------+\n";

                break;
            case 1:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "+---------------+\n";


                break;

            case 2:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "+---------------+\n";

                break;
            case 3:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "+---------------+\n";

                break;
            case 4:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|      /        |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "+---------------+\n";

                break;
            case 5:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|               |\n"+
                          "|               |\n"+
                          "+---------------+\n";

                break;
            case 6:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|     /         |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 7:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|     /   \\     |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 8:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\     |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 9:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|       |       |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 10:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|      /|       |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 11:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|      /|\\      |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 12:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|     _/|\\      |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 13:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|     _/|\\_     |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 14:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|   \\_/|\\_     |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|               |\n"+
                          "+---------------+\n";
                break;
            case 15:
                display = "+---------------+\n"+
                        "|       |       |\n"+
                        "|       O       |\n"+
                        "|    \\_/|\\_/    |\n"+
                        "|       |       |\n"+
                        "|      / \\      |\n"+
                        "|    _/   \\_    |\n"+
                        "|               |\n"+
                        "+---------------+\n";
                break;
        }


        return display;


        /*System.out.println();
        System.out.println("|       |      |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("+--------------+");*/




    }
}