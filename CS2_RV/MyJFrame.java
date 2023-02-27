package CS2_RV;

// import java.awt.*;
import javax.swing.*;

public class MyJFrame extends JFrame{
  RV panel;
  MyJFrame(){

    panel = new RV("yellow",60,60);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.add(panel);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    System.out.println(panel.toString());
  }
}