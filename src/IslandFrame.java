import javax.swing.*;

public class IslandFrame extends JFrame {
    int WIDTH = 1600;
    int HEIGHT = 900;

    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        setLocation(10,10);
        setResizable(true);
        add(new IslandPanel());
        setVisible(true);
    }
}
