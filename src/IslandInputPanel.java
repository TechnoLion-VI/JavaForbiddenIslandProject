import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class IslandInputPanel extends JPanel{
    private BufferedImage ForbiddenIslandBG, FirstScreen;

    public IslandInputPanel() {
        try {
            //Commented out original bg
            //this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/forbidden-island-background.jpg")));
            this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Possible Forbidden Island BG.jpg")));
            this.FirstScreen= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/FirstScreen.png")));
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public void paint(Graphics g) {
        g.drawImage(this.FirstScreen, 0, 0, 1920, 1080, null);
    }
}