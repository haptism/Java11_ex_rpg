package com.rjm.pc;

import java.util.ArrayList;

import com.rjm.weapon.Stick;
import com.rjm.weapon.Sword;

public class RpgMain {

	public static void main(String[] args) {
		Worrier w = new Worrier();
		Magition m = new Magition();
		Sword s = new Sword();

		s.setName("단검");
		s.setDamage(10);

		Stick st = new Stick();
		st.setName("나무지팡이");

		w.setAttack(s);
		w.getAttack().attack();

//		w.getWeapon().attack();
//		w.setWeapon(st);

//		System.out.println(w.getSword().getName());

//		ArrayList<Hero> ar = new ArrayList<Hero>();
//		ar.add(w);
//		ar.add(m);

	}

}
