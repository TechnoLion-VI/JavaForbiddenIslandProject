import java.util.ArrayList;
import java.util.Collections;

public class TreasureDeck {
    private ArrayList<TreasureCard> deck;
    private ArrayList<TreasureCard> discard;
    public TreasureDeck(int seed) {
        deck = new ArrayList<TreasureCard>();
        TreasureCard waterRises = new TreasureCard(null, "water", null);
        TreasureCard fire = new TreasureCard("fire", "treasure", null);
        TreasureCard water = new TreasureCard("water", "treasure", null);
        TreasureCard crystal = new TreasureCard("crystal", "treasure", null);
        TreasureCard lion = new TreasureCard("lion", "treasure", null);
        TreasureCard heli = new TreasureCard(null, "action", "helicopter");
        TreasureCard sand = new TreasureCard(null, "action", "sandbag");
        deck.add(waterRises);
        deck.add(waterRises);
        deck.add(heli);
        deck.add(heli);
        deck.add(heli);
        deck.add(sand);
        deck.add(sand);
        for(int x = 0; x<5;x++) {
            deck.add(fire);
            deck.add(water);
            deck.add(crystal);
            deck.add(lion);
        }
        Collections.shuffle(deck);

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
    public void discard(TreasureCard c) {
        discard.add(c);
    }
}
