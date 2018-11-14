package example_paint;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class ColorKeyHandler extends KeyAdapter {
	/* 원하는 색깔을 1 ~ = 키를 누름으로써 전환하게 해주는 클래스입니다.*/
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
    	/* 빈 칸을 채워주시면 됩니다. 모르시는 부분이 있거나 문제가 있다면
    	 *  스텝에게 문의부탁드립니다.*/
    }
}
