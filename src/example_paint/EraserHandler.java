package example_paint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EraserHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		BrushPanel.selectedColor = Color.WHITE;
	}
}