package com.ahamed.mycalculator;

public class Calculator {

	private double num1;
	private double num2;
	private double num3;

	public Calculator() {
		System.out.println("Default Constructor");
	}

	public Calculator(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getAdd() {
		return num2 + num3;
	}

	public void setAdd(double a, double b) {
		this.num2 = a;
		this.num3 = b;
	}

}
