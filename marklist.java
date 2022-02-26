import  java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class Mark extends JFrame 
{
    JButton login,signup;
    Container c;
    JLabel head;

    
    Mark()
    {
        super("MARK LIST");
        login=new JButton("Login");
        signup=new JButton("Signup");
        head=new JLabel ("MARK-LIST");
        Border border = BorderFactory.createLineBorder(Color.decode("#422BB4"));


        head.setForeground(Color.WHITE);
        head.setFont(new Font("Arial", Font.BOLD,50));
        login.setBackground(Color.decode("#422BB4"));
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Arial",Font.PLAIN,20));
        login.setBorder(border);
        signup.setBackground(Color.decode("#422BB4"));
        signup.setForeground(Color.WHITE);
        signup.setFont(new Font("Arial",Font.PLAIN,20));
        signup.setBorder(border);
        
        c=getContentPane();
        add(login);
        add(signup);
        add(head);

        
        login.setBounds(50, 350, 150, 50);
        signup.setBounds(400, 350, 150, 50);
        head.setBounds(150,40,600,200);
        

        c.setBackground(Color.decode("#422B84"));
        

        setSize(600,600);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

public class marklist
{
    public static void main(String[] args)
    {
        Mark m=new Mark();
    }
}