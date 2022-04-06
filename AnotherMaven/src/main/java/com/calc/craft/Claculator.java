package com.calc.craft;

public class Claculator {
	
	public int increament(int a) {
		return ++a;
	}
	public int decreament(int a) {
		return --a;
	}
	public double addition(double a, double b) {
		return a+b;
	}
	public double division(double a, double b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Claculator c = new Claculator();
		
		System.out.println(c.increament(3));
		System.out.println(c.decreament(3));
		System.out.println(c.addition(3,3));
		System.out.println(c.division(10,4));


	}
	

}
