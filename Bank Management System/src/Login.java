import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;



public class Login extends JFrame implements ActionListener {

    
    static class RoundedButton extends JButton {
        private final int radius;
        private boolean isPressed = false; // Track if the button is pressed

        public RoundedButton(String text, int radius) {
            super(text);
            this.radius = radius;
            setContentAreaFilled(false); // Prevents default background painting
            setFocusPainted(false); // Prevents focus border
            setBorderPainted(false); // Prevents default border painting

            // Add mouse listeners for click feedback
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    isPressed = true;
                    repaint(); // Repaint to show the click effect
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    isPressed = false;
                    repaint(); // Repaint to reset the click effect
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            // Set the background color based on the pressed state
            if (isPressed) {
                g.setColor(getBackground().darker()); // Darken the color when pressed
            } else {
                g.setColor(getBackground());
            }
            g.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
            super.paintComponent(g); // Call parent method to paint text
        }

        @Override
        protected void paintBorder(Graphics g) {
            g.setColor(Color.BLACK); // Border color
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
        }
    }

    RoundedButton signIn, clear, signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Use a relative file path to the "icons" folder
        File imageFile = new File(
                "/Users/ashokpaudelapril/Library/CloudStorage/OneDrive-TexasStateUniversity/Data Structure and Algorithm Using Java/Bank Management System/Bank Management System/icons/logo.jpg");

        ImageIcon image1 = new ImageIcon(imageFile.getAbsolutePath());
        Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel label = new JLabel(image3);
        setLayout(null);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Arial", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Arial", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(280, 150, 260, 40);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 20));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Arial", Font.BOLD, 28));
        pin.setBounds(180, 220, 150, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(280, 220, 260,40);
        add(pinTextField);

        signIn = new RoundedButton("SIGN IN", 20);
        signIn.setBounds(290, 300, 100, 40);
        signIn.setBackground(Color.BLUE);
        signIn.setForeground(Color.WHITE);
        signIn.addActionListener(this);
        add(signIn);

        clear = new RoundedButton("CLEAR", 20);
        clear.setBounds(430, 300, 100, 40);
        clear.setBackground(Color.BLUE);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signUp = new RoundedButton("SIGN UP", 20);
        signUp.setBounds(300, 350, 220, 40);
        signUp.setBackground(Color.BLUE);
        signUp.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(signUp);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == signIn) {

        } else if (ae.getSource() == signUp) {

        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
