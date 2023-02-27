package CS2_RV;

import java.awt.*;
import javax.swing.*;

public class RV extends JPanel{
    private int x = 50;
    private int y = 50;
    private Color bodyColor;
    private Color color;
    Image image;
    
    public Color getColor(String col) {
        switch (col.toLowerCase()) {
        case "black":
            color = Color.BLACK;
            break;
        case "blue":
            color = Color.BLUE;
            break;
        case "cyan":
            color = Color.CYAN;
            break;
        case "darkgray":
            color = Color.DARK_GRAY;
            break;
        case "gray":
            color = Color.GRAY;
            break;
        case "green":
            color = Color.GREEN;
            break;
        case "yellow":
            color = Color.YELLOW;
            break;
        case "lightgray":
            color = Color.LIGHT_GRAY;
            break;
        case "magneta":
            color = Color.MAGENTA;
            break;
        case "orange":
            color = Color.ORANGE;
            break;
        case "pink":
            color = Color.PINK;
            break;
        case "red":
            color = Color.RED;
            break;
        case "white":
            color = Color.WHITE;
            break;
        default:
            color = Color.decode("#E8D2A6");
            }
        return color;
        }
  
    public RV(String bodyInputColor, int position_x, int position_y){
      bodyColor = this.getColor(bodyInputColor);
      x = position_x;
      y = position_y;
      
      this.setPreferredSize(new Dimension(500,500));
    }

    public RV(){
      this.setPreferredSize(new Dimension(500,500));
    }

    public String toString(){
      return ("The color of the RV is " + bodyColor + "\nThe x and y-positions are : (" + x + "," + y+").");
    }
  
    public void paint(Graphics g){
      Graphics2D g2D = (Graphics2D) g;

      // g2D.drawImage(image,0,0,null);
      // private Color bodyColor;
      // bodyColor = decode("#E8D2A6");
      //////////////////////////////g2D.setPaint(Color.decode("#E8D2A6"));
      g2D.setPaint(bodyColor);
      //outline thickness 5 px
      g2D.setStroke(new BasicStroke(5));
      //drawing a body of the car
      g2D.fillRect(x,y,150,90);
      //drawing the nose of the car
      g2D.fillRect(x+150,y+60,50, 30);
      //drawing the door with different pink
      g2D.setColor(Color.decode("#F48484"));       
      g2D.fillRect(x+110, y+20, 25, 50);
      //drawing the outline of the door with grey
      g2D.setColor(Color.decode("#86A3B8"));
      g2D.drawRect(x+110,y+20,25, 50);
      //drawing the windows of the car with grey
      g2D.fillRect(x+15, y+15, 30,30);
      g2D.fillRect(x+60, y+15, 30, 30);
      //drawing the tires
      g2D.setColor(Color.black);
      g2D.fillOval(x+30, y+85, 30,30);
      g2D.fillOval(x+140, y+85, 30,30);
      
  }
}