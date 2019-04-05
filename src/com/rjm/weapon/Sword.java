package com.rjm.weapon;

public class Sword extends Weapon {

	private int damage;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public void attack() {
		this.slash();

	}

	public void slash() {
		System.out.println("칼로 베기 휙휙~");

	}

}
