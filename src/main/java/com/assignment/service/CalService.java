package com.assignment.service;

import java.util.List;
import java.util.Map;

public interface CalService {

	public Integer addition(Integer number1, Integer number2);

	public Integer subtraction(Integer number1, Integer number2);

	public Integer multiplication(Integer number1, Integer number2);

	public double division(double number1, double number2);

	public Integer square(Integer number1);

	public Integer squareRoot(Integer number1);
	
	public Integer factorial(Integer number1);

	public Map<String, Integer> minMax(List<Integer> numbers);
}
