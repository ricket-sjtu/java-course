import java.awt.*;

public class Stairs4 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(110, 110);
        Graphics g = panel.getGraphics();
        for (int i = 0; i<10; i++) {
            g.drawRect(95-10*i, 5+10*i, 10*(i+1), 10);
        }
    }
}
