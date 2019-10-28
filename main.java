import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class main {
    public static void main(String []args) throws InterruptedException {
        Board board  = new Board();
        JFrame frame = new JFrame();
        BinConverter converter = new BinConverter();
        MouseListenerThing listener = new MouseListenerThing();
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.gray);
        frame.add(board);
        //frame.add(listener.board);
        frame.setVisible(true);
        board.addMouseListener(listener);
        while(true){
            if(listener.clicked == true) {
                Thread.sleep(15);
                //System.out.println("circle changer triggered");
                board.changeCircle(listener.mouseClickX, listener.mouseClickY);
                listener.clicked = false;
                //for(int i=0; i<8; i++){
                //    System.out.print(board.bits[i]+ " ");
                //}
                //System.out.println();
                board.decimal = converter.toBinary(board.bits);
            }
            frame.repaint();
        }
    }
}
