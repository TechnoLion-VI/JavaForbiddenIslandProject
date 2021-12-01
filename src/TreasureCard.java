public class TreasureCard {

    private String treasure;
    private String cardType;
    private String action;
    public TreasureCard(String treasure, String type, String act) {
        this.treasure = treasure;
        cardType = type;
        action = act;
    }
    public String getAction() {
        return action;
    }

    public String getTreasure() {
        return treasure;
    }

    public String getCardType() {
        return cardType;
    }
}
