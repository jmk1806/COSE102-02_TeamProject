package example_paint;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    public BrushPanel brushPanel;
    public MenuPanel menuPanel;
    public ColorPanel colorPanel;
    
    public MainFrame() {
        this.setTitle("Paint Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container backgroundPanel = getContentPane();
        backgroundPanel.setLayout(new BorderLayout());

        brushPanel = new BrushPanel();
        menuPanel = new MenuPanel(this);
        colorPanel = new ColorPanel(this);
        this.add(menuPanel, BorderLayout.NORTH);
        this.add(colorPanel, BorderLayout.SOUTH);
        this.add(brushPanel, BorderLayout.CENTER);

        backgroundPanel.setBackground(Color.WHITE);

        this.addKeyListener(new ColorKeyHandler(this));
        this.setSize(750, 500);
        this.setVisible(true);
        this.setResizable(false);

        this.setFocusable(true);
        this.requestFocus();
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
