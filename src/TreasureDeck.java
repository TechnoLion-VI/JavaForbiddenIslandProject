import java.util.ArrayList;
import java.util.Collections;

public class TreasureDeck {
    private ArrayList<TreasureCard> deck;
    private ArrayList<TreasureCard> discard;
    public TreasureDeck(int seed) {

    }
    public void shuffle() {
        Collections.shuffle(discard);
        deck = discard;
        discard.clear();
    }
}
