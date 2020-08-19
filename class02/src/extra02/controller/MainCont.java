package extra02.controller;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class MainCont {
	HashMap<String, Moyang> map;
	
	public MainCont() {
		map = new HashMap<String, Moyang>();
		
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		Properties prop = new Properties();
		try {
			fin = new FileInputStream("src/extra02/resource/map.properties");
			bin = new BufferedInputStream(fin);
			prop.load(bin);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bin.close();
				fin.close();
			} catch(Exception e) {}
		}
		
		Set set = prop.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String key = (String) itor.next();
			String tmp = prop.getProperty(key);
			Moyang m = null;
			try{
				m = (Moyang) Class.forName(tmp).newInstance();
				map.put(key, m);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		while(true) {
			String key = JOptionPane.showInputDialog("원하는 도형을 입력하세요!\n ex] nemo, semo, won...\n종료는 q 입력");
			JOptionPane.showMessageDialog(null, "입력한 도형 : " + key + "\n" + map.get(key).getArea());
		}
	}
	
	public static void main(String[] args) {
		new MainCont();
	}

}
