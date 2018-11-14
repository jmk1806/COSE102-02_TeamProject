package example_paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BrushHandler implements ActionListener {
	/* BrushHandler는 Brush 버튼 클릭시 Brush툴로 변환하게 해주는 클래스입니다.  */
    private MainFrame mainFrame;
    
    public BrushHandler(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	/* 빈 칸을 채워주시면 됩니다. 모르시는 부분이 있거나 문제가 있다면
    	 *  스텝에게 문의부탁드립니다.*/
    }
}
