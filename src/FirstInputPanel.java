import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class FirstInputPanel extends JPanel{
    private BufferedImage ForbiddenIslandBG;

    public FirstInputPanel() {
        try {
            this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(FirstInputPanel.class.getResource("Images/forbidden-island-background.jpg")));
        } catch (Exception E) {
            System.out.println("Exception Error");
        }
    }

    public void paint(Graphics g) {
        g.drawImage(this.ForbiddenIslandBG, 0, 0, 1285, 670, null);
    }
}