package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class login extends JFrame {
    private static final LayoutManager GroupLayout = null;
    JLabel uname, pass ,head;
    JLabel reg;
    JTextField uname1,passwd;
    JButton submit,reset;
    Container c;

 login() {
        super(" LOGIN ");
        uname = new JLabel("USERNAME");
        pass = new JLabel("PASSWORD");
        submit = new JButton("SUBMIT");
        reset = new JButton("RESET");
        uname1=new JTextField();
        passwd = new JTextField();
        head=new JLabel ("MARK-LIST");
        c = getContentPane();
        add(head);
        add(uname);
        add(pass);
        add(uname1);
        add(passwd);
        add(reset);
        add(submit);

        c.setBackground(Color.decode("#422B84"));


        head.setForeground(Color.WHITE);
        head.setBounds(100,30,600,40);
        head.setFont(new Font("Arial", Font.BOLD,50));
        
        uname.setBounds(80, 170, 150, 30);
        uname.setFont(new Font("Arial", Font.BOLD,20));
        uname.setForeground(Color.WHITE);

        pass.setBounds(80, 290, 150, 30);
        pass.setFont(new Font("Arial", Font.BOLD,20));
        pass.setForeground(Color.WHITE);


        submit.setBounds(100,410,130,40);
        submit.setFont(new Font("Arial", Font.BOLD,20));
        submit.setForeground(Color.decode("#422BB4"));

        reset.setBounds(295,410,130,40);
        reset.setFont(new Font("Arial", Font.BOLD,20));
        reset.setForeground(Color.decode("#422BB4"));

        uname1.setBounds(220,170,280,30);
        passwd.setBounds(220,290,280,30);
        setSize(600, 600);
        setLayout(GroupLayout);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
    
                                          

        uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname1ActionPerformed(evt);
            }
        });

        passwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdActionPerformed(evt);
            }
        });

        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        

}

private void submitActionPerformed(ActionEvent evt) {
    try {
        String ab=uname1.getText();
        String pa=passwd.getText();
        if(ab.equals("")) {
            JOptionPane.showMessageDialog(uname, "PLEASE ENTER USERNAME ");
        }
        else if (pa.equals("")) {
            JOptionPane.showMessageDialog(pass, "PLEASE ENTER PASSWORD ");
        }
        else
        {
        if (ab.equals("admin")&&pa.equals("123")) {
            //JOptionPane.showMessageDialog(rootPane, "successful");
            new page_out().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane,"username and password invalid");
        }}
    } catch (Exception e) {
    }
}
private void resetActionPerformed(ActionEvent evt) {
    try {
        uname1.setText(null);
        passwd.setText(null);

    } catch (Exception e) {
    }
}

private void passwdActionPerformed(ActionEvent evt) {
}

private void uname1ActionPerformed(ActionEvent evt) {
}

public class setVisible {

    public setVisible(boolean b) {
    }
}
}