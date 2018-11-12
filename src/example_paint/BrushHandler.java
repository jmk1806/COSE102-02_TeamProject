package example_paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BrushHandler implements ActionListener {

    private MainFrame mainFrame;
    
    public BrushHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton)e.getSource()).getText().equals("Brush")) {
            Color currentBrushColor = mainFrame.menuPanel.chosenColor.getBackground();
            mainFrame.brushPanel.setColor(currentBrushColor);
        } else {
            mainFrame.brushPanel.setColor(Color.WHITE);
        }
        mainFrame.requestFocus();
    }
}
