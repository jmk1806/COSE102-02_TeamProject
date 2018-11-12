package example_paint;

import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class ThicknessHandler implements ActionListener {
    public MainFrame mainFrame;

    private HashMap<String, String> nextThicknessMap = new HashMap<>();
    private HashMap<String, Integer> thicknessMap = new HashMap<>();

    public ThicknessHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        nextThicknessMap.put("Light", "Medium");
        nextThicknessMap.put("Medium", "Bold");
        nextThicknessMap.put("Bold", "ExtraBold");
        nextThicknessMap.put("ExtraBold", "Light");

        thicknessMap.put("Light", 1);
        thicknessMap.put("Medium", 3);
        thicknessMap.put("Bold", 5);
        thicknessMap.put("ExtraBold", 10);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String nextButtonText = nextThicknessMap.get(button.getText());
        button.setText(nextButtonText);
        mainFrame.brushPanel.thickness = thicknessMap.get(nextButtonText);

        mainFrame.requestFocus();
    }
}
