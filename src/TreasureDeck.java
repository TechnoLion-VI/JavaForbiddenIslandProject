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
    public TreasureCard draw() {
        if(deck.size()>0) {
            return deck.remove(0);
        }
        return null;
    }
}
