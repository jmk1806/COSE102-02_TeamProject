package example_paint;

import java.awt.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
	/* 그림판 상단의 메뉴들을 위치시키는 클래스입니다. 
	 * 버튼들이 동작할 수 있도록 코드를 수정하세요. */
    public JButton chosenColor;
    public JButton brushBtn;
    public JButton eraserBtn;
    public JButton thicknessBtn;

    public MenuPanel(MainFrame mainFrame) {
        chosenColor = new JButton(" ");
        chosenColor.setBackground(Color.BLACK);
        chosenColor.setEnabled(false);

        brushBtn = new JButton("Brush");
        eraserBtn = new JButton("Eraser");
        thicknessBtn = new JButton("Light");

        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());

        this.add(chosenColor);
        this.add(brushBtn);
        this.add(eraserBtn);
        this.add(thicknessBtn);
    }
    /* 모르시는 부분이 있거나 문제가 있다면 스텝에게 문의부탁드립니다.*/
}
