package example_paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrushHandler implements ActionListener {
    public MenuPanel menuPanel;
    public BrushPanel brushPanel;

    public BrushHandler(MenuPanel menuPanel, BrushPanel brushPanel) {
        this.menuPanel = menuPanel;
        this.brushPanel = brushPanel;
    }

    public void actionPerformed(ActionEvent e) {
        if (((JButton)e.getSource()).getText().equals("Brush")) {
            Color backgroundColor = menuPanel.chosenColor.getBackground();
            brushPanel.setColor(backgroundColor);
        } else {
            brushPanel.setColor(Color.WHITE);
        }
    }
}
