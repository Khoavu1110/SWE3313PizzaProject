import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        initiate(); 
    }

    public static void initiate(){ //Creating a blank window with the height and width of the user screen resolution.
        JFrame mainFrame = new JFrame(); //Initiate Jframe
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //Get the size of the screen in pixels.
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        mainFrame.setSize(width, height); //Create a frame with the width and height of the user screen resol.
        mainFrame.setVisible(true); //Make the UI become visible.
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Make it when closing the app will exit it completely.
    }
}
