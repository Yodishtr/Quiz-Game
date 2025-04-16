import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A class representing the user logging into the Quiz game using their name.
 */
public class Login extends JFrame implements ActionListener{
    JButton rules, back;
    JTextField username;

    public Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon spongebob_image = new ImageIcon(ClassLoader.getSystemResource("icons/spongebob_test.jpeg"));
        JLabel spongebob_label = new JLabel(spongebob_image);
        spongebob_label.setBounds(0, 0, 600, 500);
        add(spongebob_label);

        JLabel heading = new JLabel("Big Man Quiz");
        heading.setBounds(750, 20, 300, 60);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(Color.DARK_GRAY);
        add(heading);

        JLabel name = new JLabel("What is ya name: ");
        name.setBounds(800, 80, 300, 20);
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setForeground(Color.BLACK);
        add(name);

        username = new JTextField();
        username.setBounds(750, 110, 300, 30);
        username.setFont(new Font("Times new Roman", Font.BOLD, 20));
        add(username);

        rules = new JButton("Rules");
        rules.setBounds(750, 250, 150, 20);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(950, 250, 150, 20);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(150, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == rules){
            String name = username.getText();
            setVisible(false);
            new Rules(name);
        } else if(e.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Login();

    }

}
