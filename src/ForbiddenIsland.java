import javax.swing.*;
import java.util.ArrayList;

public class ForbiddenIsland {
    IslandFrame frame2 = new IslandFrame("poggers");

    public ForbiddenIsland(int players, String diff) {

        frame2 = new IslandFrame("Forbidden Island");
        ArrayList<IslandTile> board = new ArrayList<>();
        IslandTile BreakersBridge = new IslandTile(0, 0, null, "Breakers Bridge", frame2.getImage(0));

    }

    public static void main() {

    }
}
