import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


public class IslandPanel extends JPanel {
    private BufferedImage one, two, three, four, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelvth, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyone, twentytwo, twentythree, twentyfour;
    private ArrayList<BufferedImage> Islands = new <BufferedImage>ArrayList();
    private BufferedImage Lion, goblet, crystal, fire, water, red, pressed;
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    Player p4 = new Player();
    String p1Role;
    String p2Role;
    String p3Role;
    String p4Role;

    public BufferedImage getImage(int i) {
        ArrayList<BufferedImage> arr = new <BufferedImage>ArrayList();
        arr.add(one);
        arr.add(two);
        arr.add(three);
        arr.add(four);
        arr.add(fifth);
        arr.add(sixth);
        arr.add(seventh);
        arr.add(eighth);
        arr.add(ninth);
        arr.add(tenth);
        arr.add(eleventh);
        arr.add(twelvth);
        arr.add(thirteen);
        arr.add(fourteen);
        arr.add(fifteen);
        arr.add(sixteen);
        arr.add(seventeen);
        arr.add(eighteen);
        arr.add(nineteen);
        arr.add(twenty);
        arr.add(twentyone);
        arr.add(twentytwo);
        arr.add(twentythree);
        arr.add(twentyfour);
        return arr.get(i);
    }


    public IslandPanel() {
        try {
            Lion = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/lion.png")));
            goblet = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/GobletOfWater.png")));
            crystal = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/CrystalStone.png")));
            fire = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Fire.png")));
            water = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/WaterLevel.JPG")));
            red = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/TickMark.jpg")));
            pressed = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Card_Pressed@2x.png")));


            one = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Breakers Bridge@2x.png")));
            two = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Bronze Gate@2x.png")));
            three = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cave of Embers@2x.png")));
            four = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cave of Shadows@2x.png")));
            fifth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Cliffs of Abandon@2x.png")));
            sixth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Copper Gate@2x.png")));
            seventh = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Coral Palace@2x.png")));
            eighth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Crimson Forest@2x.png")));
            ninth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Dunes of Deception@2x.png")));
            tenth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Fools_ Landing@2x.png")));
            eleventh = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Gold Gate@2x.png")));
            twelvth = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Howling Garden@2x.png")));
            thirteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Iron Gate@2x.png")));
            fourteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Lost Lagoon@2x.png")));
            fifteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Misty Marsh@2x.png")));
            sixteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Observatory@2x.png")));
            seventeen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Phantom Rock@2x.png")));
            eighteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Silver Gate@2x.png")));
            nineteen = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Temple of the Moon@2x.png")));
            twenty = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Temple of the Sun@2x.png")));
            twentyone = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Tidal Palace@2x.png")));
            twentytwo = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Twilight Hollow@2x.png")));
            twentythree = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Watchtower@2x.png")));
            twentyfour = ImageIO.read(Objects.requireNonNull(IslandPanel.class.getResource("Cards/Flood_Card_Whispering Garden@2x.png")));


        } catch (Exception e) {
            System.out.println("Exception error");
        }
        setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBounds(450, 20, 90, 35);
        add(panel1);
        JButton shoreButton = new JButton("Shore Up");
        shoreButton.setSize(80, 25);
        shoreButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        panel1.add(shoreButton);
        validate();

        JPanel panel2 = new JPanel();
        panel2.setBounds(550, 20, 100, 35);
        add(panel2);
        JButton treasureButton = new JButton("Get Treasure");
        treasureButton.setSize(80, 25);
        treasureButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        panel2.add(treasureButton);
        validate();

        JPanel panel3 = new JPanel();
        panel3.setBounds(660, 20, 85, 35);
        add(panel3);
        JButton captureButton = new JButton("Capture");
        captureButton.setSize(80, 25);
        captureButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        panel3.add(captureButton);
        validate();

        JPanel panel4 = new JPanel();
        panel4.setBounds(755, 20, 90, 35);
        add(panel4);
        JButton giveButton = new JButton("Give Card");
        giveButton.setSize(80, 25);
        giveButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        panel4.add(giveButton);
        validate();

        JPanel panel5 = new JPanel();
        panel5.setBounds(855, 20, 100, 35);
        add(panel5);
        JButton sandbagButton = new JButton("Use Sandbag");
        sandbagButton.setSize(80, 25);
        sandbagButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        panel5.add(sandbagButton);
        validate();

        JPanel panel6 = new JPanel();
        panel6.setBounds(965, 20, 105, 35);
        add(panel6);
        JButton helicopterButton = new JButton("Use Helicopter");
        helicopterButton.setSize(80, 25);
        helicopterButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
        panel6.add(helicopterButton);
        validate();



    }

