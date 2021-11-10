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
            System.out.println("exception error");
        }
    }

    public void paint(Graphics g) {
        g.drawImage(this.FirstScreen, 0, 0, 1980, 1080, null);
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



