package example_paint;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.util.Vector;
import javax.swing.*;

public class BrushPanel extends JPanel {

    public Vector<Point> pointVector = new Vector<>();

    public int thickness = 1;

    private Color brushColor;

    public BrushPanel() {
        this.setBackground(Color.WHITE);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }
        });
    }

    public void setColor(Color newColor) {
        this.brushColor = newColor;
    }
}
