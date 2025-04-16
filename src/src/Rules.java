import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A class defining the rules of the quiz game.
 */

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    public Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to the Big man Quiz");
        heading.setBounds(40, 20, 500, 60);
        heading.setFont(new Font("Sans-Serif", Font.BOLD, 20));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(40, 90, 700, 350);
        rules.setFont(new Font("Times new Roman", Font.ITALIC, 20));
        rules.setForeground(Color.BLUE);
        rules.setText(
                "<html>" +
                        "Rules:" + "<br><br>" +
                        "1. You are training to be a better programmer." + "<br><br>" +
                        "2. You can choose only one answer" + "<br><br>" +
                        "3. You will have options such as lifeline and to remove 2 wrong answers" + "<br><br>" +
                        "4. Have fun!" + "<br><br>" +
                "</html>"
        );
        add(rules);

        start = new JButton("start");
        start.setBounds(40, 500, 150, 20);
        start.setBackground(Color.GREEN);
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(300, 500, 150, 20);
        back.setBackground(Color.darkGray);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setSize(800, 650);
        setLocation(150, 200);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == start){

        } else if (e.getSource() == back){
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args){
        new Rules("User");
    }
}
