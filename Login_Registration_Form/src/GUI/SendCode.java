import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Properties;

import javax.net.ssl.SSLSocketFactory;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SendCode extends Form {
    int randomcode;
    Connection con = null;
    ResultSet resultSet = null;
    PreparedStatement pStatement = null;
   public SendCode(){
    super("Forgot Password");
    addComponents();
   }
   public void addComponents(){
    JLabel label = new JLabel("Enter Email");
    label.setBounds(30, 90, 120, 50);
    label.setFont(new Font("Times New Roman", Font.BOLD,20));

    JTextField textField = new JTextField();
    textField.setBounds(150, 95, 300, 40);
    textField.setBorder(BorderFactory.createLoweredBevelBorder());
    
    JButton sendbutton = new JButton("Send");
    sendbutton.setBounds(350, 150, 100, 30);
    sendbutton.setForeground(Color.WHITE);
    sendbutton.setBackground(Color.black);
    sendbutton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           Random rand = new Random();
           randomcode = rand.nextInt(999999);
           String host = "smtp.gmail.com";
           String user = "hacklucky_077@gmail.com";
           String pass = "Shuvaranjan2004";
           String to = textField.getText();
           String Subject = "Reset Code";
           String code = "Your Reset Code is: " + randomcode;
           boolean sessionDebug = false;
           Properties pros = System.getProperties();
           pros.put("mail.smtp.starttls.enable", "true");
           pros.put("mail.smtp.host", "host");
           pros.put("mail.smtp.port", "587");
           pros.put("mail.smtp.auth", "true");
           pros.put("mail.smtp.starttls.required", "true");
           java.security.Security.addProvider(null);
           //--------------------------------pending work---------------//


        }
        
    });


    JLabel label2 = new JLabel("Verify Code");
    label2.setBounds(38, 350, 120, 50);
    label2.setFont(new Font("Times New Roman", Font.BOLD,20));

    JTextField textField2 = new JTextField();
    textField2.setBounds(150, 355, 300, 40);
    textField2.setBorder(BorderFactory.createLoweredBevelBorder());

    JButton button2 = new JButton("Verify Code");
    button2.setBounds(350, 410, 100, 30);
    button2.setForeground(Color.WHITE);
    button2.setBackground(Color.black);



    // add components
    add(label);
    add(textField);
    add(label2);
    add(textField2);
    add(sendbutton);
    add(button2);
   }
    
}
