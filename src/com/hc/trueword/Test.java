package com.hc.trueword;

<<<<<<< HEAD

=======
<<<<<<< HEAD
import com.hc.impl.HXGroup;
=======
>>>>>>> 85f09f553725ec4f67df7e13fe4df386795fa3f2
import java.util.Scanner;

import com.hc.impl.LzGroup;
import com.hc.impl.PeterGroup;
>>>>>>> c7d06300fb0cb72cc16619674252f0a9fc907284

import com.hc.vicky.VickyGroup;

public class Test {

	public static void main(String[] args) {

		
<<<<<<< HEAD
=======
		TrueWord peter = new PeterGroup();
		TrueWord lz = new LzGroup();
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
				name = lz.getName();
				System.out.print("同学名字： " + name);
				scanner.next();
				word = lz.getTrueWord(name);
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
