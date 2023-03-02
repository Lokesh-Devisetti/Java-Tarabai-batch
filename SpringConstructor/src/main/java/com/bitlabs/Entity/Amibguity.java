package com.bitlabs.Entity;

public class Amibguity {
	private int a;
	private int b;
	public Amibguity(String a,String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("This is string constructor");
	}
	public Amibguity(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("This is integer constructor");
	}
	
	@Override
	public String toString() {
		return "Ambiguity [a=" + a + ", b=" + b + "]";
	}

	public void show() {
		System.out.println("The sum is "+(a+b));
	}
}
