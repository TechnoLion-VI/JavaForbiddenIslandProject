import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class IslandFrame extends JFrame {
    int WIDTH = 1920;
    int HEIGHT = 1080;
    IslandPanel i;
    public IslandFrame(String framename, ArrayList<IslandTile> board) {
        super(framename);
        setDefaultCloseOperation(3);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setVisible(true);
        i = new IslandPanel(board);
        i.repaint();
        add(i);

    }

    public IslandFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        setVisible(true);
        i = new IslandPanel();
    }
    public BufferedImage getImage(int x) {
        return i.getImage(x);
    }
    public void setBoard(ArrayList<IslandTile> arr) {

    }

}



