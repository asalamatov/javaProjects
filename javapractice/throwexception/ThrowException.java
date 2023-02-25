package throwexception;

import java.util.concurrent.TimeUnit;

public class ThrowException {
    
    public static double tooHot= 185;
    public static double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooColdException, TooHotException {
        if (cocoaTemp >= tooHot){
            throw new TooHotException();
        }else if (cocoaTemp<=tooCold){
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException, TooColdException, TooColdException{
        double currentCocoaTemp = 200;
        boolean wrongTemp = true;
        while (wrongTemp){
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp=false;
            }catch(TooHotException e1){
                System.out.println("That cocoa is hot!");
                currentCocoaTemp-=5;
            }catch(TooColdException e2){
                System.out.println("That cocoa is too cold!");
                currentCocoaTemp+=5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone!");

    }

}
