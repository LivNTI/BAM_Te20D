import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Game {

    Healthbar healthbar;
    Player friend;


    public Game() {
    }

    public void start() {
        friend = new Player("Julia", true);
        Player enemy = new Player("Gustav", false);
        drawWindow();
        startGame();
    }

    /*
    This method draws a frame on which a canvas (panel) is attached. The panel is then used to draw figurres on.
    In this case the figure is a rectangle
*/

    public void drawWindow() {
        JFrame frame = new JFrame("Healthbar"); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        Healthbar healthbar = new Healthbar(friend); //Create the canvas
        healthbar.setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
    }

    public void startGame() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("get hit?");
        String in = myScanner.nextLine();

        if (in.equals("y")) {
            healthbar.getHit();
        }
    }
}
