package com.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<Integer>();//Array List
		li.add(11);
		li.add(15);
		li.add(17);
		li.add(18);
		System.out.println(li);
		
		int size=li.size();
		System.out.println(size);
		
		Integer get=li.get(0);
		System.out.println(get);
		
		Integer set=li.set(0, 800);
		System.out.println(set);
		System.out.println(li);
		
		Integer remove=li.remove(2);
		System.out.println(remove);
		
		
		List<Integer>li1=new LinkedList<Integer>();//LinkedList
		li1.add(111);
		li1.add(152);
		li1.add(173);
		li1.add(184);
		System.out.println(li1);
		
		List<Integer>li2=new Vector<Integer>();//LinkedList
		li2.add(1110);
		li2.add(1520);
		li2.add(1730);
		li2.add(1840);
		System.out.println(li2);
	}

}
