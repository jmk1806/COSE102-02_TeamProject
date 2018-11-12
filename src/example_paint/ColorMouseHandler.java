package example_paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorMouseHandler implements ActionListener{
    private MainFrame mainFrame;
    
    public ColorMouseHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color newColor = ((JButton)e.getSource()).getBackground();

        mainFrame.brushPanel.setColor(newColor);
        mainFrame.menuPanel.chosenColor.setBackground(newColor);

        mainFrame.requestFocus();
    }
}
