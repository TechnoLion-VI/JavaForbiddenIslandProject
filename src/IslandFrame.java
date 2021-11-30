import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

public class IslandFrame extends JFrame {
    int WIDTH = 1920;
    int HEIGHT = 1080;
    IslandPanel i = new IslandPanel();
    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setVisible(true);
        add(i);


    }
    public BufferedImage getImage(int x) {
        return i.getImage(x);
    }

}



