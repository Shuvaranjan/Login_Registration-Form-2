import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewPassword extends Form{
    public NewPassword(){
        super("Reset");
        addComponents();
    }
    public void addComponents(){
         JLabel label = new JLabel("New Password");
    label.setBounds(30, 265, 150, 50);
    label.setFont(new Font("Times New Roman", Font.BOLD,20));

    JTextField textField = new JTextField();
    textField.setBounds(180, 270, 300, 40);
    textField.setBorder(BorderFactory.createLoweredBevelBorder());
    
 


    JLabel label2 = new JLabel("Verify Password");
    label2.setBounds(19, 350, 150, 50);
    label2.setFont(new Font("Times New Roman", Font.BOLD,20));

    JTextField textField2 = new JTextField();
    textField2.setBounds(180, 355, 300, 40);
    textField2.setBorder(BorderFactory.createLoweredBevelBorder());

    JButton button2 = new JButton("Reset");
    button2.setBounds(350, 410, 100, 30);
    button2.setForeground(Color.WHITE);
    button2.setBackground(Color.black);



    // add components
    add(label);
    add(textField);
    add(label2);
    add(textField2);
    
    add(button2);
    }
    
}
