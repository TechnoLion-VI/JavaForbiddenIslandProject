import java.awt.event.WindowEvent;

public class ForbiddenIslandRunner {
    public static StartFrame frame;
    public static void main(String[] args) {
         frame = new StartFrame("Forbidden Island start");
         IslandInputPanel idk = new IslandInputPanel();
         if(idk.showUp) {
                 frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
         }



    }

}
