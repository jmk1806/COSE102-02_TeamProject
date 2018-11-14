package example_paint;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	/* main함수가 위치하여 있고, 종합적인 Panel들을 붙이는 클래스입니다.
	 * 정상적으로 작동할 수 있도록 코드를 수정해주세요.*/
    public BrushPanel brushPanel;
    public MenuPanel menuPanel;
    public ColorPanel colorPanel;
    
    public MainFrame() {
        this.setTitle("Paint Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container backgroundPanel = getContentPane();
        backgroundPanel.setLayout(new BorderLayout());

        brushPanel = new BrushPanel();
        menuPanel = new MenuPanel(this);
        colorPanel = new ColorPanel(this);
        this.add(menuPanel, BorderLayout.NORTH);
        this.add(colorPanel, BorderLayout.SOUTH);
        this.add(brushPanel, BorderLayout.CENTER);

        backgroundPanel.setBackground(Color.WHITE);

        this.setSize(750, 500);
        this.setVisible(true);
        this.setResizable(false);

        this.setFocusable(true);
        this.requestFocus();
    }
    /* 모르시는 부분이 있거나 문제가 있다면 스텝에게 문의부탁드립니다.*/
    public static void main(String[] args) {
        new MainFrame();
    }
}
