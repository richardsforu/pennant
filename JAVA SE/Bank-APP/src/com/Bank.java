package com;

public  class Bank implements Customer, Manager, CustomerExecutive, ClwarkOperation {

	public void deposit() {
		System.out.println("---depositing");
	}

	public void withDraw() {
		System.out.println("---withdrawing");
	}

	@Override
	public void openAccount() {
		System.out.println("---opening new account");
	}

	@Override
	public void closeAccount() {
		System.out.println("---closing account");
	}

	public void lockerAccess() {
		System.out.println("---locker access given");
	}

	@Override
	public void clekOpwrations() {
		System.out.println("--- Clearkal Operations added....");
	}

}
