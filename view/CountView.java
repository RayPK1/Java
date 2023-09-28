package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CountListener;
import model.CountModel;

public class CountView extends JFrame{
	
	private CountModel ctm;
	private JButton jb_up;
	private JButton jb_down;
	private JButton jb_reset;
	private JLabel jl_value;
	
	
	public CountView() {
		this.ctm = new CountModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		
		this.setSize(200, 200);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new CountListener(this);
		
		jb_up = new JButton("Up");
		jb_up.addActionListener(al);
		jb_down = new JButton("Down");
		jb_down.addActionListener(al);
		jb_reset = new JButton("Reset");
		jb_reset.addActionListener(al);
		jl_value = new JLabel(this.ctm.getValue()+"", JLabel.CENTER);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jb_up, BorderLayout.WEST);
		jPanel.add(jb_down, BorderLayout.EAST);
		jPanel.add(jl_value, BorderLayout.CENTER);
		jPanel.add(jb_reset, BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		
	}
	public void increment() {
		this.ctm.increment();
		this.jl_value.setText(this.ctm.getValue()+"");
	}
	
	public void decrement() {
		this.ctm.decrement();
		this.jl_value.setText(this.ctm.getValue()+"");
	}
	public void reset() {
		this.ctm.reset();
		this.jl_value.setText(this.ctm.getValue()+"");
	}
}
