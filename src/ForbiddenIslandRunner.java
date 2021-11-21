import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;

public class ForbiddenIslandRunner {
    public static StartFrame frame;
    public static void main(String[] args) {
         FlatDarculaLaf.setup();
        frame = new StartFrame("Forbidden Island start");
    }
}
