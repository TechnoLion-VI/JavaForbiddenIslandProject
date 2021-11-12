import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IslandPanel extends JPanel implements ActionListener {
    private String NumOfPlayers[] = {"2", "3", "4"};
    private String waterLevel[] = {"Novice", "Normal", "Intermediate", "Legendary"};
    private JTextField textfield1 = new JTextField ("Choose the number of players : ");
    private JComboBox amount = new JComboBox();
    private int count = 0;

    public IslandPanel() {
        for(int i = 0; i < NumOfPlayers.length; i++)
            amount.addItem(NumOfPlayers[count++]);
        textfield1.setEditable(false);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