    public void fillArray() {
        Islands.add(one);
        Islands.add(two);
        Islands.add(three);
        Islands.add(four);
        Islands.add(fifth);
        Islands.add(sixth);
        Islands.add(seventh);
        Islands.add(eighth);
        Islands.add(ninth);
        Islands.add(tenth);
        Islands.add(eleventh);
        Islands.add(twelvth);
        Islands.add(thirteen);
        Islands.add(fourteen);
        Islands.add(fifteen);
        Islands.add(sixteen);
        Islands.add(seventeen);
        Islands.add(eighteen);
        Islands.add(nineteen);
        Islands.add(twenty);
        Islands.add(twentyone);
        Islands.add(twentytwo);
        Islands.add(twentythree);
        Islands.add(twentyfour);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        int x = 890;
        int y = 100;
        int x2 = 790;
        int y2 = 200;
        int x3 = 690;
        int y3 = 300;
        fillArray();

        FirstInputs stuff = new FirstInputs();


        g.drawImage(water, 1350, 30, 150, 450, null);

        //treasures
        g.drawImage(goblet, 1230, 150, 90, 90, null);
        g.drawImage(crystal, 1230, 600, 90, 90, null);
        g.drawImage(fire, 690, 600, 90, 90, null);
        g.drawImage(Lion, 690, 150, 90, 90, null);


        //g.drawPolygon(new int[] {100, 100, 200}, new int[] {100, 300, 200}, 3);
        //g.setColor(Color.RED);
        //g.fillPolygon(new int[]{100, 100, 200}, new int[]{100, 300, 200}, 3);

        //between each level, theres a diff of 36 in height
        System.out.println(Islands.size());

        System.out.println(FirstInputs.levelOfDifficulty);
        if (FirstInputs.levelOfDifficulty.equals("Normal")) {
            g.drawPolygon(new int[]{1330, 1330, 1365}, new int[]{334, 384, 359}, 3);
            g.setColor(Color.RED);
            g.fillPolygon(new int[]{1330, 1330, 1365}, new int[]{334, 384, 359}, 3);
        } else if (FirstInputs.levelOfDifficulty.equals("Novice")) {
            g.drawPolygon(new int[]{1330, 1330, 1365}, new int[]{370, 420, 395}, 3);
            g.setColor(Color.RED);
            g.fillPolygon(new int[]{1330, 1330, 1365}, new int[]{370, 420, 395}, 3);
        } else if (FirstInputs.levelOfDifficulty.equals("Elite")) {
            g.drawPolygon(new int[]{1330, 1330, 1365}, new int[]{298, 348, 323}, 3);
            g.setColor(Color.RED);
            g.fillPolygon(new int[]{1330, 1330, 1365}, new int[]{298, 348, 323}, 3);
        } else {
            g.drawPolygon(new int[]{1330, 1330, 1365}, new int[]{262, 312, 287}, 3);
            g.setColor(Color.RED);
            g.fillPolygon(new int[]{1330, 1330, 1365}, new int[]{262, 312, 287}, 3);
        }


        for (int i = 0; i < 2; i++) {
            int j;
            g.drawImage(Islands.get(j = (int) (Math.random() * Islands.size())), x, y, 100, 100, null);
            Islands.remove(j);
            x = x + 100;
            Collections.shuffle(Islands);

        }

        for (int j = 1; j < 5; j++) {
            int h;
            g.drawImage(Islands.get(h = (int) (Math.random() * Islands.size())), x2, y2, 100, 100, null);
            Islands.remove(h);
            x2 = x2 + 100;
            Collections.shuffle(Islands);
        }

        x2 = 790;
//
        for (int k = 1; k < 5; k++) {
            int f;
            g.drawImage(Islands.get(f = (int) (Math.random() * Islands.size())), x2, y2 + 100, 100, 100, null);
            Islands.remove(f);
            x2 = x2 + 100;
            Collections.shuffle(Islands);
        }

        x2 = 790;

        for (int k = 1; k < 5; k++) {
            int e;
            g.drawImage(Islands.get(e = (int) (Math.random() * Islands.size())), x2, y2 + 200, 100, 100, null);
            Islands.remove(e);
            x2 = x2 + 100;
            Collections.shuffle(Islands);
        }

        x2 = 790;

        for (int k = 1; k < 5; k++) {
            int d;
            g.drawImage(Islands.get(d = (int) (Math.random() * Islands.size())), x2, y2 + 300, 100, 100, null);
            Islands.remove(d);
            x2 = x2 + 100;
            Collections.shuffle(Islands);
        }

        for (int u = 0; u < 2; u++) {
            int c;
            g.drawImage(Islands.get(c = (int) (Math.random() * Islands.size())), x - 200, y2 + 400, 100, 100, null);
            Islands.remove(c);
            x = x + 100;
            Collections.shuffle(Islands);
        }

        y2 = 200;

        for (int r = 0; r < 2; r++) {
            int b;
            g.drawImage(Islands.get(b = (int) (Math.random() * Islands.size())), x2, y2 + 100, 100, 100, null);
            Islands.remove(b);
            y2 = y2 + 100;
            Collections.shuffle(Islands);
        }

        for (int l = 0; l < 2; l++) {
            int a;
            g.drawImage(Islands.get(a = (int) (Math.random() * Islands.size())), x3, y3, 100, 100, null);
            Islands.remove(a);
            y3 = y3 + 100;
            Collections.shuffle(Islands);
        }
        g.setColor(Color.WHITE);
        g.setFont(new Font(Font.SERIF, Font.BOLD, 15));

        //seperate
        g.drawLine(400, 0, 400, 1080);

        if(FirstInputs.numberOfPlayers == 2) {

            g.drawString("Player 1 " + (p1Role = p1.getPlayerRoles()), 50, 80);
            g.drawString("Player 2 " + (p2Role = p2.getPlayerRoles()), 50, 260);

            //PLAYER 1
            g.drawImage(pressed, 48, 85, 70, 105, null);
            g.drawImage(pressed, 118, 85, 70, 105, null);
            g.drawImage(pressed, 188, 85, 70, 105, null);
            g.drawImage(pressed, 258, 85, 70, 105, null);
            g.drawImage(pressed, 328, 85, 70, 105, null);

            //PLAYER 2
            g.drawImage(pressed, 48, 265, 70, 105, null);
            g.drawImage(pressed, 118, 265, 70, 105, null);
            g.drawImage(pressed, 188, 265, 70, 105, null);
            g.drawImage(pressed, 258, 265, 70, 105, null);
            g.drawImage(pressed, 328, 265, 70, 105, null);
        }
        else if(FirstInputs.numberOfPlayers == 3) {
            g.drawString("Player 1 " + p1.getPlayerRoles(), 50, 80);
            g.drawString("Player 2 " + p2.getPlayerRoles(), 50, 260);
            g.drawString("Player 3 " + p3.getPlayerRoles(), 50, 440);

            //PLAYER 1
            g.drawImage(pressed, 48, 85, 70, 105, null);
            g.drawImage(pressed, 118, 85, 70, 105, null);
            g.drawImage(pressed, 188, 85, 70, 105, null);
            g.drawImage(pressed, 258, 85, 70, 105, null);
            g.drawImage(pressed, 328, 85, 70, 105, null);

            //PLAYER 2
            g.drawImage(pressed, 48, 265, 70, 105, null);
            g.drawImage(pressed, 118, 265, 70, 105, null);
            g.drawImage(pressed, 188, 265, 70, 105, null);
            g.drawImage(pressed, 258, 265, 70, 105, null);
            g.drawImage(pressed, 328, 265, 70, 105, null);

            //PLAYER 3
            g.drawImage(pressed, 48, 445, 70, 105, null);
            g.drawImage(pressed, 118, 445, 70, 105, null);
            g.drawImage(pressed, 188, 445, 70, 105, null);
            g.drawImage(pressed, 258, 445, 70, 105, null);
            g.drawImage(pressed, 328, 445, 70, 105, null);

        }
        else {
            g.drawString("Player 1 " + p1.getPlayerRoles(), 50, 80);
            g.drawString("Player 2 " + p2.getPlayerRoles(), 50, 260);
            g.drawString("Player 3 " + p3.getPlayerRoles(), 50, 440);
            g.drawString("Player 4 " + p4.getPlayerRoles(), 50, 620);
            //PLAYER 1
            g.drawImage(pressed, 48, 85, 70, 105, null);
            g.drawImage(pressed, 118, 85, 70, 105, null);
            g.drawImage(pressed, 188, 85, 70, 105, null);
            g.drawImage(pressed, 258, 85, 70, 105, null);
            g.drawImage(pressed, 328, 85, 70, 105, null);

            //PLAYER 2
            g.drawImage(pressed, 48, 265, 70, 105, null);
            g.drawImage(pressed, 118, 265, 70, 105, null);
            g.drawImage(pressed, 188, 265, 70, 105, null);
            g.drawImage(pressed, 258, 265, 70, 105, null);
            g.drawImage(pressed, 328, 265, 70, 105, null);

            //PLAYER 3
            g.drawImage(pressed, 48, 445, 70, 105, null);
            g.drawImage(pressed, 118, 445, 70, 105, null);
            g.drawImage(pressed, 188, 445, 70, 105, null);
            g.drawImage(pressed, 258, 445, 70, 105, null);
            g.drawImage(pressed, 328, 445, 70, 105, null);

            //PLAYER 4
            g.drawImage(pressed, 48, 625, 70, 105, null);
            g.drawImage(pressed, 118, 625, 70, 105, null);
            g.drawImage(pressed, 188, 625, 70, 105, null);
            g.drawImage(pressed, 258, 625, 70, 105, null);
            g.drawImage(pressed, 328, 625, 70, 105, null);
        }


        //FirstInputs stuff = new FirstInputs();
        //add 70 to x
        //if(stuff.getLevelOfDifficulty() == "Legendary")

        //BUTTONS

//        g.drawRect(450, 20, 80, 25);
//        g.setColor(Color.GRAY);
//        g.fillRect(450, 20, 80, 25);
//        g.setColor(Color.WHITE);
//        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
//        g.drawString("Shore Up", 470, 33);
//
//        g.drawRect(550, 20, 80, 25);
//        g.setColor(Color.GRAY);
//        g.fillRect(550, 20, 80, 25);
//        g.setColor(Color.WHITE);
//        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
//        g.drawString("Get Treasure", 555, 33);
//
//        g.drawRect(650, 20, 80, 25);
//        g.setColor(Color.GRAY);
//        g.fillRect(650, 20, 80, 25);
//        g.setColor(Color.WHITE);
//        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
//        g.drawString("Capture", 670, 33);
//
//        g.drawRect(750, 20, 80, 25);
//        g.setColor(Color.GRAY);
//        g.fillRect(750, 20, 80, 25);
//        g.setColor(Color.WHITE);
//        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
//        g.drawString("Give card", 770, 33);
//
//        g.drawRect(850, 20, 80, 25);
//        g.setColor(Color.GRAY);
//        g.fillRect(850, 20, 80, 25);
//        g.setColor(Color.WHITE);
//        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
//        g.drawString("Use Sandbag", 855, 33);
//
//        g.drawRect(950, 20, 80, 25);
//        g.setColor(Color.GRAY);
//        g.fillRect(950, 20, 80, 25);
//        g.setColor(Color.WHITE);
//        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 10));
//        g.drawString("Use Helicopter", 955, 33);
    }

    public void updateBoard(ArrayList<IslandTile> arr) {
        for(IslandTile i : arr) {

        }
    }


}

