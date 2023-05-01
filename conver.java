import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class conver extends JFrame {
    JLabel usd;
    JTextField tusd;
    JLabel rupee;
    JTextField trupee;
    JButton convert;
    Container c;

    public conver() {
        usd = new JLabel("USD");
        tusd = new JTextField();
        rupee = new JLabel("Rupee");
        trupee = new JTextField();
        convert = new JButton("Convert");
        c = getContentPane();
        c.setLayout(null);
        usd.setBounds(60, 60, 100, 30);
        tusd.setBounds(50, 90, 100, 30);
        rupee.setBounds(350, 60, 100, 30);
        trupee.setBounds(350, 90, 100, 30);
        convert.setBounds(200, 160, 100, 30);
        c.add(usd);
        c.add(tusd);
        c.add(rupee);
        c.add(trupee);
        c.add(convert);
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double d = Double.parseDouble(tusd.getText());
                double d1 = d * 82.08;
                String s = String.valueOf(d1);
                trupee.setText(s);
            }
        });
    }

    public static void main(String[] args) {
        conver frame = new conver();
        frame.setTitle("Currency Converter");
        frame.setVisible(true);
        frame.setBounds(500, 100, 600, 700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
    }
}
