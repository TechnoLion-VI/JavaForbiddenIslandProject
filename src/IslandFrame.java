import javax.swing.*;
import java.awt.*;

public class IslandFrame extends JFrame {
    private void makeFrameFullSize(JFrame aFrame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width;
        int y = screenSize.height;
        aFrame.setSize(x, y);
    }

    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        //add(new IslandInputPanel());
        setVisible(true);
        setResizable(true);
    }
}



