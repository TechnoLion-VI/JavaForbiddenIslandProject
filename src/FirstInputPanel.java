import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class FirstInputPanel extends JPanel {
    private BufferedImage background;

    public FirstInputPanel() {
        background = (BufferedImage) Toolkit.getDefaultToolkit().createImage("forbidden-island-background.jpg");


    }
    public void paint(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
}
