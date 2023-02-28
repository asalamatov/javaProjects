package CS2_RV_copy;

import java.util.Scanner;

public class Main{
    //Creating private varibles, data for the vehicles;
    private static String userColor1, userColor2;
    private static int x1, y1, x2, y2;
    

    /*
     * Asks the user to input the color preference and location of the vehicles
     */
    public static void input(){
        System.out.print("Input the color of the First RV's body\n>> ");
        Scanner scan = new Scanner(System.in);
        userColor1 = scan.next();
        System.out.print("Input the X-Position of the first vehicle\n>> ");
        x1 = scan.nextInt();
        System.out.print("Now, input the Y-Position of the first vehicle\n>> ");
        y1 = scan.nextInt();
        System.out.print("Input the color of the Second RV's body\n>> ");
        userColor2 = scan.next();
        System.out.print("Input the X-Position of the second vehicle\n>> ");
        x2 = scan.nextInt();
        System.out.print("Now, input the Y-Position of the second vehicle\n>> ");
        y2 = scan.nextInt();
        scan.close();
    }

    public static void main(String[] args) {
        input();

        /*
         * Creating 2 objects of RV Class
         */
        RV car1 = new RV(userColor1, x1, y1);
        RV car2 = new RV(userColor2, x2, y2);

        /*
         * Printing the color and location of the 2 vehicle objects
         */
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        /*
         * Displaying these 2 vehicles onto the frame/screen
         */
        car1.show();
        try{Thread.sleep(3000);}  //without this exception handling, the code throw an error;
        catch(Exception e) {}
        car2.show();

    }
  }
