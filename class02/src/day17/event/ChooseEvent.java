package day17.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day17.*;

public class ChooseEvent implements ActionListener {
	ColorPick pick;
	
	public ChooseEvent(ColorPick pick) {
		this.pick = pick;
	}
	
	public void actionPerformed(ActionEvent e) {
		Color color = JColorChooser.showDialog(pick, "칼라선택", Color.WHITE);
		pick.color = color;
		pick.panel.setBackground(color);
	}
}
