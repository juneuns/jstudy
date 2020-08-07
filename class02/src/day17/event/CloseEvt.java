package day17.event;

import java.awt.*;
import java.awt.event.*;

import day17.*;

public class CloseEvt implements ActionListener {
	ColorPick pick;
	public CloseEvt(ColorPick pick) {
		this.pick = pick;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		pick.setVisible(false);
	}
}
