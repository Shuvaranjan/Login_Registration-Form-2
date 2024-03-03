
//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
//import javax.swing.border.Border;
//import javax.swing.border.LineBorder;
//import javax.swing.border.TitledBorder;

import BACKEND.Database2;
import CONSTANTS.Common_Constants;

//import org.w3c.dom.events.MouseEvent;

public class ApplicationForm extends JFrame {

  public ApplicationForm(String Title) {

    // set title of JFrame bar
    super("Application");

    // set the size of the GUI
    setSize(1200, 800);

    // set Gui fix size
    setResizable(false);

    // set layout of the JFrame bar
    setLayout(null);

    // set Gui for middle of the screen when it is opened
    setLocationRelativeTo(null);

    // configure Gui to end pocess after closing
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    // set background color
    getContentPane().setBackground(Color.decode("#05504D"));

    initialize();
  }

  private void initialize() {
    ImageIcon img = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\icons8-goodnotes-100.png");
    this.setIconImage(img.getImage());

    // Set Heading
    JLabel label1 = new JLabel("<html><u>Fresher's Job Application Form</u></html>");
    label1.setBounds(300, -10, 700, 50);
    label1.setForeground(Color.ORANGE);
    label1.setFont(new Font("Algerian", Font.BOLD, 30));

    /*-------------------------------Personal Informaton-------------------------------------*/
    JPanel panel = new JPanel();
    panel.setBounds(200, 40, 730, 30);
    panel.setBackground(Color.BLACK);
    JLabel label2 = new JLabel("Personal Information");
    label2.setBounds(448, 30, 500, 50);
    label2.setForeground(Color.RED);
    label2.setFont(new Font("Bodoni MT Black", Font.BOLD, 22));

    // Full Name
    JLabel fulName = new JLabel("Full Name:");
    fulName.setBounds(50, 80, 500, 50);
    fulName.setForeground(Color.WHITE);
    fulName.setFont(new Font("Arial", Font.BOLD, 18));
    fulName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField fulNameTextField = new JTextField();
    fulNameTextField.setBounds(150, 88, 500, 30);
    fulNameTextField.setFont(new Font("SansSerif", Font.PLAIN, 15));
    fulNameTextField.setBorder(BorderFactory.createLoweredBevelBorder());
    fulNameTextField.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        
        fulNameTextField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        fulNameTextField.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // Date
    JLabel Date = new JLabel("Date:");
    Date.setBounds(780, 80, 500, 50);
    Date.setForeground(Color.WHITE);
    Date.setFont(new Font("Arial", Font.BOLD, 18));
    Date.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField DateTextfield = new JTextField();
    DateTextfield.setBounds(850, 88, 270, 30);
    DateTextfield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    DateTextfield.setBorder(BorderFactory.createLoweredBevelBorder());
    DateTextfield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        
        DateTextfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        DateTextfield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // Email
    JLabel Email = new JLabel("Email:");
    Email.setBounds(50, 130, 500, 50);
    Email.setForeground(Color.WHITE);
    Email.setFont(new Font("Arial", Font.BOLD, 18));
    Email.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField EmailTextfield = new JTextField();
    EmailTextfield.setBounds(150, 140, 500, 30);
    EmailTextfield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    EmailTextfield.setBorder(BorderFactory.createLoweredBevelBorder());
    EmailTextfield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
     
        EmailTextfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        EmailTextfield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // Phone Number
    JLabel Phone = new JLabel("Phone:");
    Phone.setBounds(780, 130, 500, 50);
    Phone.setForeground(Color.WHITE);
    Phone.setFont(new Font("Arial", Font.BOLD, 18));
    Phone.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField phonefield = new JTextField();
    phonefield.setBounds(850, 140, 270, 30);
    phonefield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    phonefield.setBorder(BorderFactory.createLoweredBevelBorder());
    phonefield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        
        phonefield.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        phonefield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // AddressPanel
    // JPanel addressPanel = new JPanel();
    // addressPanel.setBounds(150, 195, 700, 130);
    // Address
    JLabel address = new JLabel("Address:");
    address.setBounds(50, 185, 500, 50);
    address.setForeground(Color.WHITE);
    address.setFont(new Font("Arial", Font.BOLD, 18));
    address.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextArea addressArea = new JTextArea();
    addressArea.setBounds(150, 195, 700, 130);
    addressArea.setFont(new Font("SansSerif", Font.PLAIN, 15));
    addressArea.setBorder(BorderFactory.createLoweredBevelBorder());
    addressArea.setLayout(new FlowLayout());
    addressArea.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
     
        addressArea.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        addressArea.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    JScrollPane scrollableTextArea = new JScrollPane(addressArea);
    scrollableTextArea.setBounds(150, 195, 700, 130);
    scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    // Position Applied
    JLabel pA = new JLabel("Position Applied For:");
    pA.setBounds(45, 340, 500, 50);
    pA.setForeground(Color.WHITE);
    pA.setFont(new Font("Arial", Font.BOLD, 18));
    pA.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField pAfield = new JTextField();
    pAfield.setBounds(240, 348, 270, 30);
    pAfield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    pAfield.setBorder(BorderFactory.createLoweredBevelBorder());
    pAfield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
      
        pAfield.setBorder(BorderFactory.createLineBorder(Color.red, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        pAfield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // Employment Desired
    JLabel eD = new JLabel("Employment Desired:");
    eD.setBounds(640, 340, 500, 50);
    eD.setForeground(Color.WHITE);
    eD.setFont(new Font("Arial", Font.BOLD, 18));

    String set[] = { "       ----  Select Option  ----", "Full Time", "Part Time", "Seasonal" };
    JComboBox cb = new JComboBox(set);
    cb.setBounds(850, 353, 200, 25);
    cb.setForeground(Color.GRAY);

    /*-------------------------------Educational Qualification-------------------------------------*/
    JPanel panel2 = new JPanel();
    panel2.setBounds(200, 400, 730, 30);
    panel2.setBackground(Color.BLACK);
    JLabel label3 = new JLabel("Educational Qualification");
    label3.setBounds(420, 389, 500, 50);
    label3.setForeground(Color.RED);
    label3.setFont(new Font("Bodoni MT Black", Font.BOLD, 22));

    // School name
    JLabel schoolName = new JLabel("School Name:");
    schoolName.setBounds(42, 440, 150, 50);
    schoolName.setForeground(Color.WHITE);
    schoolName.setFont(new Font("Arial", Font.BOLD, 18));
    schoolName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField schoolNamefield = new JTextField();
    schoolNamefield.setBounds(180, 450, 400, 30);
    schoolNamefield.setBorder(BorderFactory.createLoweredBevelBorder());
    schoolNamefield.setFont(new Font("SansSerif", Font.PLAIN, 15));
  
    schoolNamefield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        schoolNamefield.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        schoolNamefield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // State name
    JLabel Statename = new JLabel("City/State:");
    Statename.setBounds(754, 440, 150, 50);
    Statename.setForeground(Color.WHITE);
    Statename.setFont(new Font("Arial", Font.BOLD, 18));
    Statename.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField Statenamefield = new JTextField();
    Statenamefield.setBounds(860, 450, 200, 30);
    Statenamefield.setBorder(BorderFactory.createLoweredBevelBorder());
    Statenamefield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    Statenamefield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        Statenamefield.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        Statenamefield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // From
    JLabel from = new JLabel("From:");
    from.setBounds(116, 500, 150, 50);
    from.setForeground(Color.WHITE);
    from.setFont(new Font("Arial", Font.BOLD, 18));
    from.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField fromField = new JTextField();
    fromField.setBounds(180, 510, 100, 30);
    fromField.setBorder(BorderFactory.createLoweredBevelBorder());
    fromField.setFont(new Font("SansSerif", Font.PLAIN, 15));
    fromField.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        fromField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        fromField.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // To
    JLabel to = new JLabel("To:");
    to.setBounds(288, 500, 150, 50);
    to.setForeground(Color.WHITE);
    to.setFont(new Font("Arial", Font.BOLD, 18));
    to.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField toField = new JTextField();
    toField.setBounds(325, 510, 100, 30);
    toField.setBorder(BorderFactory.createLoweredBevelBorder());
    toField.setFont(new Font("SansSerif", Font.PLAIN, 15));
    toField.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        toField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        toField.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // College name
    JLabel collegeName = new JLabel("College Name:");
    collegeName.setBounds(42, 560, 150, 50);
    collegeName.setForeground(Color.WHITE);
    collegeName.setFont(new Font("Arial", Font.BOLD, 18));
    collegeName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField collegeNamefield = new JTextField();
    collegeNamefield.setBounds(180, 570, 400, 30);
    collegeNamefield.setBorder(BorderFactory.createLoweredBevelBorder());
    collegeNamefield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    collegeNamefield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        collegeNamefield.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        collegeNamefield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // State name2
    JLabel Statename2 = new JLabel("City/State:");
    Statename2.setBounds(754, 560, 150, 50);
    Statename2.setFont(new Font("Arial", Font.BOLD, 18));
    Statename2.setForeground(Color.WHITE);
    Statename2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField Statenamefield2 = new JTextField();
    Statenamefield2.setBounds(860, 570, 200, 30);
    Statenamefield2.setBorder(BorderFactory.createLoweredBevelBorder());
    Statenamefield2.setFont(new Font("SansSerif", Font.PLAIN, 15));
    Statenamefield2.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        Statenamefield2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        Statenamefield2.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // From2
    JLabel from2 = new JLabel("From:");
    from2.setBounds(116, 610, 150, 50);
    from2.setForeground(Color.WHITE);
    from2.setFont(new Font("Arial", Font.BOLD, 18));
    from2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField fromField2 = new JTextField();
    fromField2.setBounds(180, 620, 100, 30);
    fromField2.setBorder(BorderFactory.createLoweredBevelBorder());
    fromField2.setFont(new Font("SansSerif", Font.PLAIN, 15));
    fromField2.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        fromField2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        fromField2.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // To2
    JLabel to2 = new JLabel("To:");
    to2.setBounds(288, 609, 150, 50);
    to2.setForeground(Color.WHITE);
    to2.setFont(new Font("Arial", Font.BOLD, 18));
    to2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

    JTextField toField2 = new JTextField();
    toField2.setBounds(325, 620, 100, 30);
    toField2.setBorder(BorderFactory.createLoweredBevelBorder());
    toField2.setFont(new Font("SansSerif", Font.PLAIN, 15));
    toField2.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        toField2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        toField2.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // Graduation
    JLabel gD = new JLabel("Graduate?");
    gD.setBounds(500, 610, 100, 50);
    gD.setForeground(Color.WHITE);
    gD.setFont(new Font("Arial", Font.BOLD, 18));

    String data[] = { "      ---- Select Option ----", "Yes", "No" };
    JComboBox cb2 = new JComboBox(data);
    cb2.setBounds(620, 618, 200, 30);
    cb2.setForeground(Color.GRAY);

    // Degree
    JLabel degre = new JLabel("Degree:");
    degre.setBounds(850, 610, 500, 50);
    degre.setForeground(Color.WHITE);
    degre.setFont(new Font("Arial", Font.BOLD, 18));
    degre.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    JTextField degreefield = new JTextField();
    degreefield.setBounds(932, 620, 200, 30);
    degreefield.setBorder(BorderFactory.createLoweredBevelBorder());
    degreefield.setFont(new Font("SansSerif", Font.PLAIN, 15));
    degreefield.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        degreefield.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        degreefield.setBorder(BorderFactory.createLoweredBevelBorder());
      }

    });

