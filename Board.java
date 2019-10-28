import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Board extends JComponent{
    boolean[] bits = new boolean[8];
    int decimal = 0;


    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font myFont = new Font("Comic Sans", Font.BOLD, 40);
        g2.setFont(myFont);
        g2.drawString("Binary to decimal Converter", 15, 50);
        g2.drawString(Integer.toString(decimal), 17, 130);
        Font myFont2 = new Font("Comic Sans", Font.BOLD, 25);
        g2.setFont(myFont2);
        g2.drawString(Integer.toString(128), 8,275);
        g2.drawString(Integer.toString(64), 90,275);
        g2.drawString(Integer.toString(32), 166,275);
        g2.drawString(Integer.toString(16), 240,275);
        g2.drawString(Integer.toString(8), 324,275);
        g2.drawString(Integer.toString(4), 398,275);
        g2.drawString(Integer.toString(2), 476,275);
        g2.drawString(Integer.toString(1), 550,275);
        for(int i=1; i<9; i++){
            if(bits[i-1] == false) {
                drawElipse(g2, ((i * 75) - 70), false);
            }
            else{
                drawElipse(g2, ((i * 75) - 70), true);
            }
        }
    }
    public void drawElipse(Graphics2D g2, int x, boolean onOrOff){
        Ellipse2D.Double testEllipse = new Ellipse2D.Double(x,200,50, 50);
        if(onOrOff == false) {
            g2.setColor(Color.black);
        }
        else{
            g2.setColor(Color.white);
        }
        g2.fill(testEllipse);
        g2.draw(testEllipse);
    }

    public void changeCircle(int x, int y)throws InterruptedException{
        int h = 0;
        int k = 225;
        //System.out.println(x);
        //System.out.println(y);
        for(int i=1; i<9; i++){
            h = ((i * 75) - 70) + 25;
            if(((x - h)*(x - h)) + ((y - k)*(y - k)) <= 625){
                Thread.sleep(15);
                //System.out.println("if run");
                bits[i-1] = !bits[i-1];
                break;
            }
        }
        //System.out.println(h+" "+k);
    }
}