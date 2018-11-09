package example_paint;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class ColorHandler extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyChar()) {

		case '1':
			BrushPanel.selectedColor = Color.RED;
			break;

		case '2':
			BrushPanel.selectedColor = Color.ORANGE;
			break;

		case '3':
			BrushPanel.selectedColor = Color.YELLOW;
			break;

		case '4':
			BrushPanel.selectedColor = Color.GREEN;
			break;

		case '5':
			BrushPanel.selectedColor = Color.CYAN;
			break;

		case '6':
			BrushPanel.selectedColor = Color.BLUE;
			break;

		case '7':
			BrushPanel.selectedColor = Color.MAGENTA;
			break;

		case '8':
			BrushPanel.selectedColor = Color.PINK;
			break;

		case '9':
			BrushPanel.selectedColor = Color.LIGHT_GRAY;
			break;

		case '0':
			BrushPanel.selectedColor = Color.GRAY;
			break;
		case '-':
			BrushPanel.selectedColor = Color.DARK_GRAY;
			break;
		case '=':
			BrushPanel.selectedColor = Color.BLACK;
			break;
		}

	}

}