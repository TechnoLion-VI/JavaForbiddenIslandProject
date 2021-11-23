import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class HelpFrame extends JFrame {
    int WIDTH = 650;
    int HEIGHT = 575;

    public HelpFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,0,457,567);
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p6=new JPanel();
        JPanel p7=new JPanel();
        JPanel p8=new JPanel();

        ImageIcon pg1 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page One.PNG")));
        ImageIcon pg2 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page Two.PNG")));
        ImageIcon pg3 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page Three.PNG")));
        ImageIcon pg4 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page 4.PNG")));
        ImageIcon pg5 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page Five.PNG")));
        ImageIcon pg6 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page Six.PNG")));
        ImageIcon pg7 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page Seven.PNG")));
        ImageIcon pg8 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Images/Rules Page 8.PNG")));
        JLabel label1 = new JLabel();
        label1.setIcon(pg1);
        p1.add(label1);
        JLabel label2 = new JLabel();
        label2.setIcon(pg2);
        p2.add(label2);
        JLabel label3 = new JLabel();
        label3.setIcon(pg3);
        p3.add(label3);
        JLabel label4 = new JLabel();
        label4.setIcon(pg4);
        p4.add(label4);
        JLabel label5 = new JLabel();
        label5.setIcon(pg5);
        p5.add(label5);
        JLabel label6 = new JLabel();
        label6.setIcon(pg6);
        p6.add(label6);
        JLabel label7 = new JLabel();
        label7.setIcon(pg7);
        p7.add(label7);
        JLabel label8 = new JLabel();
        label8.setIcon(pg8);
        p8.add(label8);

        add(tp, BorderLayout.CENTER);

        JScrollPane scrollp1 = new JScrollPane(p1);
        scrollp1.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp1, "Page 1");

        JScrollPane scrollp2 = new JScrollPane(p2);
        scrollp2.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp2, "Page 2");

        JScrollPane scrollp3 = new JScrollPane(p3);
        scrollp3.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp3, "Page 3");

        JScrollPane scrollp4 = new JScrollPane(p4);
        scrollp4.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp4, "Page 4");

        JScrollPane scrollp5 = new JScrollPane(p5);
        scrollp5.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp5, "Page 5");

        JScrollPane scrollp6 = new JScrollPane(p6);
        scrollp6.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp6, "Page 6");

        JScrollPane scrollp7 = new JScrollPane(p7);
        scrollp7.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp7, "Page 7");

        JScrollPane scrollp8 = new JScrollPane(p8);
        scrollp8.setPreferredSize(new Dimension(300, 300));
        tp.add(scrollp8, "Page 8");


        setResizable(true);
        setVisible(true);
    }
}