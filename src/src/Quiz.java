import javax.swing.*;
import java.awt.*;

/**
 * A class representing the actual quiz
 */
public class Quiz extends JFrame {

    String[][] questions = new String[10][5];
    String[][] answers = new String[10][2];
    JLabel question_number, question;
    JRadioButton option_1, option_2, option_3, option_4;
    public static int timer = 30;

    public Quiz(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon patrick_icon = new ImageIcon(ClassLoader.getSystemResource("icons/patrick_test.png"));
        JLabel patrick_image = new JLabel(patrick_icon);
        patrick_image.setBounds(0, -50, 500, 400);
        add(patrick_image);

        ImageIcon quiz_time_icon = new ImageIcon(ClassLoader.getSystemResource("icons/real_quiz_time.jpeg"));
        JLabel quiz_time_image  = new JLabel(quiz_time_icon);
        quiz_time_image.setBounds(500, -20, 700, 390);
        add(quiz_time_image);

        question_number = new JLabel();
        question_number.setBounds(100, 400, 50, 30);
        question_number.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        add(question_number);

        question = new JLabel();
        question.setBounds(150, 400, 900, 30);
        question.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(question);

        // questions being asked and their options
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        // answers to the questions
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        option_1 = new JRadioButton();
        option_1.setBounds(170, 450, 700, 20);
        option_1.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(option_1);

        option_2 = new JRadioButton();
        option_2.setBounds(170, 480, 700, 20);
        option_2.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(option_2);

        option_3 = new JRadioButton();
        option_3.setBounds(170, 510, 700, 20);
        option_3.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(option_3);

        option_4 = new JRadioButton();
        option_4.setBounds(170, 540, 700, 20);
        option_4.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(option_4);

        ButtonGroup group_options = new ButtonGroup();
        group_options.add(option_1);
        group_options.add(option_2);
        group_options.add(option_3);
        group_options.add(option_4);

        JButton next = new JButton("Next");
        next.setBounds(900, 450, 200, 40);
        next.setBackground(new Color(30, 144, 255));
        add(next);

        JButton lifeline = new JButton("50 50 lifeline");
        lifeline.setBounds(900, 510, 200, 40);
        add(lifeline);

        JButton submit = new JButton("Submit");
        submit.setBounds(900, 570, 200, 40);
        submit.setEnabled(false);
        add(submit);

        start(0);

        setSize(1200, 800);
        setLocation(150, 0);
        setVisible(true);

    }
    public void paint(Graphics g){
        super.paint(g);

        String time = "Time left: " + timer + " seconds";
    }

    public void start(int count){
        int new_count = count + 1;
        question_number.setText(Integer.toString(new_count) + ".");
        question.setText(questions[count][0]);
        option_1.setText(questions[count][0]);
        option_2.setText(questions[count][1]);
        option_3.setText(questions[count][3]);
        option_4.setText(questions[count][4]);
    }


    public static void main(String[] args){
        new Quiz();
    }
}
