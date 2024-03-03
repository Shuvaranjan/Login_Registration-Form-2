import javax.swing.SwingUtilities;

//import BACKEND.Database;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                // Display the GUI for using Users
                new Login_From().setVisible(true);

            }
        });
    }

}
