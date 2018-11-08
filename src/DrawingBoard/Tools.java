package DrawingBoard;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import java.awt.geom.*;

public class Tools extends JFrame {
	public Tools() {
		super("그림판 거지같은거어ㅓㅓ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = getContentPane();
		JPanel workingArea = new JPanelPencil();
		JPanel menu = new JPanelMenu(this);

		container.add(workingArea, BorderLayout.CENTER);
		container.add(menu, BorderLayout.NORTH);

		addKeyListener(new KeyAdapterColor());

		setFocusable(true);
		requestFocus();

		setSize(1000, 700);
		setVisible(true);
	}
	class KeyAdapterColor extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyChar()) {

			case '1':
				JPanelPencil.selectedColor=Color.RED;
				break;

			case '2':
				JPanelPencil.selectedColor=Color.ORANGE;
				break;

			case '3':
				JPanelPencil.selectedColor=Color.YELLOW;
				break;

			case '4':
				JPanelPencil.selectedColor=Color.GREEN;
				break;

			case '5':
				JPanelPencil.selectedColor=Color.CYAN;
				break;

			case '6':
				JPanelPencil.selectedColor=Color.BLUE;
				break;

			case '7':
				JPanelPencil.selectedColor=Color.MAGENTA;
				break;

			case '8':
				JPanelPencil.selectedColor=Color.PINK;
				break;

			case '9':
				JPanelPencil.selectedColor=Color.LIGHT_GRAY;
				break;

			case '0':
				JPanelPencil.selectedColor=Color.GRAY;
				break;
			case '-':
				JPanelPencil.selectedColor=Color.DARK_GRAY;
				break;
			case '=':
				JPanelPencil.selectedColor=Color.BLACK;
				break;
			}

		}

	}

	public static void main(String[] args) {
		new Tools();
	}
}

class JPanelPencil extends JPanel {
	Vector<Point> pointList = new Vector<Point>();
	static int thickness = 1, size=1;

	static Color selectedColor;
	Graphics g;
	Graphics2D g2;

	public JPanelPencil() {
		setBackground(Color.WHITE);
		NewMouseListener listener = new NewMouseListener();

		addMouseListener(listener);
		addMouseMotionListener(listener);
	}

	class NewMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			Point newPoint = e.getPoint();
			pointList.add(newPoint);
		}

		public void mouseReleased(MouseEvent e) {
			Point stopPoint = new Point(0, 0);
			pointList.add(stopPoint);
		}

		public void mouseDragged(MouseEvent e) {
			g=getGraphics();
			g2=(Graphics2D) g;
			
			Point newPoint = e.getPoint();
			pointList.add(newPoint);

			Point start = pointList.elementAt(pointList.size() - 2);
			Point end = pointList.elementAt(pointList.size() - 1);
			
			g.setColor(selectedColor);
			g2.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, 0));
			g2.draw(new Line2D.Double(start.getX(), start.getY(), end.getX(), end.getY()));
		}
		public void mouseClicked(MouseEvent e) {
			g=getGraphics();
			
			g.fillOval(e.getX(), e.getY(), size, size);
		}
	}

}

class JPanelMenu extends JPanel {
	public JPanelMenu(Tools p) {
		setBackground(Color.GRAY);
		JButton ChosenColor=new JButton(" ");
		JButton brushButton = new JButton("Brush");
		JButton eraserButton = new JButton("Eraser");
		JButton boldButton = new JButton("Light");
		
		add(ChosenColor);
		add(brushButton);
		add(eraserButton);
		add(boldButton);
		
		brushButton.addActionListener(new ActionListenerBrush(p));
		eraserButton.addActionListener(new ActionListenerEraser());
		boldButton.addActionListener(new ActionListenerThickness(p));
	}
	
	class ActionListenerBrush implements ActionListener{
		Tools p;
		public ActionListenerBrush(Tools p) {
			this.p=p;
		}
		public void actionPerformed(ActionEvent e) {
			JPanelPencil.selectedColor=Color.BLACK;
			p.requestFocus();
		}
	}
	
	class ActionListenerEraser implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JPanelPencil.selectedColor=Color.WHITE;
		}
	}

	class ActionListenerThickness implements ActionListener {
		Tools p;
		public ActionListenerThickness(Tools p) {
			this.p=p;
		}
		public void actionPerformed(ActionEvent e) {
			JButton g = (JButton) e.getSource();
			if (g.getText().equals("Light")) {
				JPanelPencil.thickness = 5;
				JPanelPencil.size=3;
				g.setText("Medium");
				
			} else if (g.getText().equals("Medium")) {
				JPanelPencil.thickness = 10;
				JPanelPencil.size=5;
				g.setText("Bold");
				
			} else if (g.getText().equals("Bold")) {
				JPanelPencil.thickness = 20;
				JPanelPencil.size=10;
				g.setText("Extra");
				
			} else if (g.getText().equals("Extra")) {
				JPanelPencil.thickness = 1;
				JPanelPencil.size=1;
				g.setText("Light");
			}
			p.requestFocus();
		}
	}
}
