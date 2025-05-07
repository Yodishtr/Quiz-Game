import javax.swing.*;
import java.awt.*;

/**
 * A class representing the score of the quiz taker
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{

    public Score(String username, int score){
        setBounds(200, 200, 1000, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon patrick_icon = new ImageIcon(ClassLoader.getSystemResource("icons/pat_torn.jpg"));
        JLabel patrick_image = new JLabel(patrick_icon);
        patrick_image.setBounds(0, 100, 500, 400);
        add(patrick_image);


        JLabel heading = new JLabel("Terrible Score " + username + "!");
        heading.setBounds(600, 100, 300, 30);
        heading.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        add(heading);

        JLabel score_label = new JLabel("Your score is " + score);
        score_label.setBounds(600, 200, 300, 30);
        score_label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        add(score_label);

        JButton redo = new JButton("Play again?");
        redo.setBounds(600, 300, 200, 40);

        redo.addActionListener(this);
        add(redo);

        setVisible(true);
        setSize(1000, 700);

    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args){
        new Score("user", 0);
    }
}
