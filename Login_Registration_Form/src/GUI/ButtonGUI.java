import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class ButtonGUI extends JFrame {

    public ButtonGUI() {
        super("");

        addComponennts();

        // set the size of the GUI
        setSize(850, 700);

        // set Gui fix size
        setResizable(false);

        // set layout of the JFrame bar
        setLayout(null);

        // set Gui for middle of the screen when it is opened
        setLocationRelativeTo(null);

        // configure Gui to end pocess after closing
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

   

    public void addComponennts() {
        ImageIcon icon = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\icons8-apply-100.png");
        this.setIconImage(icon.getImage());
        JButton button = new JButton("Apply Now");
        button.setBounds(300, 100, 200, 50);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        button.setFont(new Font("Impact", Font.PLAIN, 25));
        button.setForeground(Color.BLACK);
        button.setBackground(Color.decode("#07A0C3"));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //button.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.darkGray));
        button.setContentAreaFilled(true);
        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                
                        button.setBackground(Color.decode("#E8570D"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
             
                        button.setBackground(Color.decode("#07A0C3"));
            }

        });
        button.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // dipose this GUI
                ButtonGUI.this.dispose();
                // Launch the new GUI
                new ApplicationForm("Application").setVisible(true);
            }

        });

        
        ImageIcon img = new ImageIcon("Login_Registration_Form\\src\\--MEDIA--\\Apply now.jpg");
        JLabel labelImg = new JLabel();
        labelImg.setIcon(img);
        labelImg.setBounds(-150, 0, 1200, 800);

        // add components
        add(button);
        add(labelImg);

    }

}
