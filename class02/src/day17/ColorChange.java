package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChange {
	JFrame frame;
	JPanel panel, slPan, rPan, gPan, bPan;
	JSlider sred, sgreen, sblue;
	int red, green, blue;
	public ColorChange() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// panel
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		
		slPan = new JPanel(new GridLayout(3, 1));
		
		rPan = new JPanel(new BorderLayout());
		gPan = new JPanel(new BorderLayout());
		bPan = new JPanel(new BorderLayout());
		
		rPan.setPreferredSize(new Dimension(300, 20));
		gPan.setPreferredSize(new Dimension(300, 20));
		bPan.setPreferredSize(new Dimension(300, 20));
		
		JLabel rlbl = new JLabel("red : ");
		rPan.add(rlbl, BorderLayout.WEST);
		JLabel glbl = new JLabel("green : ");
		gPan.add(glbl, BorderLayout.WEST);
		JLabel blbl = new JLabel("blue : ");
		bPan.add(blbl, BorderLayout.WEST);
		
		// slider
		sred = new JSlider(0, 255, 255);
		sgreen = new JSlider(0, 255, 255);
		sblue = new JSlider(0, 255, 255);
		
		sred.setName("red");
		sgreen.setName("green");
		sblue.setName("blue");
		
		SlideEvt evt = new SlideEvt(this);
		
		sred.addChangeListener(evt);
		sgreen.addChangeListener(evt);
		sblue.addChangeListener(evt);
		
		rPan.add(sred, BorderLayout.CENTER);
		gPan.add(sgreen, BorderLayout.CENTER);
		bPan.add(sblue, BorderLayout.CENTER);
		
		rlbl.setPreferredSize(new Dimension(50, 20));
		glbl.setPreferredSize(new Dimension(50, 20));
		blbl.setPreferredSize(new Dimension(50, 20));
		
		rlbl.setHorizontalAlignment(JLabel.RIGHT);
		glbl.setHorizontalAlignment(JLabel.RIGHT);
		blbl.setHorizontalAlignment(JLabel.RIGHT);
		
		slPan.add(rPan);
		slPan.add(gPan);
		slPan.add(bPan);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(slPan, BorderLayout.SOUTH);
		frame.setSize(300, 360);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public static void main(String[] args) {
		new ColorChange();
	}

}

class SlideEvt implements ChangeListener {
	ColorChange change;
	
	public SlideEvt(ColorChange change) {
		this.change = change;
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider sl = (JSlider) e.getSource(); 	// 움직이는 슬라이더 알아내기
		String str = sl.getName(); 				// 슬라이더 이름 알아내기
		int val = sl.getValue();				// 슬라이더 값 알아내기
		
		Color color = change.panel.getBackground();	// 현재 적용된 칼라 뽑고
		int red = color.getRed();					// 빨강색 뽑고
		int green = color.getGreen();				// 초록색 뽑고
		int blue = color.getBlue();					// 파랑색 뽑고
		
		// 색 수치 만들어주고
		switch(str) {
		case "red":
			red = val;
			break;
		case "green":
			green = val;
			break;
		case "blue":
			blue = val;
			break;
		}
		
		// 색 만들어서 적용하고
		change.panel.setBackground(new Color(red, green, blue));
	}
}
