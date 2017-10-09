import java.awt.*;

public class PrettyPicture {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(220, 150);
        panel.setBackground(Color.YELLOW);

        Graphics g = panel.getGraphics();
        g.drawOval(10, 30, 100, 100);
        g.setColor(Color.BLUE);
        g.fillOval(30, 60, 20, 20);
        g.fillOval(70, 60, 20, 20);
        g.setColor(Color.RED);
        g.drawLine(40, 100, 80, 100);
    }
}
