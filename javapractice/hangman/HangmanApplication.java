package hangman;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    


    public static void main(String[] args) throws IOException{
        try (//how do we play the game
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to hangman! I will pick a word and you will try to geyss it \ncharacter by character"
            + ". \nIf you guess wrong 6 times, then I win. \nIf you can guess it before them, you win. "
            + "\nAre you ready? I hope so because I am.");
            System.out.println();
            System.out.println("I have picked my word. Below is a picture, and below "
            + "\nthat is your current guess, which starts off as nothing. Every time you "
            + "\nguess incorrectly. I add a body part to the picture. When there is a full"
            + " \nperson, you lose");

            //allows for multiple games
            boolean doYouWantToPlay = true;
            while(doYouWantToPlay){
                //setting up the game
                System.out.println("Alright! Let's play.");
                Hangman game = new Hangman();

                do{
                    System.out.println();
                    System.out.println(game.drawPicture());
                    System.out.println();
                    System.out.println(game.getFormalCurrentGuess());
                    System.out.println(game.mysteryWord);

                }while (!game.gameOver());

                System.out.println();
                System.out.println("Do you want to play another game? Enter Y if you do.");
                Character response = (sc.next().toUpperCase()).charAt(0);
                doYouWantToPlay = (response=='Y');
            }
        }
    }
}
