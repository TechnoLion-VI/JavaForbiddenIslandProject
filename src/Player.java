import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Player {
    private String role;
    private IslandTile currTile;

    public Player(String x){
        role = x;

    }

    public String getRole(){
        return role;
    }
}
