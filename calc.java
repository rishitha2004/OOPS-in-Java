import java.awt.*;
import java.awt.event.*;
import java.lang.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class calc extends JFrame{
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton zero;
    Container c;
    public calc(){
        c = getContentPane();
        c.setLayout(null);
        one=new JButton("1");
        one.setBounds(60,260,100,30);
        c.add(one);
        two=new JButton("2");
        one.setBounds(160,260,100,30);
        c.add(two);
    }
    public static void main(String[] args) {
        calc frame = new calc();
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setBounds(500, 100, 600, 700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
    }
}
