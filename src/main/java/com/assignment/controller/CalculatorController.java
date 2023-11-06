package com.assignment.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.dto.CalResponse;
import com.assignment.dto.MinMaxReq;
import com.assignment.dto.MinMaxRes;
import com.assignment.service.CalService;

@RestController
@RequestMapping("calculatorapi/v1")
public class CalculatorController {

	@Autowired
	private CalService calService;

	@GetMapping("/addition")
	public CalResponse getAddition(@RequestParam(name = "number1") Integer number1, @RequestParam(name = "number2") Integer number2) {
		Integer answer = calService.addition(number1, number2);
		String detail = number1 + " + " + number2 + " = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@GetMapping("/subtraction")
	public CalResponse getSubtraction(@RequestParam(name = "number1") Integer number1, @RequestParam(name = "number2") Integer number2) {
		Integer answer = calService.subtraction(number1, number2);
		String detail = number1 + " - " + number2 + " = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@GetMapping("/multiplication")
	public CalResponse getMultiplication(@RequestParam(name = "number1") Integer number1, @RequestParam(name = "number2") Integer number2) {
		Integer answer = calService.multiplication(number1, number2);
		String detail = number1 + " * " + number2 + " = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@GetMapping("/division")
	public CalResponse getDivision(@RequestParam(name = "number1") Integer number1, @RequestParam(name = "number2") Integer number2) {
		double answer = calService.division(number1, number2);
		String detail = number1 + " / " + number2 + " = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@GetMapping("/square/{number1}")
	public CalResponse getSquare(@PathVariable Integer number1) {
		double answer = calService.square(number1);
		String detail = "square of " + number1 + " = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@GetMapping("/squareroot/{number1}")
	public CalResponse getSquareRoot(@PathVariable Integer number1) {
		double answer = calService.squareRoot(number1);
		String detail = "squareroot of " + number1 + " = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@GetMapping("/factorial/{number1}")
	public CalResponse getFactorial(@PathVariable Integer number1) {
		double answer = calService.factorial(number1);
		String detail = number1 + "! = " + answer;
		return new CalResponse(answer, detail);
	}
	
	@PostMapping("/min-max")
	public MinMaxRes getMinMax(@RequestBody MinMaxReq request) {
		Map<String, Integer> responseMap = calService.minMax(request.getNumbers());
		MinMaxRes response = new MinMaxRes();
		response.setMin(responseMap.get("min"));
		response.setMax(responseMap.get("max"));
		return response;
	}

}
