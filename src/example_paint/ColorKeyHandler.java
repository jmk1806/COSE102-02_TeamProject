package example_paint;

import java.awt.*;
import java.awt.event.*;

public class ColorKeyHandler extends KeyAdapter {
    private MainFrame mainFrame;

    public ColorKeyHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void keyPressed(KeyEvent e) {

        Color newColor = null;

        switch (e.getKeyChar()) {
            case '1':
                newColor = Color.RED;
                break;
            case '2':
                newColor = Color.ORANGE;
                break;
            case '3':
                newColor = Color.YELLOW;
                break;
            case '4':
                newColor = Color.GREEN;
                break;
            case '5':
                newColor = Color.CYAN;
                break;
            case '6':
                newColor = Color.BLUE;
                break;
            case '7':
                newColor = Color.MAGENTA;
                break;
            case '8':
                newColor = Color.PINK;
                break;
            case '9':
                newColor = Color.LIGHT_GRAY;
                break;
            case '0':
                newColor = Color.GRAY;
                break;
            case '-':
                newColor = Color.DARK_GRAY;
                break;
            case '=':
                newColor = Color.BLACK;
                break;
        }

        if (newColor != null) {
            mainFrame.brushPanel.setColor(newColor);
            mainFrame.menuPanel.chosenColor.setBackground(newColor);
        }
    }
}