package com.assignment.dto;

public class MinMaxRes {

	private int min;
	private int max;

	public MinMaxRes() {
		super();
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "MinMaxRes [min=" + min + ", max=" + max + "]";
	}

}
