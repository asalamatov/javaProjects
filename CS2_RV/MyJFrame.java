package CS2_RV;

import java.util.Scanner;

// import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame{
    RV panel;

    public String input(){
        System.out.println("Input the color of the RV's body\n>>");
        Scanner scan = new Scanner(System.in);
        String userColor = scan.next();
        scan.close();
        return (userColor!=null) ? userColor : "black";
    }

  MyJFrame(){
    panel = new RV(input(),60,60);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(panel);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    System.out.println(panel.toString());
  }
}