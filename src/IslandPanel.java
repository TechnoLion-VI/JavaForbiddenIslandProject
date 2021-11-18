import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.awt.Graphics;
import java.util.Random;
import javax.imageio.ImageIO;


public class IslandPanel extends JPanel {
    private BufferedImage one, two, three, four, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelvth, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyone, twentytwo, twentythree, twentyfour;
    private ArrayList<BufferedImage> Islands = new <BufferedImage>ArrayList();

    public IslandPanel() {
        try {
            one = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Breakers Bridge@2x.png")));
            two = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Bronze Gate@2x.png")));
            three = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cave Of Embers@2x.png")));
            four = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cave Of Shadows@2x.png")));
            fifth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cliffs Of Abandon@2x.png")));
            sixth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Copper Gate@2x.png")));
            seventh = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Coral Palace@2x.png")));
            eighth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Crimson Forest@2x.png")));
            ninth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Dunes Of Deception@2x.png")));
            tenth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Fools_Landing@2x.png")));
            eleventh = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Gold Gate@2x.png")));
            twelvth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Howling Garden@2x.png")));
            thirteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Iron Gate@2x.png")));
            fourteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Lost Lagoon@2x.png")));
            fifteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Misty Marsh@2x.png")));
            sixteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Observatory@2x.png")));
            seventeen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Phantom Rock@2x.png")));
            eighteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Silver Gate@2x.png")));
            nineteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Temple of the Moon@2x.png")));
            twenty = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Temple of the Sun@2x.png")));
            twentyone = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Tidal Palace@2x.png")));
            twentytwo = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Twilight Hollow@2x.png")));
            twentythree = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Watchtower@2x.png")));
            twentyfour = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Whispering Garden@2x.png")));

            Islands.add(one);
            Islands.add(two);
            Islands.add(three);
            Islands.add(four);
            Islands.add(fifth);
            Islands.add(sixth);
            Islands.add(seventh);
            Islands.add(eighth);
            Islands.add(ninth);
            Islands.add(tenth);
            Islands.add(eleventh);
            Islands.add(twelvth);
            Islands.add(thirteen);
            Islands.add(fourteen);
            Islands.add(fifteen);
            Islands.add(sixteen);
            Islands.add(seventeen);
            Islands.add(eighteen);
            Islands.add(nineteen);
            Islands.add(twenty);
            Islands.add(twentyone);
            Islands.add(twentytwo);
            Islands.add(twentythree);
            Islands.add(twentyfour);


        } catch (Exception e) {
            System.out.println("Exception error");
        }
    }

        public void paint(Graphics g) {
            Random generate = new Random();
            g.drawImage(one, 400, 500, 300, 300, null);
            }



        }










