package DrawingBoard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ToolsColor extends JPanel{
	ToolsColor(){
		JButton redBtn = new JButton("1");
		redBtn.setBackground(Color.RED);
		add(redBtn);
		
		JButton orangeBtn = new JButton("2");
		orangeBtn.setBackground(Color.ORANGE);
		add(orangeBtn);
		
		JButton yellowBtn = new JButton("3");
		yellowBtn.setBackground(Color.YELLOW);
		add(yellowBtn);
		
		JButton greenBtn = new JButton("4");
		greenBtn.setBackground(Color.GREEN);
		add(greenBtn);
		
		JButton cyanBtn = new JButton("5");
		cyanBtn.setBackground(Color.CYAN);
		add(cyanBtn);
		
		JButton blueBtn = new JButton("6");
		blueBtn.setBackground(Color.BLUE);
		add(blueBtn);
		
		JButton magentaBtn = new JButton("7");
		magentaBtn.setBackground(Color.MAGENTA);
		add(magentaBtn);
		
		JButton pinkBtn = new JButton("8");
		pinkBtn.setBackground(Color.PINK);
		add(pinkBtn);
		
		JButton litegrayBtn = new JButton("9");
		litegrayBtn.setBackground(Color.LIGHT_GRAY);
		add(litegrayBtn);
		
		JButton grayBtn = new JButton("0");
		grayBtn.setBackground(Color.GRAY);
		add(grayBtn);
		
		JButton darkGrayBtn = new JButton("-");
		darkGrayBtn.setBackground(Color.DARK_GRAY);
		add(darkGrayBtn);
		
		JButton blackBtn = new JButton("=");
		blackBtn.setBackground(Color.BLACK);
		add(blackBtn);
	}
}

class ThicknessHandler implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		JButton g = (JButton)e.getSource();
		if(g.getText().equals("Light"))
			g.setText("Medium");
		else if(g.getText().equals("Medium"))
			g.setText("Bold");
		else if(g.getText().equals("Bold"))
			g.setText("Extra");
		else if(g.getText().equals("Extra"))
			g.setText("Light");
	}
}

public class UI extends JFrame {
	
	public UI() {
		JButton brushButton = new JButton("Brush");
		JButton eraserButton = new JButton("Eraser");
		JButton boldButton = new JButton("Light");
		
		JButton chosenColor = new JButton(" ");
		/* 필요한 버튼 생성 자리, 추후 추가 예정*/
		
		setTitle("컴퓨터프로그래밍2 실습 예제-그림판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container background = getContentPane();
		background.setLayout(new BorderLayout());
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(Color.GRAY);
		menuPanel.setLayout(new FlowLayout()); // 추후 수정(null)
		
		menuPanel.add(chosenColor); // 현재 선택한 색상
	
		menuPanel.add(brushButton);
		menuPanel.add(eraserButton);
				
		boldButton.addActionListener(new ThicknessHandler());
		menuPanel.add(boldButton);
		add(menuPanel,BorderLayout.NORTH);
		/* UI Design후 코드 추가 예정(버튼 배치) */
		
		add(new ToolsColor(), BorderLayout.SOUTH);
		
		JPanel paintPanel = new JPanel();
		add(paintPanel, BorderLayout.CENTER);
		
		background.setBackground(Color.WHITE);
		setSize(750,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UI();
	}

}