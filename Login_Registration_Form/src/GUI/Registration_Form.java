import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import BACKEND.Database;
import CONSTANTS.Common_Constants;

public class Registration_Form extends Form {
    public Registration_Form() {
        super("");
        addGUIcomponennts();
    }

    public void addGUIcomponennts() {
        ImageIcon img1 = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\icons8-register-100.png");
        this.setIconImage(img1.getImage());

        ImageIcon background_Image = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\Screenshot 2024-02-24 013812.jpg");

        JLabel background = new JLabel();
        background.setIcon(background_Image);
        background.setBounds(0, -350, 2000, 1500);

        JPanel panel = new JPanel();
        panel.setBounds(380, 380, 530, 700);
        panel.setBackground(new Color(0, 0, 0, 100));

        // Create Register Label
        JLabel registerLabel = new JLabel("Register");
        registerLabel.setBounds(400, 45, 520, 90);
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        registerLabel.setForeground(Common_Constants.TEXT_COLOR);
        registerLabel.setFont(new Font("Algerian", Font.BOLD, 65));

        // Create Username Label
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(450, 180, 155, 50);
        usernameLabel.setForeground(Common_Constants.TEXT_COLOR);
        usernameLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
        usernameLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        // Create username Textfield
        JTextField usernameField = new JTextField();
        usernameField.setBounds(450, 230, 400, 50);
        usernameField.setForeground(Common_Constants.TEXT_FIELD_COLOR);
        usernameField.setBackground(Color.decode("#E4B52A"));
        usernameField.setFont(new Font("Arial", Font.BOLD, 20));
        usernameField.setBorder(BorderFactory.createLoweredBevelBorder());
        usernameField.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                usernameField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                usernameField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

        });

        // Create Password Label
        JLabel passworLabel = new JLabel("Password");
        passworLabel.setBounds(450, 290, 155, 50);
        passworLabel.setForeground(Common_Constants.TEXT_COLOR);
        passworLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
        passworLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        // Create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(450, 340, 400, 50);
        passwordField.setForeground(Common_Constants.TEXT_FIELD_COLOR);
        passwordField.setBackground(Color.decode("#E4B52A"));
        passwordField.setFont(new Font("Arial", Font.BOLD, 20));
        passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
        passwordField.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                passwordField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

        });

        // Create Confirm-Password Label
        JLabel ReEnterpassworLabel = new JLabel("Confirm Password");
        ReEnterpassworLabel.setBounds(450, 400, 300, 50);
        ReEnterpassworLabel.setForeground(Common_Constants.TEXT_COLOR);
        ReEnterpassworLabel.setFont(new Font("Agency FB", Font.BOLD, 45));
        ReEnterpassworLabel.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        // Create ReEnter-password field
        JPasswordField ReEnterpasswordField = new JPasswordField();
        ReEnterpasswordField.setBounds(450, 450, 400, 50);
        ReEnterpasswordField.setForeground(Common_Constants.TEXT_FIELD_COLOR);
        ReEnterpasswordField.setBackground(Color.decode("#E4B52A"));
        ReEnterpasswordField.setFont(new Font("Arial", Font.BOLD, 20));
        ReEnterpasswordField.setBorder(BorderFactory.createLoweredBevelBorder());
        ReEnterpasswordField.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                ReEnterpasswordField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ReEnterpasswordField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                ReEnterpasswordField.setBorder(BorderFactory.createLoweredBevelBorder());
            }

        });

        // Create a Register Button
        JButton RegisterButton = new JButton("Register");
        RegisterButton.setBounds(530, 565, 220, 50);
        RegisterButton.setFont(new Font("Arial Black", Font.BOLD, 30));
        RegisterButton.setBackground(new Color(0, 0, 0));
        RegisterButton.setForeground(Color.WHITE);
        RegisterButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        RegisterButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
        RegisterButton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                RegisterButton.setBorder(
                        BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.darkGray));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                RegisterButton.setBorder(
                        BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
            }

        });

        /* Backend Database Code */
        RegisterButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the Username
                String username = usernameField.getText();

                // Get the Password
                String password = new String(passwordField.getPassword());

                // Get the Re-Password
                String repassword = new String(ReEnterpasswordField.getPassword());

                if (username.equals("") && password.equals("") && repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter the empty fields...", "",
                            getDefaultCloseOperation(), icon5);
                } else if (!username.equals("") && password.equals("") && repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter the empty fields...", "",
                            getDefaultCloseOperation(), icon5);
                } else if (username.equals("") && !password.equals("") && repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter the empty fields...", "",
                            getDefaultCloseOperation(), icon5);
                } else if (!username.equals("") && !password.equals("") && repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter Confirm Password...", "",
                            getDefaultCloseOperation(), icon5);
                } else if (username.equals("") && !password.equals("") && !repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter Username...", "",
                            getDefaultCloseOperation(), icon5);
                } else if (!username.equals("") && password.equals("") && !repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter Password...", "",
                            getDefaultCloseOperation(), icon5);
                } else if (username.equals("") && password.equals("") && !repassword.equals("")) {
                    ImageIcon icon5 = new ImageIcon(
                            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
                    JOptionPane.showMessageDialog(Registration_Form.this, "Please Enter the empty fields...", "",
                            getDefaultCloseOperation(), icon5);
                }

                // validate user input
                else if (validateUserInput(username, password, repassword)) {

                    // Register to the user database
                    if (Database.Register(username, repassword)) {
                        // Dispose of this GUI
                        Registration_Form.this.dispose();

                        // take user back to the Login GUI
                        Login_From login_From = new Login_From();
                        login_From.setVisible(true);

                        ImageIcon icon = new ImageIcon(
                                "Login_Registration_Form\\src\\--MEDIA--\\icons8-verified-account-50.png");
                        // Create a Result dialogue box
                        JOptionPane.showMessageDialog(login_From, "Register Account Successfully", "",
                                getDefaultCloseOperation(), icon);
                    } else {

                        ImageIcon icon2 = new ImageIcon(
                                "Login_Registration_Form\\src\\--MEDIA--\\icons8-warning-50.png");
                        // register failed(likely due to the user already exists in the DB)
                        JOptionPane.showMessageDialog(Registration_Form.this, "Error: Username had already taken",
                                "˙◠˙", getDefaultCloseOperation(), icon2);
                    }

                }

                else {
                    ImageIcon icon2 = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\icons8-warning-50.png");
                    // Invalid User Input
                    JOptionPane.showMessageDialog(Registration_Form.this,
                            "Error: Username must be 6 characters Long \n and password must be match", "Error !",
                            getDefaultCloseOperation(), icon2);
                }

            }

        });

        // Create a Login label(Which is use to load the Login GUI)
        JLabel loginLabel2 = new JLabel("Already have an account? Login here...");
        loginLabel2.setBounds(500, 625, 295, 28);
        loginLabel2.setFont(new Font("Agency FB", Font.BOLD, 25));
        loginLabel2.setForeground(Common_Constants.TEXT_COLOR);
        loginLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Add Functionality So, that when clicked it will launch the Register_From
        loginLabel2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // Dispose of this GUI
                Registration_Form.this.dispose();

                // take back to the Login GUI
                new Login_From().setVisible(true);
            }

        });

        // add componennts
        add(registerLabel);
        // add(registerLabelImage);
        add(usernameLabel);
        add(usernameField);
        add(passworLabel);
        add(passwordField);
        add(RegisterButton);
        add(ReEnterpassworLabel);
        add(ReEnterpasswordField);
        add(loginLabel2);
        add(background);
        background.add(panel);

    }

    // so here we are going to validate our user input, making sure that user has
    // placed a valid username and password
    public boolean validateUserInput(String username, String password, String repassword) {
        // All fields must have a value
        if (username.length() == 0 || password.length() == 0 || repassword.length() == 0) {
            return false;
        }

        // username has to be atleast 6 character Long
        if (username.length() < 6) {
            return false;

        }

        // password and rePassword must be same like username
        if (!password.equals(repassword)) {
            return false;
        }
        return true;
    }

}
