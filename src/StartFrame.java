import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class StartFrame extends JFrame {
        int WIDTH = 457;
        int HEIGHT = 567;
        IslandInputPanel idk;

    public StartFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        setLocation(500,200);
        setResizable(false);
        add(new IslandInputPanel(this));
        setVisible(true);

    }

}




