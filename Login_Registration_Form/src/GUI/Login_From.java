import java.awt.Color;
import java.awt.Cursor;
//import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.GridBagLayout;
//import java.awt.GridLayout;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
//import javax.swing.JComponent;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import BACKEND.Database;
import CONSTANTS.Common_Constants;

public class Login_From extends Form {
    public Login_From() {
        super("");
        addGUIcomponennts();

    }

    public void addGUIcomponennts() {

        // Login- Icon
        ImageIcon loginimg = new ImageIcon("Login_Registration_Form./src/--MEDIA--/icons8-login-96-100.png");
        this.setIconImage(loginimg.getImage());

        // Background Image
        ImageIcon background_Image = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\moonknight.jpg");
        JLabel background = new JLabel();
        background.setIcon(background_Image);
        background.setBounds(-120, -380, 2000, 1500);

        ImageIcon eyeImg = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\icons8-login-100 (1).png");
        JLabel eye = new JLabel();
        eye.setIcon(eyeImg);
        eye.setBounds(-120, -380, 2000, 1500);

        // Creating JPanel for login Gui transparent effect
        JPanel panel = new JPanel();
        panel.setBounds(450, 410, 530, 700);
        panel.setBackground(new Color(0, 0, 0, 150));

        // Create Login Label
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(485, 10, 520, 200);
        loginLabel.setForeground(Common_Constants.TEXT_COLOR);
        loginLabel.setFont(new Font("Algerian", Font.BOLD, 75));

        // Create Username Label
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(400, 250, 155, 50);
        usernameLabel.setForeground(Common_Constants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
        usernameLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        // Create username Textfield
        JTextField usernameField = new JTextField();
        usernameField.setBounds(400, 300, 400, 50);
        usernameField.setForeground(Common_Constants.TEXT_COLOR);
        usernameField.setBackground(Color.decode("#425DFD"));
        usernameField.setFont(new Font("Arial", Font.BOLD, 20));
        usernameField.setBorder(BorderFactory.createLoweredBevelBorder());
        usernameField.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                // Add Effect
                usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
               
            }

            @Override
            public void mouseExited(MouseEvent e) {

                usernameField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

            @Override
            public void mouseClicked(MouseEvent e) {

                usernameField.setBorder(BorderFactory.createLoweredBevelBorder());
                //passwordField.setBackground(Color.decode("#425DFD"));
            }
          
           
        });

        // Create Password Label
        JLabel passworLabel = new JLabel("Password");
        passworLabel.setBounds(400, 400, 155, 50);
        passworLabel.setForeground(Common_Constants.TEXT_COLOR);
        passworLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
        passworLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        // Create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(400, 450, 400, 50);
        passwordField.setForeground(Common_Constants.TEXT_COLOR);
        passwordField.setFont(new Font("Arial", Font.BOLD, 20));
        passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
        passwordField.setBackground(Color.decode("#425DFD"));
        passwordField.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {

                passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                //passwordField.setBackground(Color.decode("#3955FB"));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
                //passwordField.setBackground(Color.decode("#425DFD"));
            }

            
            @Override
            public void mouseClicked(MouseEvent e) {

                passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
                //passwordField.setBackground(Color.decode("#425DFD"));
            }

           

           

        });
      

        // Create a Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(480, 569, 240, 50);
        loginButton.setFont(new Font("Arial Black", Font.BOLD, 33));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.decode("#000000"));
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
        loginButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setBorder(
                        BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.darkGray));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setBorder(
                        BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
            }

        });

        /* Backend Database Code */
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Get te Username
                String username = usernameField.getText();

                // Get the Password
                String password = new String(passwordField.getPassword());

                if (username.equals("") && password.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Login_From.this, "Please Enter Username or Password", "",
                            getDefaultCloseOperation(), icon5);
                } else if (!username.equals("") && password.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Login_From.this, "Please Enter Password", "",
                            getDefaultCloseOperation(), icon5);
                } else if (username.equals("") && !password.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Login_From.this, "Please Enter Username", "",
                            getDefaultCloseOperation(), icon5);
                }
                // Check database if the username and password are both is valid or not
                else if (Database.ValidateLogin(username, password)) {
                    // Dispose of this GUI
                    Login_From.this.dispose();

                    // take user back to the Login GUI
                    ButtonGUI buttonGUI = new ButtonGUI();
                    buttonGUI.setVisible(true);

                    ImageIcon icon = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-verified-account-50.png");
                    // Login successful
                    JOptionPane.showMessageDialog(Login_From.this, "Login Successfull...", "",
                            getDefaultCloseOperation(), icon);

                } else {
                    ImageIcon icon2 = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\login failed.png");
                    JOptionPane.showMessageDialog(Login_From.this,
                            "\t\t\t       Login Failed ! \n Please enter Valid Username or Password", "Oops!",
                            getDefaultCloseOperation(), icon2);
                    
                }

            }

        });

        // forgot paasword
        JLabel forgotLabel = new JLabel("forgot password !");
        forgotLabel.setBounds(520, 670, 175, 20);
        forgotLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
        forgotLabel.setForeground(Color.decode("#EE1414"));
        forgotLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgotLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // Dispose this GUI
                // Login_From.this.dispose();

                // Launch ForgotPassword GUI
                // new SendCode().setVisible(true);
            }

        });
        /*
         * forgotLabel.addMouseListener(new MouseAdapter() {
         * 
         * @Override
         * public void mouseEntered(MouseEvent e) {
         * forgotLabel.setForeground(Color.decode("#1420EE"));
         * 
         * }
         * 
         * @Override
         * public void mouseExited(MouseEvent e) {
         * forgotLabel.setForeground(Color.decode("#EE1414"));
         * 
         * }
         * 
         * });
         */

        // Create a Register label(Which is use to load the Login GUI)
        JLabel RegisterLabel = new JLabel("Not a User? Register here...");
        RegisterLabel.setBounds(500, 628, 230, 30);
        RegisterLabel.setFont(new Font("Agency FB", Font.BOLD, 25));
        RegisterLabel.setForeground(Common_Constants.TEXT_COLOR);
        RegisterLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Add Functionality So, that when clicked it will launch the Register_From
        RegisterLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // Dispose this GUI
                Login_From.this.dispose();

                // Launch the Register GUI
                new Registration_Form().setVisible(true);
            }

        });

        // Hide & Show Password
        JCheckBox PasswordCheckBox = new JCheckBox("Show Password");
        PasswordCheckBox.setBackground(new Color(39, 39, 39  ));
        PasswordCheckBox.setForeground(Color.WHITE);
        PasswordCheckBox.setBorder(BorderFactory.createEmptyBorder());
      
        PasswordCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (PasswordCheckBox.isSelected()) {
                    passwordField.setEchoChar((char) 0);

                } else {
                    passwordField.setEchoChar('•');
                }

            }

        });

        JPanel panel2 = new JPanel();
        panel2.setBounds(475, 880, 200, 40);
        panel2.setBackground(new Color(0, 0, 0, 0));

        // add componennts
        add(loginLabel);
        add(RegisterLabel);
        add(forgotLabel);
        add(usernameLabel);
        add(usernameField);
        add(passworLabel);
        add(passwordField);
        add(loginButton);
        add(background);
        background.add(panel);
        background.add(panel2);
        panel2.add(PasswordCheckBox);

    }

}
