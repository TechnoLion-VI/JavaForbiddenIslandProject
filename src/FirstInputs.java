import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstInputs extends JPanel implements ActionListener {

    public FirstInputs() {
        JRadioButton jRadioButton1;
        JRadioButton jRadioButton2;
        JRadioButton jRadioButton3;
        JRadioButton jRadioButton4;
        JRadioButton jRadioButton5;
        JRadioButton jRadioButton6;
        JRadioButton jRadioButton7;
        JButton jButton;
        ButtonGroup G1;
        JLabel L1, L2;
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jButton = new JButton("Confirm");
        G1 = new ButtonGroup();
        L1 = new JLabel("Pick Number Of Players: ");
        L2 = new JLabel("           Pick Level Of Difficulty: ");
        jRadioButton1.setText("2");
        jRadioButton2.setText("3");
        jRadioButton3.setText("4");
        jRadioButton4.setText("Novice");
        jRadioButton5.setText("Normal");
        jRadioButton6.setText("Elite");
        jRadioButton7.setText("Legendary");

        this.add(L1);
        this.add(jRadioButton1);
        this.add(jRadioButton2);
        this.add(jRadioButton3);
        this.add(L2);
        this.add(jRadioButton4);
        this.add(jRadioButton5);
        this.add(jRadioButton6);
        this.add(jRadioButton7);
        this.add(jButton);

        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        G1.add(jRadioButton3);
        G1.add(jRadioButton4);
        G1.add(jRadioButton5);
        G1.add(jRadioButton6);
        G1.add(jRadioButton7);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}
