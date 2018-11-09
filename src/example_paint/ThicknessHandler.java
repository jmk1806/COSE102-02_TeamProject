package example_paint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ThicknessHandler implements ActionListener {
    public MainFrame mainFrame;

    private HashMap<String, Integer> thicknessMap = new HashMap<>();
    private HashMap<String, Integer> sizeMap = new HashMap<>();

    public ThicknessHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;

        thicknessMap.put("Light", 1);
        thicknessMap.put("Medium", 3);
        thicknessMap.put("Bold", 5);
        thicknessMap.put("ExtraBold", 10);

        sizeMap.put("Light", 1);
        sizeMap.put("Medium", 5);
        sizeMap.put("Bold", 10);
        sizeMap.put("ExtraBold", 20);
    }

    public void actionPerformed (ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String nextButtonText = "";

        switch(button.getText()) {
            case "Light":
                nextButtonText = "Medium";
                break;
            case "Medium":
                nextButtonText = "Bold";
                break;
            case "Bold":
                nextButtonText = "ExtraBold";
                break;
            case "ExtraBold":
                nextButtonText = "Light";
                break;
        }

        button.setText(nextButtonText);
        mainFrame.brushPanel.thickness = thicknessMap.get(nextButtonText);
        mainFrame.brushPanel.size = sizeMap.get(nextButtonText);

        mainFrame.requestFocus();
    }
}
