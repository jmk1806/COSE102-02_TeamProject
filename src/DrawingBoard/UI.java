package DrawingBoard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UI extends JFrame{
	
	JButton PencilButton = new JButton("Pencil");
	JButton EraserButton = new JButton("Eraser");
	JButton ColorButton = new JButton("Color"); 
	JButton ThicknessButton = new JButton("Thickness");
	/* 필요한 버튼 생성 자리, 추후 추가 및 수정 예정*/
	
	public UI() {
		setTitle("컴퓨터프로그래밍2 실습 예제-그림판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel MenuPanel = new JPanel();
		MenuPanel.setBackground(Color.GRAY);
		MenuPanel.setLayout(new FlowLayout()); // 추후 수정(null)
		MenuPanel.add(PencilButton);
		MenuPanel.add(EraserButton);
		MenuPanel.add(ColorButton);
		MenuPanel.add(ThicknessButton);
		add(MenuPanel,BorderLayout.NORTH);
		/* UI Design후 코드 추가 예정(버튼 배치) */
		
		setSize(400,300);
		setVisible(true);
		
	}
}

