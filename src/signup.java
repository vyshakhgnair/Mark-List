package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class signup extends JFrame {
    private static final LayoutManager GroupLayout = null;
    JLabel name,uname, pass ,head;
    JLabel reg;
    JTextField uname1,passwd,name1;
    JButton submit,reset;
    Container c;

 signup() {
        super(" SIGNUP ");
        name = new JLabel("NAME");
        uname = new JLabel("USERNAME");
        pass = new JLabel("PASSWORD");
        submit = new JButton("SUBMIT");
        reset = new JButton("RESET");
        uname1=new JTextField();
        name1=new JTextField();
        passwd = new JTextField();
        head=new JLabel ("MARK-LIST");
        c = getContentPane();
        add(head);

        add(name);
        add(uname);
        add(pass);
        add(name1);
        add(uname1);
        add(passwd);
        add(reset);
        add(submit);

        c.setBackground(Color.decode("#422B84"));


        head.setForeground(Color.WHITE);
        head.setBounds(100,30,600,40);
        head.setFont(new Font("Arial", Font.BOLD,50));
        
        name.setBounds(80, 170, 150, 30);
        name.setFont(new Font("Arial", Font.BOLD,20));
        name.setForeground(Color.WHITE);

        uname.setBounds(80, 230, 150, 30);
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

        name1.setBounds(220,170,280,30);
        uname1.setBounds(220,230,280,30);
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
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
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
        String nm=name1.getText();
        if(ab.equals("")) {
            JOptionPane.showMessageDialog(uname, "PLEASE ENTER USERNAME ");
        }
        else if (pa.equals("")) {
            JOptionPane.showMessageDialog(pass, "PLEASE ENTER PASSWORD ");
        }
        else if (nm.equals("")) {
            JOptionPane.showMessageDialog(pass, "PLEASE ENTER NAME ");
        }
        else
        {
        
            JOptionPane.showMessageDialog(rootPane,"SAVED INFO");
            new login().setVisible(true);

        }
    } catch (Exception e) {
    }
}
private void resetActionPerformed(ActionEvent evt) {
    try {
        uname1.setText(null);
        passwd.setText(null);
        name1.setText(null);

    } catch (Exception e) {
    }
}

private void passwdActionPerformed(ActionEvent evt) {
}

private void uname1ActionPerformed(ActionEvent evt) {
}
private void name1ActionPerformed(ActionEvent evt) {
}

public class setVisible {

    public setVisible(boolean b) {
    }
}
}