import javax.swing.*;
import java.awt.*;

public class IslandFrame extends JFrame {
        int WIDTH = 457;
        int HEIGHT = 567;


    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        setLocation(500,200);
        setResizable(true);
        add(new IslandInputPanel());
        setVisible(true);
    }
}



