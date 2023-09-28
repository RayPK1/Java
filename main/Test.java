package main;

import model.CountModel;
import view.CountView;

public class Test {
public static void main(String[] args) {
	CountModel ct = new CountModel();
	ct.increment();
	ct.increment();
	ct.increment();
	System.out.println(ct.getValue());
	ct.decrement();
	System.out.println(ct.getValue());
	ct.reset();
	System.out.println(ct.getValue());
	
	CountView ctv = new CountView();
	}
}
