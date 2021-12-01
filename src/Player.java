import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
    private String roles;
    private IslandTile currTile;

    public Player(){
        ArrayList<String> playerRoles = new ArrayList<>();
        playerRoles.add("Navigator");
        playerRoles.add("Explorer");
        playerRoles.add("Diver");
        playerRoles.add("Messenger");
        playerRoles.add("Pilot");
        playerRoles.add("Engineer");
        setPlayerRoles(playerRoles);
    }

    public void setPlayerRoles(ArrayList<String> playerRoles){
        roles = playerRoles.get((int) (Math.random() * 4));
    }

    public String getPlayerRoles(){
        return roles;
    }
}
