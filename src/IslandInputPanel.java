import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class IslandInputPanel extends JPanel{
    private BufferedImage ForbiddenIslandBG;

    public IslandInputPanel() {
        try {
            //Commented out original bg
            //this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/forbidden-island-background.jpg")));
            this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Possible Forbidden Island BG.jpg")));
        } catch (Exception E) {
            System.out.println("Exception Error");
        }
    }

    public void paint(Graphics g) {
        g.drawImage(this.ForbiddenIslandBG, 0, 0, 1920, 1080, null);
    }
}