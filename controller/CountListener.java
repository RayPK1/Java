package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CountView;

public class CountListener implements ActionListener {
	private CountView ctv;

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		System.out.println("Bạn đã nhấn nút "+src);
		
		if(src.equals("Up")) {
			ctv.increment();
		} else if(src.equals("Down")) {
			ctv.decrement();
		} else if(src.equals("Reset")) {
			ctv.reset();
		}
	}

	public CountListener(CountView ctv) {
		this.ctv = ctv;
	}

}
