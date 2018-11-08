package DrawingBoard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ToolsColor extends JPanel{
	ToolsColor(){
		JButton RedBtn = new JButton("1");
		RedBtn.setBackground(Color.RED);
		add(RedBtn);
		
		JButton OrangeBtn = new JButton("2");
		OrangeBtn.setBackground(Color.ORANGE);
		add(OrangeBtn);
		
		JButton YellowBtn = new JButton("3");
		YellowBtn.setBackground(Color.YELLOW);
		add(YellowBtn);
		
		JButton GreenBtn = new JButton("4");
		GreenBtn.setBackground(Color.GREEN);
		add(GreenBtn);
		
		JButton CyanBtn = new JButton("5");
		CyanBtn.setBackground(Color.CYAN);
		add(CyanBtn);
		
		JButton BlueBtn = new JButton("6");
		BlueBtn.setBackground(Color.BLUE);
		add(BlueBtn);
		
		JButton MagentaBtn = new JButton("7");
		MagentaBtn.setBackground(Color.MAGENTA);
		add(MagentaBtn);
		
		JButton PinkBtn = new JButton("8");
		PinkBtn.setBackground(Color.PINK);
		add(PinkBtn);
		
		JButton LiteGrayBtn = new JButton("9");
		LiteGrayBtn.setBackground(Color.LIGHT_GRAY);
		add(LiteGrayBtn);
		
		JButton GrayBtn = new JButton("0");
		GrayBtn.setBackground(Color.GRAY);
		add(GrayBtn);
		
		JButton DarkGrayBtn = new JButton("-");
		DarkGrayBtn.setBackground(Color.DARK_GRAY);
		add(DarkGrayBtn);
		
		JButton BlackBtn = new JButton("=");
		BlackBtn.setBackground(Color.BLACK);
		add(BlackBtn);
	}
}

class MyActionListener implements ActionListener {
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
		JButton BrushButton = new JButton("Brush");
		JButton EraserButton = new JButton("Eraser");
		JButton BoldButton = new JButton("Light");
		
		JButton ChosenColor = new JButton(" ");
		/* 필요한 버튼 생성 자리, 추후 추가 예정*/
		
		setTitle("컴퓨터프로그래밍2 실습 예제-그림판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container background = getContentPane();
		background.setLayout(new BorderLayout());
		
		JPanel MenuPanel = new JPanel();
		MenuPanel.setBackground(Color.GRAY);
		MenuPanel.setLayout(new FlowLayout()); // 추후 수정(null)
		
		MenuPanel.add(ChosenColor); // 현재 선택한 색상
	
		MenuPanel.add(BrushButton);
		MenuPanel.add(EraserButton);
				
		BoldButton.addActionListener(new MyActionListener());
		MenuPanel.add(BoldButton);
		add(MenuPanel,BorderLayout.NORTH);
		/* UI Design후 코드 추가 예정(버튼 배치) */
		
		JPanel PaintPanel = new JPanel();
		add(PaintPanel, BorderLayout.CENTER);
		
		add(new ToolsColor(), BorderLayout.SOUTH);
		
		background.setBackground(Color.WHITE);
		setSize(750,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UI();
	}

}
