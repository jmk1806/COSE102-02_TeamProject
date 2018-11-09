package example_paint;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

class MenuPanel extends JPanel{
	public MenuPanel(){
		JButton brushBtn = new JButton("Brush");
		JButton eraserBtn = new JButton("Eraser");
		JButton boldBtn = new JButton("Light");
		JButton chosenColor = new JButton(" ");
		
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		
		add(chosenColor);
		add(brushBtn);
		add(boldBtn);
		add(eraserBtn);
		boldBtn.addActionListener(new ThicknessHandler());
	}
}