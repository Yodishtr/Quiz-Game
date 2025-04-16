import javax.swing.*;
import java.awt.*;

/**
 * A class representing the actual quiz
 */
public class Quiz extends JFrame {

    public Quiz(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon patrick_icon = new ImageIcon(ClassLoader.getSystemResource("icons/patrick_test.png"));
        JLabel patrick_image = new JLabel(patrick_icon);
        patrick_image.setBounds(0, -50, 500, 400);
        add(patrick_image);

        JLabel question_number = new JLabel("1");
        question_number.setBounds(100, 400, 50, 30);
        add(question_number);


        setSize(1200, 800);
        setLocation(150, 0);
        setVisible(true);

    }


    public static void main(String[] args){
        new Quiz();
    }
}
