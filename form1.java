import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class form1 extends JFrame {
    JLabel name;
    JTextField nfield;
    JLabel rollno;
    JTextField rfield;
    JLabel course;
    JRadioButton cse,ece,eee,mech,civ;
    ButtonGroup coursegrp;
    JLabel college;
    JComboBox<String>collegelist;
    JLabel section;
    JTextField tsection;
    JLabel Fee;
    JTextField tfee;
    JLabel date;
    JButton sub;
    Container c;
    public form1(){
        name=new JLabel("Name");
        nfield=new JTextField();
        rollno=new JLabel("Roll No");
        rfield=new JTextField();
        course=new JLabel("Course");
        cse=new JRadioButton("CSE");
        ece=new JRadioButton("ECE");
        eee=new JRadioButton("EEE");
        mech=new JRadioButton("MECH");
        civ=new JRadioButton("CIV");
        coursegrp=new ButtonGroup();
        coursegrp.add(cse);
        coursegrp.add(ece);
        coursegrp.add(eee);
        coursegrp.add(mech);
        coursegrp.add(civ);
        college=new JLabel("College");
        collegelist=new JComboBox<String>();
        collegelist.addItem("NIT AP");
        collegelist.addItem("VASAVI");
        collegelist.addItem("SASI");
        collegelist.addItem("VISHNU");
        section=new JLabel("Section");
        tsection=new JTextField();
        Fee=new JLabel("Fee");
        tfee=new JTextField();
        sub=new JButton("Submit");
        c=getContentPane();
        c.setLayout(null);
        setBounds();
        addComponents();
    }

    public void setBounds(){
        name.setBounds(50, 60, 100, 30);
        nfield.setBounds(130, 60, 200, 30);
        rollno.setBounds(50, 110, 100, 30);
        rfield.setBounds(130, 110, 200, 30);
        course.setBounds(50, 160, 100, 30);
        cse.setBounds(130, 160, 100, 30);
        ece.setBounds(130, 180, 100, 30);
        eee.setBounds(130, 200, 100, 30);
        mech.setBounds(130, 220, 100, 30);
        civ.setBounds(130, 240, 100, 30);
        college.setBounds(50, 290, 100, 30);
        collegelist.setBounds(130,290,100,30);
        section.setBounds(50, 340, 100, 30);
        tsection.setBounds(130, 340, 100, 30);
        Fee.setBounds(50, 390, 100, 30);
        tfee.setBounds(130, 390, 100, 30);
        sub.setBounds(50, 440, 200, 40);
    }

    public void addComponents(){
        c.add(name);
        c.add(nfield);
        c.add(rollno);
        c.add(rfield);
        c.add(course);
        c.add(cse);
        c.add(ece);
        c.add(eee);
        c.add(mech);
        c.add(civ);
        c.add(college);
        c.add(collegelist);
        c.add(section);
        c.add(tsection);
        c.add(Fee);
        c.add(tfee);
        c.add(sub);
    }
    public static void main(String[] args){
        form1 frame=new form1();
        frame.setTitle("Registration Form");
        frame.setVisible(true);
        frame.setBounds(500,100,600,700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(true);
    }
}
