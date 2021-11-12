import javax.swing.*;

public class HelpFrame extends JFrame {
    int WIDTH = 457;
    int HEIGHT = 567;

    public HelpFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        rules.setText("\"<html>Your team of  adventurers must work together to keep Forbidden Island from sinking, in order \\n\" +\n" +
                "            to buy enough time to capture its four treasures. Once you’ve captured them, you must make it \\n\" +\n" +
                "            to Fools’ Landing and escape by helicopter to win. If  however, <br/>the island sinks before you can \\n\" +\n" +
                "            complete your tasks, the mission ends in defeat!<html> Place the 4 treasure figurines around the island. Separate the cards into Flood Deck, Treasure deck, and Action deck.Shuffle the Flood deck and place it face\\n\" +\n" +
                "            down on one side of the island to form the Flood draw pile. Draw the top 6 cards (1 at a time)\\n\" +\n" +
                "            and place them face up next to the draw pile to form the Flood discard pile. For each card\\n\" +\n" +
                "            drawn, flip the corresponding Island tile over to its “flooded” (blue and white) side.<html>Shuffle the 6 Adventurer cards and randomly deal 1 to each\\n\" +\n" +
                "            player. Each of you will take on the role of an adventurer with\\n\" +\n" +
                "            a special power that only you can do during the game. Take a\\n\" +\n" +
                "            moment to read aloud your roles and powers written on the\\n\" +\n" +
                "            bottom of the cards so that your teammates know your strengths.The Explorer may also move diagonally.\\n\" +\n" +
                "            \\n\" +\n" +
                "            The Pilot may move to any tile once per turn for 1 action.\\n\" +\n" +
                "             The Navigator may move other players up to 2 adjacent tiles per action.\\n\" +\n" +
                "             The Diver may move through one or more adjacent missing and/or\\n\" +\n" +
                "             flooded tiles for 1 action. Take a pawn matching the color of your Adventurer card and place it on the\\n\" +\n" +
                "            corresponding Island tile.Thoroughly shuffle the Treasure deck and deal 2 cards to each\\n\" +\n" +
                "            player. Place your cards face up in front of you so that both\\n\" +\n" +
                "            you and your teammates can easily see them. If anyone gets\\n\" +\n" +
                "            a Waters Rise! card, give them a replacement card and shuffle\\n\" +\n" +
                "            the Waters Rise! card back into the Treasure deck. Place the\\n\" +\n" +
                "            Treasure deck face down by one side of the island Place the Water Level marker\\n\" +\n" +
                "            on the left side of the Water Meter and set it to the appropriate starting\\n\" +\n" +
                "            difficulty level, according to the type of game you want to play. (For example,\\n\" +\n" +
                "            if this is your first time playing a cooperative game, set it to the Novice level Place the Water Level marker\\n\" +\n" +
                "            on the left side of the Water Meter and set it to the appropriate starting\\n\" +\n" +
                "            difficulty level, according to the type of game you want to play. You may, for 1 action, capture a treasure by discarding 4 matching Treasure cards from your\\n\" +\n" +
                "            hand if your pawn is on either corresponding island tile:After taking actions, you must draw 2 cards from the top of the Treasure deck and add them to\\n\" +\n" +
                "            your face up hand. Draw cards 1 at a time. If you draw a Waters Rise! card, do not add it to your\\n\" +\n" +
                "            hand, but follow the instructions on the card and then discard it to the Treasure discard pile.Move the Water Level marker up to cover the next tick mark on the\\n\" +\n" +
                "            Water Meter. Note how many cards will now be drawn at the end of\\n\" +\n" +
                "            your turn by looking at the number on the right of the meter.\\n\" +\n" +
                "            2. Take all of the cards from the Flood discard pile, shuffle them, and\\n\" +\n" +
                "            then place them face down on top of the Flood draw pile. This means\\n\" +\n" +
                "            that previously drawn cards will be drawn again soon!\\n\" +\n" +
                "            3. Discard the Waters Rise! card to the\\n\" +\n" +
                "            Treasure discard pile.  These cards are taken into your hand and can be played at\\n\" +\n" +
                "            any time — even on another player’s turn. Playing a Special Action\\n\" +\n" +
                "            card does not require an action. Discard these cards to the Treasure\\n\" +\n" +
                "            discard pile immediately when played. \\n + You may only have 5 cards in your hand. If a pawn is on a tile that becomes flooded, lift the pawn off the tile, flip it and then return\\n\" +\n" +
                "            the pawn to the tile.\\n\" +\n" +
                "            If a pawn is on a tile that must be removed, it must immediately “swim” to an adjacent tile (up,\\n\" +\n" +
                "            down, left, or right) that is still part of the island (even flooded). If a pawn is on a tile that is\\n\" +\n" +
                "            removed and cannot move to an adjacent tile, it sinks into the abyss and everyone loses the game!\\nIf the Flood draw pile ever runs out, immediately shuffle the Flood discard pile and stack\\n\" +\n" +
                "            the cards face down to form a new Flood draw pile. If this happens in the middle of a turn,\\n\" +\n" +
                "            continue drawing Flood cards as necessary from the new pile.• If you draw a Waters Rise! card, you do not get a replacement card.\\n\" +\n" +
                "            • If you draw 2 Waters Rise! cards in a row, shuffle the Flood discard pile only once but\\n\" +\n" +
                "            move the Water Level marker up 2 tick marks.\\n\" +\n" +
                "            \"• If you draw a Waters Rise! card but there are no cards in the Flood discard pile, just move\\n\" +\n" +
                "            \"the Water Level marker up 1 tick mark.There are four possible ways to lose:\\n\" +\n" +
                "            \"1. If both Temples, Caves, Palaces, or Gardens tiles sink before you collect their respective treasures.\\n\" +\n" +
                "            \"2. If the Fools’ Landing tile sinks.\\n\" +\n" +
                "            \"3. If any player is on an Island tile that sinks and there is no adjacent tile to swim to.\\n\" +\n" +
                "            \"4. If the water level reaches the skull and crossbones. \\n\" +\n" +
                "            \"HAVE FUN AND BE COOPERATIVE WITH YOUR TEAM!\");");

        add(rules);

        setResizable(true);
        setVisible(true);
    }

    JLabel rules = new JLabel();

}