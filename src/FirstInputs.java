
import javax.swing.*;

public class FirstInputs extends JPanel {
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;
    JRadioButton jRadioButton5;
    JRadioButton jRadioButton6;
    JRadioButton jRadioButton7;
    JButton jButton;
    ButtonGroup G1, G2;
    JLabel L1, L2;
    int numberOfPlayers;
    String levelOfDifficulty;

    public FirstInputs() {

        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jRadioButton6 = new JRadioButton();
        jRadioButton7 = new JRadioButton();
        jButton = new JButton("Confirm");
        G1 = new ButtonGroup();
        G2 = new ButtonGroup();
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
        G2.add(jRadioButton4);
        G2.add(jRadioButton5);
        G2.add(jRadioButton6);
        G2.add(jRadioButton7);

        add(jButton);


        jButton.addActionListener(e -> {
            if (jRadioButton1.isSelected())
                setNumOfPlayers(2);
            if (jRadioButton2.isSelected())
                setNumOfPlayers(3);
            if (jRadioButton3.isSelected())
                setNumOfPlayers(4);
            if (jRadioButton4.isSelected())
                setLevelOfDifficulty("Novice");
            if (jRadioButton4.isSelected())
                setLevelOfDifficulty("Normal");
            if (jRadioButton4.isSelected())
                setLevelOfDifficulty("Elite");
            if (jRadioButton4.isSelected())
                setLevelOfDifficulty("Legendary");
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

    public boolean ConfirmIsPressed() {
        if (jButton.getModel().isPressed()) {
            return true;
        }
        return false;
    }
}

