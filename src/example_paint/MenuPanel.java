package example_paint;

import java.awt.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
    public JButton chosenColor;
    public JButton brushBtn;
    public JButton eraserBtn;
    public JButton thicknessBtn;

    public MenuPanel(MainFrame mainFrame) {
        chosenColor = new JButton(" ");
        chosenColor.setBackground(Color.BLACK);
        chosenColor.setEnabled(false);

        brushBtn = new JButton("Brush");
        eraserBtn = new JButton("Eraser");
        thicknessBtn = new JButton("Light");

        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());

        brushBtn.addActionListener(new BrushHandler(mainFrame));
        eraserBtn.addActionListener(new BrushHandler(mainFrame));
        thicknessBtn.addActionListener(new ThicknessHandler(mainFrame));

        this.add(chosenColor);
        this.add(brushBtn);
        this.add(eraserBtn);
        this.add(thicknessBtn);
    }
}
