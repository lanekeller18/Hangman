
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard;

        String chosenWord;
        String player1;
        String player2;
        String again;
        char guess;
        int player1points;
        int player2points;
        String guess3;
        int tries;
        String[] currentGuessbreakdown;




        keyboard = new Scanner(System.in);

            player1points=0;
            player2points=0;
            tries=0;

            System.out.println("Hello welcome to the game where you Hang A Man or maybe not.");
                System.out.println("Pretty much one person chooses a word and the other person has to guess the word.");
                do {
                System.out.println("Who is the person choosing the word name?");
                player1 = keyboard.nextLine();
                System.out.println("And who is the person guessing name?");
                player2 = keyboard.nextLine();
                System.out.println("Well, " + player1 + " what word/words would you like to choose?");
                chosenWord = keyboard.nextLine().toLowerCase();
                String currentGuessPhrase = setHiddenWord(chosenWord);
                String hiddenWord = setHiddenWord(chosenWord);


                //System.out.println(chosenWord);


                    guess3= " ";
                System.out.println(" ");

                System.out.println("Ok, " + player2 + ", guess a letter.");
                String guess1 = keyboard.nextLine().toLowerCase();
                do {
                    guess = guess1.charAt(0);
                    System.out.println(showLettersGussed(guess, hiddenWord, chosenWord));
                    hiddenWord = showLettersGussed(guess, hiddenWord, chosenWord);
                    System.out.println(displayHangman(0));

                    if (chosenWord.contains(guess1)) {
                        System.out.println(showLettersGussed(guess, hiddenWord, chosenWord));
                    } else {
                        System.out.println("You have guessed wrong!");
                        System.out.println(displayHangman(0 + 1));
                        tries++;
                    }

                }while(!hiddenWord.contains("-") && tries<=15 );
               if (guess3.contains("-")){
                System.out.println("You, "+ player2+ ", loses and "+ player1+ " wins!");
                player1points +=1;
                 }
                else{
                System.out.println(player2+ " Wins, while "+ player1+" loses.");
                player2points +=1;

                 }
                 System.out.println(player1+ "'s points are "+ player1points+ " and "+ player2+ "'s points are "+ player2points);
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
                          "|              0|\n"+
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
                          "|              1|\n"+
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
                          "|              2|\n"+
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
                          "|              3|\n"+
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
                          "|              4|\n"+
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
                          "|              5|\n"+
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
                          "|              6|\n"+
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
                          "|              7|\n"+
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
                          "|              8|\n"+
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
                          "|              9|\n"+
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
                          "|             10|\n"+
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
                          "|             11|\n"+
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
                          "|             12|\n"+
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
                          "|             13|\n"+
                          "+---------------+\n";
                break;
            case 14:
                display = "+---------------+\n"+
                          "|       |       |\n"+
                          "|       O       |\n"+
                          "|    \\_/|\\_    |\n"+
                          "|       |       |\n"+
                          "|      / \\      |\n"+
                          "|    _/   \\_    |\n"+
                          "|             14|\n"+
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
                          "|             15|\n"+
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
    public static String[] breakdownphrase(String chosenWord){
        String[] breakdownphrase = chosenWord.split(" ");
        return breakdownphrase;
    }
    private static String setHiddenWord(String chosenWord){
        return chosenWord.replaceAll("\\S", "-");
    }
    private static String showLettersGussed(char guess, String hiddenWord, String chosenWord) {
        char[] cChosen = chosenWord.toCharArray();
        char[] cHidden = hiddenWord.toCharArray();
        for (int i = 0; i < cHidden.length; i++) {
           if(cChosen[i] == guess) {
               cHidden[i] = cChosen[i];
           }
            hiddenWord = new String(cHidden);
        }
        return hiddenWord;

    }


    }










