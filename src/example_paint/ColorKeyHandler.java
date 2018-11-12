package example_paint;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class ColorKeyHandler extends KeyAdapter {
    private MainFrame mainFrame;
    private HashMap<Character, Color> colorMap = new HashMap<>();

    public ColorKeyHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        colorMap.put('1', Color.RED);
        colorMap.put('2', Color.ORANGE);
        colorMap.put('3', Color.YELLOW);
        colorMap.put('4', Color.GREEN);
        colorMap.put('5', Color.CYAN);
        colorMap.put('6', Color.BLUE);
        colorMap.put('7', Color.MAGENTA);
        colorMap.put('8', Color.PINK);
        colorMap.put('9', Color.LIGHT_GRAY);
        colorMap.put('0', Color.GRAY);
        colorMap.put('-', Color.DARK_GRAY);
        colorMap.put('=', Color.BLACK);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char inputChar = e.getKeyChar();

        if (colorMap.containsKey(inputChar)) {
            Color newColor = colorMap.get(inputChar);
            mainFrame.brushPanel.setColor(newColor);
            mainFrame.menuPanel.chosenColor.setBackground(newColor);
        }
    }
}
