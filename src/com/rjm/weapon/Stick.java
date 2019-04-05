package com.rjm.weapon;

public class Stick extends Weapon {

	private int power;

	@Override
	public void attack() {
		this.spell();

	}

	public void spell() {
		System.out.println("주문을 외워서 공격... ");
	}
}
