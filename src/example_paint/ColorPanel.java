package example_paint;

import java.awt.*;
import javax.swing.*;

public class ColorPanel extends JPanel {
    public ColorPanel(MainFrame mainFrame) {
        ColorMouseHandler colorMouseHandler = new ColorMouseHandler(mainFrame);

        String keyList[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "="};
        Color colorList[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
                              Color.MAGENTA, Color.PINK, Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY, Color.BLACK };

        for (int i = 0; i < 12; i++) {
            JButton button = new JButton(keyList[i]);
            button.setBackground(colorList[i]);
            this.add(button);
            button.addActionListener(colorMouseHandler);
        }
    }
}
