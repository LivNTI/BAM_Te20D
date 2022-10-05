import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inLine = new Scanner(System.in);

        Friend aFriend = new Friend();
        Friend myFriend = new Friend("Filip");
        System.out.println("my friend is called " + myFriend.getName());
        System.out.println("What is your friends name: ");
        String newName = inLine.next();
        aFriend.setName(newName);
        System.out.println("my old friend is now called " + aFriend.getName());
        drawWindow();
    }

    /*
    This method draws a frame on which a canvas (panel) is attached. The panel is then used to draw figurres on.
    In this case the figure is a rectangle
*/

    public static void drawWindow() {
        JFrame frame = new JFrame("Healthbar"); //create the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set action on closing window
        Healthbar healthbar = new Healthbar(); //Create the canvas
        healthbar.setPreferredSize(new Dimension(600, 300));
        frame.getContentPane().add(healthbar); // add the canvas to the frame
        frame.pack(); // Package everything
        frame.setVisible(true); //make everything visible
    }


}