import javax.swing.*;

public class inputframe extends JFrame {
    int WIDTH = 650;
    int HEIGHT = 100;

    public inputframe(String framename) {
        super(framename);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        setResizable(true);
        setLocation(50,50);
        setVisible(true);
        add(new FirstInputs());
    }
}



