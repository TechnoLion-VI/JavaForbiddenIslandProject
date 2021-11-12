import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class IslandInputPanel extends JPanel implements MouseListener{
    private BufferedImage FirstScreen, HelpButton;
    private JFrame frame;
    IslandFrame frame2;
    HelpFrame frame3;

    public IslandInputPanel(JFrame frame) {
        this.frame = frame;

        try {
            HelpButton = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/help-button_adobespark.png")));
            FirstScreen = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Forbidden Island Start.jpg")));
        } catch (Exception E) {
            System.out.println("exception error");
        }
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawImage(FirstScreen, 0, 0, 457, 576, null);
        g.drawImage(HelpButton,-5,-5,40,40,null);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (x > 142 && x < 317 && y > 333 && y < 402) {
               frame2= new IslandFrame("Forbidden Island");
               this.frame.setVisible(false);
               frame2.add(new FirstInputs());
               frame2.repaint();
               frame2.revalidate();
        }
        if (x > 142 && x < 317 && y > 420 && y < 489)
            System.exit(0);
        if (x > 0 && x < 45 && y > 0 && y < 45) {
            frame3 = new HelpFrame("Help");
            this.frame.setVisible(false);
        }
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}




