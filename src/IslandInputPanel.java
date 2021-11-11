import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class IslandInputPanel extends JPanel implements MouseListener {
    private BufferedImage ForbiddenIslandBG, HelpButton;

    public IslandInputPanel() {

        try {
            this.ForbiddenIslandBG = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/FirstScreen.jpg")));
            this.HelpButton = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/FirstScreen.jpg")));
        } catch (Exception E) {
            System.out.println("exception error");
        }
    }

    public void paint(Graphics g) {
        g.drawImage(this.ForbiddenIslandBG, 0, 0, 1980, 1080, null);
        g.drawImage(this.HelpButton,0,0,50,50,null);
  //vertical line
    }

    //517 is from the elft, where the button starts
    //1020 is from the right, where the button ends
    //198
    //1550 and 800 were original





    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX()+ " "+e.getY());
        //if(e.getButton() == e.BUTTON1) {
           // if()
        }
    }



