package com.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		Map<String,Integer>map1=new HashMap<String, Integer>();
		map1.put("laptop", 45000);
		map1.put("mobile", 500);
		map1.put("pendrive", 450);
		map1.put("null", 800);
		map1.put("null", 950);
		map1.put("earphone", 400);
		map1.put("remote", null);
		map1.put("mouse", null);
		
		System.out.println(map1);
		
		Map<Integer,String>map2=new LinkedHashMap<Integer, String>();
		map2.put(99, "tamil");
		map2.put(100, "maths");
		map2.put(35, "science");
		map2.put(45, "social");
		map2.put(null, "computer science");
		map2.put(67, "english");
		map2.put(null, "hindi");
		map2.put(66, "hindi");
		System.out.println(map2);
		
		Map<Integer,String>map3=new TreeMap<Integer, String>();
		map3.put(99, "class a");
		map3.put(100, "class b");
		map3.put(35, "class c");
		map3.put(45, "class d");
		//map3.put(null, "class e");
		map3.put(67, "class f");
		map3.put(87, "class f");
		map3.put(66, null);
		System.out.println(map3);
		
	}

}
