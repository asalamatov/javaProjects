package CS2_RV;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RVTest extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        RV rv = new RV(Color.RED, 50, 50);
        rv.show(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new RVTest());
        frame.setSize(200, 200);
        frame.setVisible(true);
        RV rv1 = new RV(Color.RED, 50, 50);
        RV rv2 = new RV(Color.BLUE, 100, 100);
        System.out.println(rv1);
        System.out.println(rv2);
        // output the RVs to the game board
        // ...
        rv1.input(Color.GREEN, 200, 200);
        rv2.input(Color.YELLOW, 300, 300);
        System.out.println(rv1);
        System.out.println(rv2);
        // output the updated RVs to the game board
        // ...
    }
}

// import java.awt.Color;

// public class RVTest {
//     public static void main(String[] args) {
//         RV rv1 = new RV(Color.RED, 50, 50);
//         RV rv2 = new RV(Color.BLUE, 100, 100);
//         System.out.println(rv1);
//         System.out.println(rv2);
//         // output the RVs to the game board
//         // ...
//         rv1.input(Color.GREEN, 200, 200);
//         rv2.input(Color.YELLOW, 300, 300);
//         System.out.println(rv1);
//         System.out.println(rv2);
//         // output the updated RVs to the game board
//         // ...
//     }
// }


// import java.awt.Color;
// import java.awt.Graphics;
// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class RVTest extends JPanel{
//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // create a new RV object with red color and (50, 50) location
//         RV rv = new RV(Color.RED, 50, 50);
//         // draw the RV object on the screen using its show method
//         rv.show(g);
//     }

//     public static void main(String[] args) {
//         // create a new window to display the RV objects
//         JFrame frame = new JFrame();
//         // add the RVTest panel to the window
//         frame.add(new RVTest());
//         // set the size of the window
//         frame.setSize(200, 200);
//         // make the window visible
//         frame.setVisible(true);

//         // create two RV objects with different colors and locations
//         RV rv1 = new RV(Color.RED, 50, 50);
//         RV rv2 = new RV(Color.BLUE, 100, 100);
//         // output the RV objects to the console using the toString method
//         System.out.println(rv1);
//         System.out.println(rv2);
//         // output the RV objects to the game board using their show method
//         rv1.show(getGraphics());
//         rv2.show(getGraphics());

//         // update the color and location of the RV objects
//         rv1.input(Color.GREEN, 200, 200);
//         rv2.input(Color.YELLOW, 300, 300);
//         // output the updated RV objects to the console using the toString method
//         System.out.println(rv1);
//         System.out.println(rv2);
//         // output the updated RV objects to the game board using their show method
//         rv1.show(getGraphics());
//         rv2.show(getGraphics());
//     }
// }

// import java.awt.Color;
// import java.awt.Graphics;
// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class RVTest extends JPanel {
//     private RV rv1;
//     private RV rv2;

//     public RVTest() {
//         // create two RV objects with different colors and locations
//         rv1 = new RV(Color.RED, 50, 50);
//         rv2 = new RV(Color.BLUE, 100, 100);
//     }

//     public void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         // draw the RV objects on the screen using their show method
//         rv1.show(g);
//         rv2.show(g);
//     }

//     public static void main(String[] args) {
//         // create a new window to display the RV objects
//         JFrame frame = new JFrame();
//         // add the RVTest panel to the window
//         frame.add(new RVTest());
//         // set the size of the window
//         frame.setSize(200, 200);
//         // make the window visible
//         frame.setVisible(true);

//         // update the color and location of the RV objects
//         rv1.input(Color.GREEN, 200, 200);
//         rv2.input(Color.YELLOW, 300, 300);
//         // repaint the panel to update the screen
//         frame.repaint();
//     }
// }
