import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;

public class SignupOne extends JFrame {

    SignupOne() {
        setTitle("SIGN UP");
        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Random randNum = new Random();
        Long random = Math.abs((randNum.nextLong() % 9000L) + 1000L);

        JLabel formNo = new JLabel("APPLICATION FORM No. " + random);
        formNo.setFont(new Font("Arial", Font.BOLD, 30));
        formNo.setBounds(210, 20, 600, 40);
        add(formNo);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 40);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(150, 130, 400, 40);
        add(name);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);


    }
    public static void main(String args[]) {
        new SignupOne();

    }
}
