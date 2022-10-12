/*
 * This class Defines how the healthbar looks
 * It does this by drawing a rectangel adn adding it to a JPanel
 *
 * @author LivNTI
 */

import javax.swing.*;
import java.awt.*;

public class Healthbar extends JPanel {
    Player myPlayer;


    public Healthbar(Player player) {
        myPlayer = player;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, myPlayer.getHp(), 100);
    }

    public void getHit() {
        System.out.println("OW!");


    }
}
