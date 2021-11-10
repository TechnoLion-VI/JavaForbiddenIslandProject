import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class IslandInputPanel extends JPanel implements MouseListener {
    private BufferedImage ForbiddenIslandBG, FirstScreen;

    public IslandInputPanel() {
        try {
            //Commented out original bg
            //this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/forbidden-island-background.jpg")));
            //this.ForbiddenIslandBG= ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Possible Forbidden Island BG.jpg")));
            this.FirstScreen = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/FirstScreen.jpg")));
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public void paint(Graphics g) {
        g.drawImage(this.FirstScreen, 0, 0, 1920, 1080, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX()+ " "+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}