package com.hc.trueword;

import java.util.Scanner;

import com.hc.impl.HXGroup;
import com.hc.impl.LzGroup;
import com.hc.impl.PeterGroup;
import com.hc.vicky.VickyGroup;

public class Test {

	public static void main(String[] args) {

		
		TrueWord peter = new PeterGroup();
		TrueWord lz = new LzGroup();
		TrueWord hz = new HXGroup();
		TrueWord vicky = new VickyGroup();
		Scanner scanner = new Scanner(System.in);

//
//		String name = word.getName();
//		String ret = word.getTrueWord(name);
//		System.out.println(ret);
		int i = 0;
		while(true) {
			i ++;
			int random = (int)(Math.random()*4) + 1;
			System.out.println(random);
			String name = null;
			String word = null;

			switch (random) {
			case 1:
			case 2:
				name = lz.getName();
				System.out.print("同学名字： " + name);
				scanner.next();
				word = lz.getTrueWord(name);
				break;
			case 3:
				name = hz.getName();
				System.out.print("同学名字： " + name);
				scanner.next();
				word = hz.getTrueWord(name);
				break;
			case 4:
				name = vicky.getName();
				System.out.print("同学名字： " + name);
				scanner.next();
				word = vicky.getTrueWord(name);
				break;
			default:
				break;
			}
			System.out.println("真心话： " + word);
			
			if ( i > 20) { break; }
		}
	}
}
