import javax.swing.*;
import java.util.ArrayList;

public class ForbiddenIsland {
    IslandFrame frame2 = new IslandFrame("poggers");

    public ForbiddenIsland(int players, String diff) {

        frame2 = new IslandFrame("Forbidden Island");
        ArrayList<IslandTile> board = new ArrayList<>();
        IslandTile BreakersBridge = new IslandTile(0, 0, null, "Breakers Bridge", frame2.getImage(0));
        IslandTile BronzeBridge = new IslandTile(0, 0, null, "BronzeBridge", frame2.getImage(1));
        IslandTile CaveOfEmbers = new IslandTile(0, 0, null, "CaveOfEmbers", frame2.getImage(2));
        IslandTile CaveOfShadows = new IslandTile(0, 0, null, "CaveOfShadows", frame2.getImage(3));
        IslandTile CliffsOfAbandon = new IslandTile(0, 0, null, "CliffsOfAbandon", frame2.getImage(4));
        IslandTile CopperGate = new IslandTile(0, 0, null, "CopperGate", frame2.getImage(5));
        IslandTile CoralPalace = new IslandTile(0, 0, null, "CoralPalace", frame2.getImage(6));
        IslandTile CrimsonForest = new IslandTile(0, 0, null, "CrimsonForest", frame2.getImage(7));
        IslandTile DunesOfDeception = new IslandTile(0, 0, null, "DunesOfDeception", frame2.getImage(8));
        IslandTile FoolsLanding = new IslandTile(0, 0, null, "FoolsLanding", frame2.getImage(9));
        IslandTile GoldGate = new IslandTile(0, 0, null, "GoldGate", frame2.getImage(10));
        IslandTile HowlingGarden = new IslandTile(0, 0, null, "HowlingGarden", frame2.getImage(11));
        IslandTile IronGate = new IslandTile(0, 0, null, "IronGate", frame2.getImage(12));
        IslandTile LostLagoon = new IslandTile(0, 0, null, "LostLagoon", frame2.getImage(13));
        IslandTile MistyMarsh = new IslandTile(0, 0, null, "MistyMarsh", frame2.getImage(14));
        IslandTile Observatory = new IslandTile(0, 0, null, "Observatory", frame2.getImage(15));
        IslandTile PhantomRock = new IslandTile(0, 0, null, "PhantomRock", frame2.getImage(16));
        IslandTile SilverGate = new IslandTile(0, 0, null, "SilverGate", frame2.getImage(17));
        IslandTile TempleOfTheMoon = new IslandTile(0, 0, null, "TempleOfTheMoon", frame2.getImage(18));
        IslandTile TempleOfTheSun = new IslandTile(0, 0, null, "TempleOfTheSun", frame2.getImage(19));
        IslandTile TidalPalace = new IslandTile(0, 0, null, "TidalPalace", frame2.getImage(20));
        IslandTile TwilightHollow = new IslandTile(0, 0, null, "TwilightHollow", frame2.getImage(21));
        IslandTile WatchTower = new IslandTile(0, 0, null, "WatchTower", frame2.getImage(22));
        IslandTile WhisperingGarden = new IslandTile(0, 0, null, "WhisperingGarden", frame2.getImage(23));


    }

    public static void main() {

    }
}
