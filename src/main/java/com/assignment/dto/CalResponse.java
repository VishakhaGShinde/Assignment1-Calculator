package com.assignment.dto;

public class CalResponse {

	private double answer;
	private String detail;

	public CalResponse(double answer, String detail) {
		super();
		this.answer = answer;
		this.detail = detail;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "CalResponse [answer=" + answer + ", detail=" + detail + "]";
	}

}
