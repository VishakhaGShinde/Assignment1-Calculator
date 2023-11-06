package com.assignment.dto;

import java.util.List;

public class MinMaxReq {

	List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "MinMaxReq [numbers=" + numbers + "]";
	}
	
}
