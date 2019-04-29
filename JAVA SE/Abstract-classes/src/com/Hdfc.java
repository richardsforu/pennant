package com;

public class Hdfc extends Rbi {

	@Override
	public void deposit() {
		System.out.println("-- HDFC Deposit metghod..");

	}

	@Override
	public void info() {

		System.out.println("---- HDFC bank Info");
	}

	@Override
	public void withDraw() {
		System.out.println("--- withdraw of HDFC");
	}
}
