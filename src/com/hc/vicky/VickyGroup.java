package com.hc.vicky;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;


import com.hc.trueword.TrueWord;

public class VickyGroup implements TrueWord {
	private List<Student_vicky> stus = new ArrayList<Student_vicky>();
	public VickyGroup(){
		Student_vicky stu1 = new Student_vicky("Vicky","I'm a big big girl,in a big big world!");
		Student_vicky stu2 = new Student_vicky("Lily","You are so beautiful!");
		Student_vicky stu3 = new Student_vicky("Lancy","I'm so hangry!");
		Student_vicky stu4 = new Student_vicky("Yase","You are so stupid!");
		Student_vicky stu5 = new Student_vicky("Bill","first blood!");
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		
	}

	@Override
	public String getName() {
		int i = new Random().nextInt(5);
		
		return stus.get(i).getStu_name();
	}

	@Override
	public String getTrueWord(String name) {
		int i = 0;
		for (int j = 0;j < stus.size(); j++) {
			
			if(stus.get(j).getStu_name().equals(name)){
				i = j;
			}
			
		}
		
		return stus.get(i).getStu_word();
	}

}
