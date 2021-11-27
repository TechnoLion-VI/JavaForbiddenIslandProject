import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class IslandFrame extends JFrame {
    int WIDTH = 1920;
    int HEIGHT = 1080;

    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setVisible(true);
        add(new IslandPanel());


    }

}