    // Submit Button
    JButton submitButton = new JButton("Submit");
    submitButton.setBounds(400, 690, 150, 42);
    submitButton.setFont(new Font("Arial Black", Font.BOLD, 18));
    submitButton.setForeground(Color.WHITE);
    submitButton.setBackground(Color.decode("#011A96"));
    submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    submitButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
    submitButton.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        submitButton.setBounds(380, 685, 200, 50);
        submitButton.setFont(new Font("Arial Black", Font.BOLD, 25));

      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        submitButton.setBounds(400, 690, 150, 42);
        submitButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(Color.decode("#011A96"));
      }

     

    });

    
     // + ----------------------------- Backend code---------------------------------- +
     
    submitButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {

       

        String fname = fulNameTextField.getText();
        String date = DateTextfield.getText();
        String email = EmailTextfield.getText();
        String phn = phonefield.getText();
        String address = addressArea.getText();
        String position_applied = pAfield.getText();
        String emp_desired = cb.getSelectedItem().toString();
        String school_name = schoolNamefield.getText();
        String state_name = Statenamefield.getText();
        String from = fromField.getText();
        String to = toField.getText();
        String college_name = collegeNamefield.getText();
        String state_name2 = Statenamefield2.getText();
        String from2 = fromField2.getText();
        String to2 = toField2.getText();
        String graduate = cb2.getSelectedItem().toString();
        String dgree = degreefield.getText();

        if (fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
            && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
            && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
            && college_name.equals("") && state_name2.equals("")) {
              ImageIcon icon5 = new ImageIcon(
                "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
          JOptionPane.showMessageDialog(ApplicationForm.this,
              "No data is Availble\n Please put the valided information...","",
              getDefaultCloseOperation(), icon5);
              

        }
        else if(!fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }
        else if(fname.equals("") && !date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && !email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && !phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && !dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && !address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        
        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && !position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && !from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && !to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && !from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }


        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && !to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }
        
        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && !to2.equals("")
        && !college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }


        else if(fname.equals("") && date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && !state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        
        else if(!fname.equals("") && !date.equals("") && email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && !from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && !from.equals("") && !to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        
        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && !from.equals("") && !to.equals("") && !from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }


        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && !from.equals("") && !to.equals("") && !from2.equals("") && !to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }


        else if(!fname.equals("") && !date.equals("") && !email.equals("") && !phn.equals("")
        && !dgree.equals("") && !address.equals("") && !position_applied.equals("") && school_name.equals("")
        && !state_name.equals("") && !from.equals("") && !to.equals("") && !from2.equals("") && !to2.equals("")
        && !college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if(!fname.equals("") && date.equals("") && !email.equals("") && phn.equals("")
        && dgree.equals("") && address.equals("") && position_applied.equals("") && school_name.equals("")
        && state_name.equals("") && from.equals("") && to.equals("") && from2.equals("") && to2.equals("")
        && college_name.equals("") && state_name2.equals("")){
          ImageIcon icon5 = new ImageIcon(
            "Login_Registration_Form\\src\\--MEDIA--\\icons8-finger-pointing-right-50.png");
      JOptionPane.showMessageDialog(ApplicationForm.this,
          "Please entered the all information","",
          getDefaultCloseOperation(), icon5);
        }

        else if (Database2.Submit(fname, date, email, phn, address, position_applied, emp_desired, school_name,
            state_name, from, to, college_name, state_name2, from2, to2, graduate, dgree)) {
          JOptionPane.showMessageDialog(ApplicationForm.this, "Submited Succesfully...");
          ApplicationForm.this.dispose();
        } else {
          JOptionPane.showMessageDialog(ApplicationForm.this, "Failed, Data already exists");

        }

      }

    });

    // Reset Button
    JButton resetButton = new JButton("Reset");
    resetButton.setBounds(670, 690, 140, 42);
    resetButton.setFont(new Font("Arial Black", Font.BOLD, 18));
    resetButton.setForeground(Color.WHITE);
    resetButton.setBackground(Color.BLACK);
    resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    resetButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
    resetButton.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        resetButton.setBounds(650, 685, 200, 50);
        resetButton.setFont(new Font("Arial Black", Font.BOLD, 25));

      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        resetButton.setBounds(670, 690, 140, 42);
        resetButton.setFont(new Font("Arial Black", Font.BOLD, 18));
        resetButton.setForeground(Color.WHITE);
        resetButton.setBackground(Color.BLACK);
      }

      @Override
      public void mouseClicked(java.awt.event.MouseEvent e) {
        resetButton.setBackground(Color.decode("#FFF300"));
        resetButton.setForeground(Color.decode("#171717"));

      }

    });
    resetButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        fulNameTextField.setText(null);
        EmailTextfield.setText(null);
        DateTextfield.setText(null);
        phonefield.setText(null);
        addressArea.setText(null);
        pAfield.setText(null);
        schoolNamefield.setText(null);
        Statenamefield.setText(null);
        Statenamefield2.setText(null);
        fromField.setText(null);
        toField.setText(null);
        fromField2.setText(null);
        toField2.setText(null);
        collegeNamefield.setText(null);
        degreefield.setText(null);

      }

    });

    // add Components
    add(label1);
    add(label2);
    add(label3);
    add(fulName);
    add(fulNameTextField);
    add(Date);
    add(DateTextfield);
    add(Email);
    add(EmailTextfield);
    add(Phone);
    add(phonefield);
    add(address);
    add(pA);
    add(pAfield);
    add(eD);
    add(cb);
    add(gD);
    add(cb2);
    add(schoolName);
    add(schoolNamefield);
    add(Statename);
    add(Statenamefield);
    add(from);
    add(fromField);
    add(to);
    add(toField);
    add(collegeName);
    add(collegeNamefield);
    add(Statename2);
    add(Statenamefield2);
    add(from2);
    add(fromField2);
    add(to2);
    add(toField2);
    add(degre);
    add(degreefield);
    add(panel);
    add(panel2);
    add(submitButton);
    add(resetButton);
    getContentPane().add(scrollableTextArea);
  }
}