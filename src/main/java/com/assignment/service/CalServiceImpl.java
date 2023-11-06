package com.assignment.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CalServiceImpl implements CalService {

	@Override
	public Integer addition(Integer number1, Integer number2) {
		return number1 + number2;
	}

	@Override
	public Integer subtraction(Integer number1, Integer number2) {
		return number1 - number2;
	}

	@Override
	public Integer multiplication(Integer number1, Integer number2) {
		return number1 * number2;
	}

	@Override
	public double division(double number1, double number2) {
		return number1 / number2;
	}

	@Override
	public Integer square(Integer number1) {
		return number1 * number1;
	}

	@Override
	public Integer squareRoot(Integer number1) {
		return (int) Math.sqrt(number1);
	}

	@Override
	public Integer factorial(Integer number1) {
		int answer = 1;
		for (int i = 1; i <= number1; i++)
			answer = answer * i;
		return answer;
	}

	@Override
	public Map<String, Integer> minMax(List<Integer> numbers) {
		Map<String, Integer> responseMap = new HashMap<>();
		responseMap.put("min", Collections.min(numbers));
		responseMap.put("max",Collections.max(numbers));
		return responseMap;
	}

}
