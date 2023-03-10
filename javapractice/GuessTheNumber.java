
import java.util.*;

public class GuessTheNumber{

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max +1);
    }

    public void play() {
        while (true){
            int move = scanner.nextInt();
            if (move > theNumber){
                System.out.println("Too high.");
            }else if (move < theNumber){
                System.out.println("Too low.");
            }else if (move == theNumber){
                System.out.println("Correct.");
                break;
            }
        }
    }
    
    public static void howBigIsMyNumber(int x) {
        if (x>0 && x<=10){
            System.out.println("The number is pretty small.");
        }else if (x>10 && x<100){
            System.out.println("The number is pretty big.");
        }else{
            System.out.println("The number is out of range.");
        }
    }

    public static void main(String[] args){
        GuessTheNumber game1 = new GuessTheNumber();
        System.out.println("Welcome to my game. Try and guess my impossible"
        + " number. It's between 0 and " + game1.max + " inclusive." 
    + " Just type a number to get started.");
        game1.play();
    }
}