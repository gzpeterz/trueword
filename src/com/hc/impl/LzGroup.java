package com.hc.impl;

import java.util.Random;

import com.hc.trueword.TrueWord;

public class LzGroup implements TrueWord {
	
	private String[] names;
	
	public LzGroup(){
		names=new String[5];
		for (int i = 0; i < names.length; i++) {
			names[i]="天地"+(i+1)+"号";
		}
	}
	
	@Override
	public String getName() {
		return names[new Random().nextInt(5)];
	}

	@Override
	public String getTrueWord(String name) {
		int index=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(name)){
				index=i;
				break;
			}
		}
		return "我是第"+(index+1)+"吃货";
	}

}
