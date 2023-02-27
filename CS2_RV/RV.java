package CS2_RV;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RV extends JPanel {

    private String bodyColor;
    private int x;
    private int y;

    public RV(String color, int x, int y) {
        this.bodyColor = color;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "RV [bodyColor=" + bodyColor + ", x=" + x + ", y=" + y + "]";
    }

    public void show() {
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public void input() {
        // create Scanner object to read input from user
        // set the value of bodyColor, x, and y based on user input
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode(bodyColor));
        g.fillRect(x, y, 100, 50);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 100, 50);
        g.drawOval(x+10, y+40, 20, 20);
        g.drawOval(x+70, y+40, 20, 20);
        g.fillRect(x+80, y+10, 10, 20);
    }

    public static void main(String[] args) {
        // create two RV instances with specified color and location
        RV rv1 = new RV("0xffa500", 50, 50);
        RV rv2 = new RV("0x00ff00", 100, 100);
    
        // output the initial state of the RV instances
        System.out.println("Initial state:");
        System.out.println(rv1.toString());
        System.out.println(rv2.toString());
        rv1.show();
        rv2.show();
    
        // prompt the user to input a new color and location for each RV
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new color for RV1: ");
        String newColor1 = scanner.nextLine();
        System.out.print("Enter new x-coordinate for RV1: ");
        int newX1 = scanner.nextInt();
        System.out.print("Enter new y-coordinate for RV1: ");
        int newY1 = scanner.nextInt();
    }
}
