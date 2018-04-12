package com.hc.trueword;

import java.util.Scanner;

import com.hc.impl.PeterGroup;

public class Test {

	public static void main(String[] args) {
		
		TrueWord peter = new PeterGroup();
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
				name = peter.getName();
				System.out.print("同学名字： " + name);
				scanner.next();
				word = peter.getTrueWord(name);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			System.out.println("真心话： " + word);
			
			if ( i > 20) { break; }
		}

	}

}
