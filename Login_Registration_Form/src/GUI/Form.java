import javax.swing.JFrame;

import CONSTANTS.Common_Constants;

public class Form extends JFrame {
    // Creating a Constructor
    public Form(String Title) {

        // set title of JFrame bar
        super(Title);

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
        getContentPane().setBackground(Common_Constants.PRYMARY_COLOR);

    }

}
