import java.awt.event.MouseEvent;


public class MouseListenerThing implements java.awt.event.MouseListener {
    int mouseClickX;
    int mouseClickY;
    boolean clicked;
    @Override
    public void mouseClicked(MouseEvent e) {
        clicked = true;
        mouseClickX = e.getX();
        mouseClickY = e.getY();
        //System.out.println(mouseClickX+ " " +mouseClickY);
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
}

