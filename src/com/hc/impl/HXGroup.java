package com.hc.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.hc.trueword.TrueWord;

public class HXGroup implements TrueWord{
	
	private Map<String,String> personMap=new HashMap<String,String>();
	
	public HXGroup() {
		personMap.put("小白", "比小黑更黑的小白");
		personMap.put("小红", "比小黄更黄的小红");
		personMap.put("小黑", "比小白更白的小黑");
		personMap.put("小黄", "比小蓝更蓝的小黄");
		personMap.put("小蓝", "比小红更红的小蓝");
	}

	@Override
	public String getName() {
		String[] array = personMap.keySet().toArray(new String [0]);
		Random random = new Random();
		String name = array[random.nextInt(array.length)];
		return name;
	}

	@Override
	public String getTrueWord(String name) {
		String trueWord = personMap.get(name);
		return trueWord;
	}

}
