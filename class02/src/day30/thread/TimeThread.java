package day30.thread;

import day30.*;
import java.util.*;	// Date
import java.text.*; // SimpleDateFormat
public class TimeThread extends Thread {
	Test03 main;
	Date date;
	public boolean isStart = true;
	
	public TimeThread(Test03 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		while(isStart) {
			date = new Date();
			SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
			String stime = form.format(date);
			
			// 라벨에 출력하고
			main.timelbl.setText(stime);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
