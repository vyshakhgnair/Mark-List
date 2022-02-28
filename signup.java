
//import javax.swing.event.AncestorListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class signup extends JFrame implements ActionListener {

    db_connect datab = new db_connect();
    JTextField name = new JTextField(15);
    JTextField regno = new JTextField(15);
    JPasswordField password = new JPasswordField(15);

    JTextField mark1 = new JTextField(15);
    JTextField mark2 = new JTextField(15);
    JTextField mark3 = new JTextField(15);
    JTextField mark4 = new JTextField(15);
    JTextField mark5 = new JTextField(15);

    JLabel mark_1 = new JLabel("Mark 1: ");
    JLabel mark_2 = new JLabel("Mark 2: ");
    JLabel mark_3 = new JLabel("Mark 3: ");
    JLabel mark_4 = new JLabel("Mark 4: ");
    JLabel mark_5 = new JLabel("Mark 5: ");
    JLabel nameLabel = new JLabel("Name: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel regnoLabel = new JLabel("Register Number: ");

    JButton submit = new JButton("Upload");

    public signup() {

        add(nameLabel);
        add(name);
        add(passwordLabel);
        add(password);
        add(regnoLabel);
        add(regno);
        add(mark_1);
        add(mark1);
        add(mark_2);
        add(mark2);
        add(mark_3);
        add(mark3);
        add(mark_4);
        add(mark4);
        add(mark_5);
        add(mark5);

        add(submit);

        submit.addActionListener(this);

        setSize(400, 300);
        setTitle("Upload Details");
        setLayout(new GridLayout(9, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String getRegno, getName, getPass, sub1, sub2, sub3, sub4, sub5;
        boolean check;

        getRegno = regno.getText();

        getName = name.getText();

        getPass = password.getText();

        sub1 = mark1.getText();
        sub2 = mark2.getText();
        sub3 = mark3.getText();
        sub4 = mark4.getText();
        sub5 = mark5.getText();

        if (ae.getSource() == submit) {

            check = datab.addIntoTable(getRegno, getName, getPass, sub1, sub2, sub3, sub4, sub5); // sends value to
                                                                                                  // addIntoTable()
                                                                                                  // method in
                                                                                                  // db_connect.java

            if (check == false) {

                regno.setText("Register Number already exists");
            }

        }

    }

    public static void main(String[] args) {
        signup s = new signup();

    }
}