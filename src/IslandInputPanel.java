import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

import static java.awt.SystemColor.window;

public class IslandInputPanel extends JPanel {
    private BufferedImage FirstScreen;


    public IslandInputPanel() {

        try {
            FirstScreen = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Forbidden Island Start.jpg")));
        } catch (Exception E) {
            System.out.println("exception error");
        }
    }

    public void paint(Graphics g) {
        g.drawImage(FirstScreen, 0, 0, 457, 576, null);
    }
}



