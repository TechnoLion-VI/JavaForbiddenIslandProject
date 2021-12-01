import java.util.Collections;
import java.util.Stack;

public class GameState {
    private Stack<String> playerRoles;
    public static int numPlayers;

    public GameState(int numPlayers){
        playerRoles = new Stack<>();
        playerRoles.push("Navigator");
        playerRoles.push("Explorer");
        playerRoles.push("Diver");
        playerRoles.push("Messenger");
        playerRoles.push("Pilot");
        playerRoles.push("Engineer");
        Collections.shuffle(playerRoles);

        Player[] allPlayers = new Player[numPlayers];
        for(int i = 0; i < numPlayers; i++){
            allPlayers[i] = new Player(playerRoles.pop());
        }

        this.numPlayers = numPlayers;

    }
}
