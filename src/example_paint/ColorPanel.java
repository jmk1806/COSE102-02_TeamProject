package example_paint;

import java.awt.*;
import javax.swing.*;

public class ColorPanel extends JPanel {
	/* 색지정버튼들이 위치한 패널입니다. 버튼들이 동작할 수 있도록 수정해주세요. */
    public ColorPanel(MainFrame mainFrame) {
        ColorMouseHandler colorMouseHandler = new ColorMouseHandler(mainFrame);

        String keyList[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "="};
        Color colorList[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
                              Color.MAGENTA, Color.PINK, Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY, Color.BLACK };

        for (int i = 0; i < 12; i++) {
            JButton button = new JButton(keyList[i]);
            button.setBackground(colorList[i]);
            this.add(button);
        }
        /* 모르시는 부분이 있거나 문제가 있다면 스텝에게 문의부탁드립니다. */
    }
}
