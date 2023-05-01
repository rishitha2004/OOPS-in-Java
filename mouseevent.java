import java.awt.*;
import java.awt.event.*;

public class mouseevent extends Frame implements MouseListener,MouseMotionListener{
    String txt="";
    int x=0,y=0;
    public mouseevent(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindow());
    }
    public void mouseClicked(MouseEvent me){
        txt=txt+"-->click received";
        repaint();
    }
    public void mouseEntered(MouseEvent me){
        x=100;
        y=100;
        txt="Mouse entered";
        repaint();
    }
    public void mouseExited(MouseEvent me){
        x=100;
        y=100;
        txt="Mouse exited";
        repaint();
    }
    public void mousePressed(MouseEvent me){
        x=me.getX();
        y=me.getY();
        txt="Button down";
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        x=me.getX();
        y=me.getY();
        txt="Button up";
        repaint();
    }
    public void mouseDragged(MouseEvent me){
        x=me.getX();
        y=me.getY();
        txt="mouse at"+x+","+y;
        repaint();
    }
    public void mouseMoved(MouseEvent me){
        txt="Mouse at"+me.getX()+","+me.getY();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(txt,x,y);
    }
    public static void main(String[] args){
        mouseevent ris=new mouseevent();
        ris.setSize(new Dimension(300,300));
        ris.setTitle("MouseListener Demo");
        ris .setVisible(true);
    }
}
class MyWindow extends WindowAdapter{
    public void WindowClosing(WindowEvent we){
        System.exit(0);
    }
}