import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class IslandTile {
    private int x;
    private int y;
    private int sinkLevel;
    private String treasure;
    private String name;
    private ArrayList<BufferedImage> arr;
    private ArrayList<Player> players;

    public IslandTile(int x, int y, String treasure, String name, BufferedImage norm) {
        arr = new ArrayList<BufferedImage>();
        this.x = x;
        this.y = y;
        this.treasure = treasure;
        this.name = name;
        arr.add(norm);
    }

    public void sinkTile() {

    }

    public void shoreUp() {

    }

    public void addPlayer(Player p) {

    }

    public void removePlayer(Player p) {

    }

    public void takeTreasure() {

    }

    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {return x;}
    public int getY() {return y;}
    public BufferedImage getImage() {
        return arr.get(0);
    }
}
