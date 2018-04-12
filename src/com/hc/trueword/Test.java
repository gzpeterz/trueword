package com.hc.trueword;

import com.hc.vicky.VickyGroup;

public class Test {

	public static void main(String[] args) {
		VickyGroup group = new VickyGroup();
		String name = group.getName();
		System.out.println(group.getTrueWord(name));
		
	}

}
