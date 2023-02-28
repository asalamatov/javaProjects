package CS2_RV;

import java.util.Scanner;

// import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame{
    RV panel;
    int x;
    int y;
    String userColor;

    public String input(){
        System.out.print("Input the color of the RV's body\n>> ");
        Scanner scan = new Scanner(System.in);
        userColor = scan.next();
        System.out.print("Input the X-Position of the vehicle\n>> ");
        x = scan.nextInt();
        System.out.print("Now, input the Y-Position of the vehicle\n>> ");
        y = scan.nextInt();
        scan.close();
        return userColor;
    }

  MyJFrame(){
    panel = new RV(input(),x,y);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(panel);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    System.out.println(panel.toString());
  }
}