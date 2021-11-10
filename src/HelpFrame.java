import javax.swing.*;

public class HelpFrame extends JFrame {
    private static final int WIDTH = 1980;
    private static final int HEIGHT = 1080;
    JLabel rules = new JLabel("rules uwu");
    public HelpFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        add(rules);
        setVisible(true);
        setResizable(true);
    }
}