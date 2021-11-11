import javax.swing.*;

public class IslandFrame extends JFrame {
    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;

    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        add(new IslandInputPanel());
        AnchorPane anchorPaneRef=new AnchorPane();
        setVisible(true);
        setResizable(true);
    }
}



