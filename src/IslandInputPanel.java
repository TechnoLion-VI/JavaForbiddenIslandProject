import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;


public class IslandInputPanel extends JPanel implements MouseListener{
    private BufferedImage FirstScreen;
    Boolean hasPlayed = false;

    public IslandInputPanel() {

        try {
            FirstScreen = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Forbidden Island Start.jpg")));
        } catch (Exception E) {
            System.out.println("exception error");
        }
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawImage(FirstScreen, 0, 0, 457, 576, null);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x > 142 && x < 317 && y > 333 && y < 402) {
            IslandFrame frame = new IslandFrame("Forbidden Island");
            
        }
        if (x > 142 && x < 317 && y > 420 && y < 489)
            System.exit(0);
        repaint();
    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}
}



