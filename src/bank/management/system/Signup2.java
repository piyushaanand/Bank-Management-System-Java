package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4,comboBox5;
    JTextField textPan, textAd;
    JRadioButton r1, r2, r3, r4;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :- ");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(253, 183, 78));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);
        String category[] = {"General", "OBC", "SC", "ST"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(253, 183, 78));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Salary : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);
        String salary[] = {"Null", "<2,50,000", "<5,00,000", "upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(salary);
        comboBox3.setBackground(new Color(253, 183, 78));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);
        String edu[] = {"Uneducated", "Upto 10", "Upto 12", "Graduated", "Post Graduated", "PHD", "Other"};
        comboBox4 = new JComboBox(edu);
        comboBox4.setBackground(new Color(253, 183, 78));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);
        String occupation[] = {"Farmer", "Self-Employed", "BuisnessMan", "Doctor", "Engineer", "Entrepreneur", "Govt. Servent", "Jury or lawn related","Army", "Retired"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(253, 183, 78));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No. : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);
        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar No. : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);
        textAd = new JTextField();
        textAd.setFont(new Font("Raleway", Font.BOLD, 18));
        textAd.setBounds(350, 440, 320, 30);
        add(textAd);

        JLabel l10 = new JLabel("Senior Cityzen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 490, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 490, 100, 30);
        add(r2);

        ButtonGroup btn = new ButtonGroup();
        btn.add(r1);
        btn.add(r2);


        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(252, 208, 76));
        r3.setBounds(350, 540, 100, 30);
        add(r3);
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(252, 208, 76));
        r4.setBounds(460, 540, 100, 30);
        add(r4);

        ButtonGroup btn2 = new ButtonGroup();
        btn2.add(r3);
        btn2.add(r4);

        JLabel l12 = new JLabel("Form No. : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 180, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String sal = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String ocu = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String adhar = textAd.getText();

        String scitizen = " ";
        if((r1.isSelected())){
            scitizen = "Yes";
        }else if((r2.isSelected())){
            scitizen = "No";
        }

        String eAccount = " ";
        if((r3.isSelected())){
             eAccount = "Yes";
        }else if((r4.isSelected())){
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAd.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill PAN and AADHAR is must");
            }else{
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+sal+"','"+edu+"','"+ocu+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Signup2("");
    }
}
