package example_paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BrushHandler implements ActionListener {

	private MainFrame mainFrame;
	
    public BrushHandler(MainFrame mainFrame) {
    	this.mainFrame= mainFrame;
    }

    public void actionPerformed(ActionEvent e) {
        if (((JButton)e.getSource()).getText().equals("Brush")) {
            Color backgroundColor = mainFrame.menuPanel.chosenColor.getBackground();
            mainFrame.brushPanel.setColor(backgroundColor);
        } 
        else {
            mainFrame.brushPanel.setColor(Color.WHITE);
        }
        
        mainFrame.requestFocus();
        
    }
}
