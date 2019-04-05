package com.rjm.pc;

import com.rjm.weapon.Attack;
import com.rjm.weapon.Sword;
import com.rjm.weapon.Weapon;

public class Worrier extends Hero {

	private Attack attack;

	public Attack getAttack() {
		return attack;
	}

	public void setAttack(Attack attack) {
		this.attack = attack;
	}
}