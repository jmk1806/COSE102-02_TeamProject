package DrawingBoard;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tools extends JFrame{
	public Tools() {
		setContentPane(new PaintPanel());
	}
}

class PaintPanel extends JPanel{
	private Vector<Point> vStart = new Vector<Point>();
	private Vector<Point> vEnd = new Vector<Point>();
	
	public PaintPanel() {
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				Point startP = e.getPoint();
				vStart.add(startP);
			}
			public void mouseReleased(MouseEvent e) {
				Point endP = e.getPoint();
				vEnd.add(endP);
				repaint();
			}
		});
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE); // 추후 변수로 변경 예정
		
		for(int i=0;i<vStart.size();i++) {
			Point s = vStart.elementAt(i);
			Point e = vEnd.elementAt(i);
			
			g.drawLine((int)s.getX(),(int)s.getY(),(int)e.getX(),(int)e.getY());
		}
	}
}
