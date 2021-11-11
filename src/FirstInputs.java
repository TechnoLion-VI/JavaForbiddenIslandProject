import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class FirstInputs extends JPanel implements ActionListener {




    public FirstInputs() {

        JComboBox players = new JComboBox();
        JComboBox diff = new JComboBox();
        players.addItem("2");
        players.addItem("3");
        players.addItem("4");
        players.addItem("5");
        players.addItem("6");
        diff.addItem("Novice");
        diff.addItem("Normal");
        diff.addItem("Elite");
        diff.addItem("Legendary");
        players.addActionListener(this);

        diff.addActionListener(this);

        add(players);
        add(diff);

        setVisible(true);

    }

    public void paint(Graphics g) {

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
