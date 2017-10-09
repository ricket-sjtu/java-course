import java.awt.*;

public class Draw {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        panel.setBackground(Color.BLUE);
        Graphics g = panel.getGraphics();
        g.setColor(Color.RED);
        int x1=200, y1=200, x2=350, y2=425;
        int x=10, y=10;
        int width=150, height=150;
        g.drawLine(x1, y1, x2, y2);
        g.drawOval(x1, y1, width, height);
        g.drawRect(x2, y2, width, height);

        g.fillOval(x1, y1, width, height);
        g.fillRect(x2, y2, width, height);

    }
}
