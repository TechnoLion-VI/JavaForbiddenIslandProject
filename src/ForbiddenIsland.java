import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ForbiddenIsland {
    private BufferedImage one, two, three, four, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelvth, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyone, twentytwo, twentythree, twentyfour;

    IslandFrame frame2 = new IslandFrame("  d");
    private boolean gameEnded = false;
    public BufferedImage getImage(int i) {
        ArrayList<BufferedImage> arr = new <BufferedImage>ArrayList();
        arr.add(one);
        arr.add(two);
        arr.add(three);
        arr.add(four);
        arr.add(fifth);
        arr.add(sixth);
        arr.add(seventh);
        arr.add(eighth);
        arr.add(ninth);
        arr.add(tenth);
        arr.add(eleventh);
        arr.add(twelvth);
        arr.add(thirteen);
        arr.add(fourteen);
        arr.add(fifteen);
        arr.add(sixteen);
        arr.add(seventeen);
        arr.add(eighteen);
        arr.add(nineteen);
        arr.add(twenty);
        arr.add(twentyone);
        arr.add(twentytwo);
        arr.add(twentythree);
        arr.add(twentyfour);
        return arr.get(i);
    }

    
    
    
    
    public ForbiddenIsland(int players, String diff) {
        try {
            BufferedImage Lion = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/lion.png")));
            BufferedImage goblet = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/GobletOfWater.png")));
            BufferedImage crystal = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/CrystalStone.png")));
            BufferedImage fire = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Fire.png")));
            BufferedImage water = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/WaterLevel.JPG")));
            BufferedImage red = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/TickMark.jpg")));
            BufferedImage pressed = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Card_Pressed@2x.png")));


            BufferedImage one = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Breakers Bridge@2x.png")));
            BufferedImage  two = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Bronze Gate@2x.png")));
            BufferedImage three = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cave of Embers@2x.png")));
            BufferedImage four = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cave of Shadows@2x.png")));
            BufferedImage fifth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cliffs of Abandon@2x.png")));
            BufferedImage sixth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Copper Gate@2x.png")));
            BufferedImage seventh = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Coral Palace@2x.png")));
            BufferedImage eighth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Crimson Forest@2x.png")));
            BufferedImage ninth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Dunes of Deception@2x.png")));
            BufferedImage tenth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Fools_ Landing@2x.png")));
            BufferedImage eleventh = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Gold Gate@2x.png")));
            BufferedImage twelvth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Howling Garden@2x.png")));
            BufferedImage thirteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Iron Gate@2x.png")));
            BufferedImage fourteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Lost Lagoon@2x.png")));
            BufferedImage fifteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Misty Marsh@2x.png")));
            BufferedImage sixteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Observatory@2x.png")));
            BufferedImage seventeen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Phantom Rock@2x.png")));
            BufferedImage eighteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Silver Gate@2x.png")));
            BufferedImage nineteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Temple of the Moon@2x.png")));
            BufferedImage twenty = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Temple of the Sun@2x.png")));
            BufferedImage twentyone = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Tidal Palace@2x.png")));
            BufferedImage twentytwo = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Twilight Hollow@2x.png")));
            BufferedImage twentythree = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Watchtower@2x.png")));
            BufferedImage twentyfour = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Whispering Garden@2x.png")));


        } catch (Exception e) {
            System.out.println("Exception error");
        }


        ArrayList<IslandTile> board = new ArrayList<>();
        IslandTile BreakersBridge = new IslandTile(0, 0, null, "Breakers Bridge", getImage(0));
        IslandTile BronzeBridge = new IslandTile(0, 0, null, "BronzeBridge", getImage(1));
        IslandTile CaveOfEmbers = new IslandTile(0, 0, null, "CaveOfEmbers", getImage(2));
        IslandTile CaveOfShadows = new IslandTile(0, 0, null, "CaveOfShadows", getImage(3));
        IslandTile CliffsOfAbandon = new IslandTile(0, 0, null, "CliffsOfAbandon", getImage(4));
        IslandTile CopperGate = new IslandTile(0, 0, null, "CopperGate", getImage(5));
        IslandTile CoralPalace = new IslandTile(0, 0, null, "CoralPalace", getImage(6));
        IslandTile CrimsonForest = new IslandTile(0, 0, null, "CrimsonForest", getImage(7));
        IslandTile DunesOfDeception = new IslandTile(0, 0, null, "DunesOfDeception", getImage(8));
        IslandTile FoolsLanding = new IslandTile(0, 0, null, "FoolsLanding", getImage(9));
        IslandTile GoldGate = new IslandTile(0, 0, null, "GoldGate", getImage(10));
        IslandTile HowlingGarden = new IslandTile(0, 0, null, "HowlingGarden", getImage(11));
        IslandTile IronGate = new IslandTile(0, 0, null, "IronGate", getImage(12));
        IslandTile LostLagoon = new IslandTile(0, 0, null, "LostLagoon", getImage(13));
        IslandTile MistyMarsh = new IslandTile(0, 0, null, "MistyMarsh", getImage(14));
        IslandTile Observatory = new IslandTile(0, 0, null, "Observatory", getImage(15));
        IslandTile PhantomRock = new IslandTile(0, 0, null, "PhantomRock", getImage(16));
        IslandTile SilverGate = new IslandTile(0, 0, null, "SilverGate", getImage(17));
        IslandTile TempleOfTheMoon = new IslandTile(0, 0, null, "TempleOfTheMoon", getImage(18));
        IslandTile TempleOfTheSun = new IslandTile(0, 0, null, "TempleOfTheSun", getImage(19));
        IslandTile TidalPalace = new IslandTile(0, 0, null, "TidalPalace", getImage(20));
        IslandTile TwilightHollow = new IslandTile(0, 0, null, "TwilightHollow", getImage(21));
        IslandTile WatchTower = new IslandTile(0, 0, null, "WatchTower", getImage(22));
        IslandTile WhisperingGarden = new IslandTile(0, 0, null, "WhisperingGarden", getImage(23));

        board.add(BreakersBridge);
        board.add(BronzeBridge);
        board.add(CaveOfEmbers);
        board.add(CaveOfShadows);
        board.add(CliffsOfAbandon);
        board.add(CopperGate);
        board.add(CoralPalace);
        board.add(CrimsonForest);
        board.add(DunesOfDeception);
        board.add(FoolsLanding);
        board.add(GoldGate);
        board.add(HowlingGarden);
        board.add(IronGate);
        board.add(LostLagoon);
        board.add(MistyMarsh);
        board.add(Observatory);
        board.add(PhantomRock);
        board.add(SilverGate);
        board.add(TempleOfTheMoon);
        board.add(TempleOfTheSun);
        board.add(TidalPalace);
        board.add(TwilightHollow);
        board.add(WatchTower);
        board.add(WhisperingGarden);
        Collections.shuffle(board);

        frame2 = new IslandFrame("Forbidden Island", board);
        frame2.repaint();

    }

    public static void main() {

    }
}
