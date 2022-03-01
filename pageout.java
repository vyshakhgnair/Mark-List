
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class page_out extends JFrame {
    JLabel nm, m1, m2, m3, m4, m5;
    JLabel reg;
    JTextField nm1,regt, mt1, mt2, mt3, mt4, mt5;
    JButton srch,back;
    Container c;

    page_out() {
        super("STUDENT REGISTRATION");
        nm = new JLabel("NAME");
        m1 = new JLabel("MARK 1");
        m2 = new JLabel("MARK 2");
        m3 = new JLabel("MARK 3");
        m4 = new JLabel("MARK 4");
        m5 = new JLabel("MARK 5");
        reg = new JLabel("REG NUM");
        srch = new JButton("SEARCH");
        back = new JButton("BACK");
        nm1=new JTextField();
        mt1 = new JTextField();
        mt2 = new JTextField();
        mt3 = new JTextField();
        mt4 = new JTextField();
        mt5 = new JTextField();
        regt = new JTextField();
        c = getContentPane();
        add(nm);
        add(m1);
        add(m2);
        add(m3);
        add(m4);
        add(m5);
        add(nm1);
        add(regt);
        add(back);
        add(mt1);
        add(mt2);
        add(mt3);
        add(mt4);
        add(mt5);
        add(srch);
        add(reg);

        c.setBackground(Color.decode("#422B84"));
        
        nm.setBounds(80, 90, 100, 30);
        nm.setFont(new Font("Arial", Font.BOLD,20));
        nm.setForeground(Color.WHITE);

        reg.setBounds(80, 150, 130, 30);
        reg.setFont(new Font("Arial", Font.BOLD,20));
        reg.setForeground(Color.WHITE);

        m1.setBounds(80, 210, 100, 30);
        m1.setFont(new Font("Arial", Font.BOLD,20));
        m1.setForeground(Color.WHITE);

        m2.setBounds(80, 270, 100, 30);
        m2.setFont(new Font("Arial", Font.BOLD,20));
        m2.setForeground(Color.WHITE);

        m3.setBounds(80,330,100,30);
        m3.setFont(new Font("Arial", Font.BOLD,20));
        m3.setForeground(Color.WHITE);

        m4.setBounds(80,390,100,30);
        m4.setFont(new Font("Arial", Font.BOLD,20));
        m4.setForeground(Color.WHITE);
        
        m5.setBounds(80,450,100,30);
        m5.setFont(new Font("Arial", Font.BOLD,20));
        m5.setForeground(Color.WHITE);
        

        srch.setFont(new Font("Arial", Font.BOLD,20));
        srch.setForeground(Color.decode("#422BB4"));

        back.setBounds(295,510,130,40);
        back.setFont(new Font("Arial", Font.BOLD,20));
        back.setForeground(Color.decode("#422BB4"));

        nm1.setBounds(220,90,280,30);
        regt.setBounds(220,150,130,30);
        srch.setBounds(350,150,150,30);
        mt1.setBounds(220,210,280,30);
        mt2.setBounds(220,270,280,30);
        mt3.setBounds(220,330,280,30);
        mt4.setBounds(220,390,280,30);
        mt5.setBounds(220,450,280,30);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

