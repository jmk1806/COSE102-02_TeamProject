package example_paint;

import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class ThicknessHandler implements ActionListener {
	/* 굵기 조절 버튼의 Text를 전환하는 클래스입니다.*/
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
    	/* 빈 칸을 채워주시면 됩니다. 모르시는 부분이 있거나 문제가 있다면
    	 *  스텝에게 문의부탁드립니다.*/
    }
}
