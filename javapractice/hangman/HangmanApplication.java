package hangman;

import java.util.Scanner;

public class HangmanApplication {
    


    public static void main(String[] args){
        //how do we play the game
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will try to geyss it character by character"
        + ". If you guess wrong 6 times, then I win. If you can guess it before them, you win. "
        + "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below "
        + "that is your current guess, which starts off as nothing. Every time you "
        + "guess incorrectly. I add a body part to the picture. When there is a full"
        + " person, you lose");

        //allows for multiple games
        boolean doYouWantToPlay = true;
        while(doYouWantToPlay){
            //setting up the game

            while (!game.gameOver()){
                //playing the game
            }
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response=='Y');
        }
    }
}
