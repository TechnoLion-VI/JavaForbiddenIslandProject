import javax.swing.*;

public class MainIslandFrame extends JFrame {
    int WIDTH = 1920;
    int HEIGHT = 1080;

    public MainIslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setResizable(true);
        add(new IslandPanel());
    }
}



