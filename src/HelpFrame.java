import javax.swing.*;

public class HelpFrame extends JFrame {
    int WIDTH = 457;
    int HEIGHT = 567;

    public HelpFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p6=new JPanel();
        JPanel p7=new JPanel();
        JPanel p8=new JPanel();
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,0,457,200);
        tp.add("Page 1",p1);
        tp.add("Page 2",p2);
        tp.add("Page 3",p3);
        tp.add("Page 4",p4);
        tp.add("Page 5",p5);
        tp.add("Page 6",p6);
        tp.add("Page 7",p7);
        tp.add("Page 8",p8);

        add(tp);
        setVisible(true);
    }
}