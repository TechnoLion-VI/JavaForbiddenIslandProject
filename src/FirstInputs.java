
import javax.swing.*;
import java.awt.*;

public class FirstInputs extends JPanel {
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JRadioButton jRadioButton6;
    private JRadioButton jRadioButton7;
    private JButton jButton;
    private ButtonGroup G1, G2;
    private JLabel L1, L2;
    public static int numberOfPlayers;
    public static String levelOfDifficulty;
    private Frame frame;

    public FirstInputs() {

        L1 = new JLabel("Pick Number Of Players: ");
        G1 = new ButtonGroup();
        jRadioButton1 = new JRadioButton();
        jRadioButton1.setText("2");
        jRadioButton1.setActionCommand("2");
        jRadioButton2 = new JRadioButton();
        jRadioButton2.setText("3");
        jRadioButton2.setActionCommand("3");
        jRadioButton3 = new JRadioButton();
        jRadioButton3.setText("4");
        jRadioButton3.setActionCommand("4");

        L2 = new JLabel("\nPick Level Of Difficulty: ");
        G2 = new ButtonGroup();
        jRadioButton4 = new JRadioButton();
        jRadioButton4.setText("Novice");
        jRadioButton4.setActionCommand("Novice");
        jRadioButton5 = new JRadioButton();
        jRadioButton5.setText("Normal");
        jRadioButton5.setActionCommand("Normal");
        jRadioButton6 = new JRadioButton();
        jRadioButton6.setText("Elite");
        jRadioButton6.setActionCommand("Elite");
        jRadioButton7 = new JRadioButton();
        jRadioButton7.setText("Legendary");
        jRadioButton7.setActionCommand("Legendary");
        jButton = new JButton("Confirm");

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
        G2.add(jRadioButton4);
        G2.add(jRadioButton5);
        G2.add(jRadioButton6);
        G2.add(jRadioButton7);

        add(jButton);


        jButton.addActionListener(e -> {
            setNumOfPlayers(Integer.parseInt(G1.getSelection().getActionCommand()));
            setLevelOfDifficulty(G2.getSelection().getActionCommand());
            frame = new MainIslandFrame("Forbidden Island");
            setVisible(false);
        });
    }

    public int getNumOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumOfPlayers(int number) {
        numberOfPlayers = number;
    }

    public String getLevelOfDifficulty() {
        return levelOfDifficulty;
    }

    public void setLevelOfDifficulty(String level) {
        levelOfDifficulty = level;
    }
}

