package example_paint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorPanel extends JPanel {
	private MainFrame mainFrame;
	
	public ColorPanel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		
        JButton redBtn = new JButton("1");
        redBtn.setBackground(Color.RED);

        JButton orangeBtn = new JButton("2");
        orangeBtn.setBackground(Color.ORANGE);

        JButton yellowBtn = new JButton("3");
        yellowBtn.setBackground(Color.YELLOW);

        JButton greenBtn = new JButton("4");
        greenBtn.setBackground(Color.GREEN);

        JButton cyanBtn = new JButton("5");
        cyanBtn.setBackground(Color.CYAN);

        JButton blueBtn = new JButton("6");
        blueBtn.setBackground(Color.BLUE);

        JButton magentaBtn = new JButton("7");
        magentaBtn.setBackground(Color.MAGENTA);

        JButton pinkBtn = new JButton("8");
        pinkBtn.setBackground(Color.PINK);

        JButton lightGrayBtn = new JButton("9");
        lightGrayBtn.setBackground(Color.LIGHT_GRAY);

        JButton grayBtn = new JButton("0");
        grayBtn.setBackground(Color.GRAY);

        JButton darkGrayBtn = new JButton("-");
        darkGrayBtn.setBackground(Color.DARK_GRAY);

        JButton blackBtn = new JButton("=");
        blackBtn.setBackground(Color.BLACK);
        
        JButton buttonList[] = { redBtn, orangeBtn, yellowBtn, greenBtn,
                                 cyanBtn, blueBtn, magentaBtn, pinkBtn,
                                 lightGrayBtn, grayBtn, darkGrayBtn, blackBtn
                                };

        for (JButton button:buttonList) this.add(button);
        for (JButton button:buttonList) button.addActionListener(new ColorMouseHandler(mainFrame));
    }
}
