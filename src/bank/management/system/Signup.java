package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4, oth;

    JTextField textName, textFName, textEmail, textMs, textAdd, textDist, textPin, textState;
    JDateChooser dateChooser;

    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+1000L;

    String first = " " + Math.abs(first4);


    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160, 20, 600, 40 );
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Raleway" , Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Fathers's Name: ");
        labelfName.setFont(new Font("Raleway" , Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        add(textFName);


        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Raleway" , Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender: ");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup btn = new ButtonGroup();
        btn.add(r1);
        btn.add(r2);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marrital Status: ");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

//        textMs = new JTextField();
//        textMs.setFont(new Font("Raleway", Font.BOLD, 14));
//        textMs.setBounds(300, 440, 400, 30);
//        add(textMs);
        r3 = new JRadioButton("Married");
        r3.setBackground(new Color(222, 255, 228));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(300, 440, 150, 30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBackground(new Color(222, 255, 228));
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(450, 440, 150, 30);
        add(r4);

        oth = new JRadioButton("Others");
        oth.setBackground(new Color(222, 255, 228));
        oth.setFont(new Font("Raleway", Font.BOLD, 14));
        oth.setBounds(635, 440, 150, 30);
        add(oth);

        ButtonGroup btn2 = new ButtonGroup();
        btn2.add(r3);
        btn2.add(r4);
        btn2.add(oth);

        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelDist = new JLabel("District: ");
        labelDist.setFont(new Font("Raleway", Font.BOLD, 20));
        labelDist.setBounds(100, 540, 200, 30);
        add(labelDist);

        textDist = new JTextField();
        textDist.setFont(new Font("Raleway", Font.BOLD, 14));
        textDist.setBounds(300, 540, 400, 30);
        add(textDist);


        JLabel labelPin = new JLabel("Pin Code: ");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State: ");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);






        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {

            gender = "Female";

        }
        String email = textEmail.getText();
        String marital = null;
        if(r3.isSelected()){
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";

        } else if (oth.isSelected()) {
            marital = "Others";
        }

        String address = textAdd.getText();
        String dist = textDist.getText();
        String pin = textPin.getText();
        String state = textState.getText();

        try{

            if(textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Your Name");
            } else if (textFName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Your Father's");

            }  else if (textEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill your Email");

            } else if (textAdd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill your Add");

            } else if (textDist.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the District");

            } else if (textPin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Pin is Required");

            } else if (textState.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "State is Required");

           }
//            else if (textName.getText().equals("")) {
//                JOptionPane.showMessageDialog(null, "Fill all the fields");
//
//            } else if (textName.getText().equals("")) {
//                JOptionPane.showMessageDialog(null, "Fill all the fields");
//
//            }
            else{
                    Con con1 = new Con();
                    String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+dist+"','"+pin+"','"+state+"')";
                    con1.statement.executeUpdate(q);
                    new Signup2(formno);
                    setVisible(false);
                }


        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
