package example_paint;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	
	public MainFrame() {
				
		setTitle("컴퓨터프로그래밍2 실습 예제-그림판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container background = getContentPane();
		background.setLayout(new BorderLayout());
		
		add(new MenuPanel(), BorderLayout.NORTH);
		add(new ColorPanel(), BorderLayout.SOUTH);
		
		JPanel PaintPanel = new JPanel();
		add(PaintPanel, BorderLayout.CENTER);
		
		background.setBackground(Color.WHITE);
		setSize(750,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}