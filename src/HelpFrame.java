import javax.swing.*;

public class HelpFrame extends JFrame {
    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;
    JLabel rules = new JLabel("<html>Your team of  adventurers must work together to keep Forbidden Island from sinking, in order \n" +
            "to buy enough time to capture its four treasures. Once you’ve captured them, you must make it \n" +
            "to Fools’ Landing and escape by helicopter to win. If  however, <br/>the island sinks before you can \n" +
            "complete your tasks, the mission ends in defeat!<html> Place the 4 treasure figurines around the island. Separate the cards into Flood Deck, Treasure deck, and Action deck.Shuffle the Flood deck and place it face\n" +
            "down on one side of the island to form the Flood draw pile. Draw the top 6 cards (1 at a time)\n" +
            "and place them face up next to the draw pile to form the Flood discard pile. For each card\n" +
            "drawn, flip the corresponding Island tile over to its “flooded” (blue and white) side.<html>Shuffle the 6 Adventurer cards and randomly deal 1 to each\n" +
            "player. Each of you will take on the role of an adventurer with\n" +
            "a special power that only you can do during the game. Take a\n" +
            "moment to read aloud your roles and powers written on the\n" +
            "bottom of the cards so that your teammates know your strengths.The Explorer may also move diagonally.\n" +
            "\n" +
            "The Pilot may move to any tile once per turn for 1 action.\n" +
            " The Navigator may move other players up to 2 adjacent tiles per action.\n" +
            " The Diver may move through one or more adjacent missing and/or\n" +
            " flooded tiles for 1 action. Take a pawn matching the color of your Adventurer card and place it on the\n" +
            "corresponding Island tile.Thoroughly shuffle the Treasure deck and deal 2 cards to each\n" +
            "player. Place your cards face up in front of you so that both\n" +
            "you and your teammates can easily see them. If anyone gets\n" +
            "a Waters Rise! card, give them a replacement card and shuffle\n" +
            "the Waters Rise! card back into the Treasure deck. Place the\n" +
            "Treasure deck face down by one side of the island Place the Water Level marker\n" +
            "on the left side of the Water Meter and set it to the appropriate starting\n" +
            "difficulty level, according to the type of game you want to play. (For example,\n" +
            "if this is your first time playing a cooperative game, set it to the Novice level Place the Water Level marker\n" +
            "on the left side of the Water Meter and set it to the appropriate starting\n" +
            "difficulty level, according to the type of game you want to play. You may, for 1 action, capture a treasure by discarding 4 matching Treasure cards from your\n" +
            "hand if your pawn is on either corresponding island tile:After taking actions, you must draw 2 cards from the top of the Treasure deck and add them to\n" +
            "your face up hand. Draw cards 1 at a time. If you draw a Waters Rise! card, do not add it to your\n" +
            "hand, but follow the instructions on the card and then discard it to the Treasure discard pile.Move the Water Level marker up to cover the next tick mark on the\n" +
            "Water Meter. Note how many cards will now be drawn at the end of\n" +
            "your turn by looking at the number on the right of the meter.\n" +
            "2. Take all of the cards from the Flood discard pile, shuffle them, and\n" +
            "then place them face down on top of the Flood draw pile. This means\n" +
            "that previously drawn cards will be drawn again soon!\n" +
            "3. Discard the Waters Rise! card to the\n" +
            "Treasure discard pile.  These cards are taken into your hand and can be played at\n" +
            "any time — even on another player’s turn. Playing a Special Action\n" +
            "card does not require an action. Discard these cards to the Treasure\n" +
            "discard pile immediately when played. \n + You may only have 5 cards in your hand. If a pawn is on a tile that becomes flooded, lift the pawn off the tile, flip it and then return\n" +
            "the pawn to the tile.\n" +
            "If a pawn is on a tile that must be removed, it must immediately “swim” to an adjacent tile (up,\n" +
            "down, left, or right) that is still part of the island (even flooded). If a pawn is on a tile that is\n" +
            "removed and cannot move to an adjacent tile, it sinks into the abyss and everyone loses the game!\nIf the Flood draw pile ever runs out, immediately shuffle the Flood discard pile and stack\n" +
            "the cards face down to form a new Flood draw pile. If this happens in the middle of a turn,\n" +
            "continue drawing Flood cards as necessary from the new pile.• If you draw a Waters Rise! card, you do not get a replacement card.\n" +
            "• If you draw 2 Waters Rise! cards in a row, shuffle the Flood discard pile only once but\n" +
            "move the Water Level marker up 2 tick marks.\n" +
            "• If you draw a Waters Rise! card but there are no cards in the Flood discard pile, just move\n" +
            "the Water Level marker up 1 tick mark.There are four possible ways to lose:\n" +
            "1. If both Temples, Caves, Palaces, or Gardens tiles sink before you collect their respective treasures.\n" +
            "2. If the Fools’ Landing tile sinks.\n" +
            "3. If any player is on an Island tile that sinks and there is no adjacent tile to swim to.\n" +
            "4. If the water level reaches the skull and crossbones.");

    public HelpFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        add(rules);
        setResizable(true);
        setVisible(true);
    }
}