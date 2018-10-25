import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard;

        String chosenWord;
        String player1;
        String player2;
        String again;


        keyboard = new Scanner(System.in);
        do {
            again = "";
            System.out.println("Hello welcome to the game where you Hang A Man or maybe not.");
            System.out.println("Pretty much one person chooses a word and the other person has to guess the word.");
            System.out.println("Who is the person choosing the word name?");
            player1 = keyboard.nextLine();
            System.out.println("And who is the person guessing name?");
            player2 = keyboard.nextLine();
            System.out.println("Well, "+ player1+" what word/words would you like to choose?");
            chosenWord=keyboard.nextLine();
            System.out.println("Ok,"+ player2+" start by guessing a letter.");















            System.out.println("Would you like to play again?");
            again = keyboard.next() .toLowerCase();
        }while(again.equals("yes"));

    }
}