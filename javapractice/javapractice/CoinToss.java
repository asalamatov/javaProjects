package javapractice;
import java.util.Random;

public class CoinToss {
    
    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt())%2;
        if (toss==0){return "HEADS";}
        else{return "TAILS";}
    }
    
    public static void main(String[] args){
        CoinToss try1 = new CoinToss();
        System.out.println(try1.tossACoin());
        System.out.println(try1.tossACoin());
        System.out.println(try1.tossACoin());
        System.out.println(try1.tossACoin());
        System.out.println(try1.tossACoin());
        
    }
}
