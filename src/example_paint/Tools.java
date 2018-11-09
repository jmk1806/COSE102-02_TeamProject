package example_paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import java.awt.geom.*;

public class Tools extends JFrame {
	public Tools() {
		setTitle("Paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();
		JPanel workingArea = new BrushPanel();
		JPanel menu = new MenuPanel(this);

		container.add(workingArea, BorderLayout.CENTER);
		container.add(menu, BorderLayout.NORTH);

		addKeyListener(new ColorHandler());

		setFocusable(true);
		requestFocus();

		setSize(1000, 700);
		setVisible(true);
	}

	

	public static void main(String[] args) {
		new Tools();
	}
}

class BrushPanel extends JPanel {
	Vector<Point> pointList = new Vector<Point>();
	static int thickness = 1, size = 1;

	static Color selectedColor;
	Graphics graphics;
	Graphics2D graphics2d;

	public BrushPanel() {
		setBackground(Color.WHITE);
		DrawingHandler listener = new DrawingHandler();

		addMouseListener(listener);
		addMouseMotionListener(listener);
	}

	class DrawingHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			Point newPoint = e.getPoint();
			pointList.add(newPoint);
		}

		public void mouseReleased(MouseEvent e) {
			Point stopPoint = new Point(0, 0);
			pointList.add(stopPoint);
		}

		public void mouseDragged(MouseEvent e) {
			graphics = getGraphics();
			graphics2d = (Graphics2D) graphics;

			Point newPoint = e.getPoint();
			pointList.add(newPoint);

			Point start = pointList.elementAt(pointList.size() - 2);
			Point end = pointList.elementAt(pointList.size() - 1);

			graphics.setColor(selectedColor);
			graphics2d.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, 0));
			graphics2d.draw(new Line2D.Double(start.getX(), start.getY(), end.getX(), end.getY()));
		}

		public void mouseClicked(MouseEvent e) {
			graphics = getGraphics();

			graphics.fillOval(e.getX(), e.getY(), size, size);
		}
	}

}

class MenuPanel extends JPanel {
	public MenuPanel(Tools tools) {
		setBackground(Color.GRAY);
		JButton chosenColor = new JButton(" ");
		JButton brushBtn = new JButton("Brush");
		JButton eraserBtn = new JButton("Eraser");
		JButton boldBtn = new JButton("Light");

		add(chosenColor);
		add(brushBtn);
		add(eraserBtn);
		add(boldBtn);

		brushBtn.addActionListener(new BrushHandler(tools));
		eraserBtn.addActionListener(new EraserHandler());
		boldBtn.addActionListener(new ThicknessHandler(tools));
	}

	class BrushHandler implements ActionListener {
		Tools tools;

		public BrushHandler(Tools tools) {
			this.tools = tools;
		}

		public void actionPerformed(ActionEvent e) {
			BrushPanel.selectedColor = Color.BLACK;
			tools.requestFocus();
		}
	}

	class EraserHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			BrushPanel.selectedColor = Color.WHITE;
		}
	}

class ThicknessHandler implements ActionListener {
		Tools tools;

		public ThicknessHandler(Tools tools) {
			this.tools = tools;
		}

		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			if (button.getText().equals("Light")) {
				BrushPanel.thickness = 5;
				BrushPanel.size = 3;
				button.setText("Medium");

			} else if (button.getText().equals("Medium")) {
				BrushPanel.thickness = 10;
				BrushPanel.size = 5;
				button.setText("Bold");

			} else if (button.getText().equals("Bold")) {
				BrushPanel.thickness = 20;
				BrushPanel.size = 10;
				button.setText("Extra");

			} else if (button.getText().equals("Extra")) {
				BrushPanel.thickness = 1;
				BrushPanel.size = 1;
				button.setText("Light");
			}
			tools.requestFocus();
		}
	}
}