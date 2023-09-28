package model;

public class CountModel {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public CountModel() {
		this.value=0;
	}
	
	public void increment () {
		this.value++ ;
	}
	
	public void decrement () {
		this.value-- ;
	}
	
	public void reset () {
		this.value=0;
	}
}
