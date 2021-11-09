import javax.swing.*;

public class IslandFrame extends JFrame {
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 480;

    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }
}



