import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

public class HelpPanel extends JPanel {
    private BufferedImage pg1,pg2,pg3,pg4,pg5,pg6,pg7,pg8;

    public HelpPanel(JFrame frame) {
        try {

            pg1 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page One.PNG")));
            pg2 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page Two.PNG")));
            pg3 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page Three.PNG")));
            pg4 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page 4.PNG")));
            pg5 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page Five.PNG")));
            pg6 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page Six.PNG")));
            pg7 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page Seven.PNG")));
            pg8 = ImageIO.read(Objects.requireNonNull(IslandInputPanel.class.getResource("Images/Rules Page 8.PNG")));

            System.out.println("exception error");
        }catch(Exception E){
            System.out.println("error");
        }
    }
    public void paint(Graphics g) {
        g.drawImage(pg1,0,0,457,567,null);
        
    }

}
