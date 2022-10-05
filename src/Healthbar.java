import javax.swing.*;
import java.awt.*;

public class Healthbar extends JPanel {


    public Healthbar() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, 300, 100);
    }
}
