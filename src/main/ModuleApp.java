package main;

import lib.Module;
public class ModuleApp {

	public static void main(String[] args) {
		
		Module ctec1 = new Module();
		Module ctec2 = new Module("CTEC 212", "Computer Programming", 40, 60);
		Module ctec3 = new Module("CTEC 212", "Computer Programming", 40, 60);
		System.out.println(ctec2);
		System.out.println(ctec2.equals(ctec3));
		System.out.println(ctec1.getCode());

	}

}
