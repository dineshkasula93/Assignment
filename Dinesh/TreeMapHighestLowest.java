package com.Assignment8.Dinesh;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapHighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		Set<Integer> se = tm.keySet();
		tm.put(5, "Dinesh");
		tm.put(4, "is");
		tm.put(1, "Hi");
		tm.put(7, "Where are you from");
		tm.put(6, "How are you");
		tm.put(2, "my");
		tm.put(3, "name");
			int x = tm.firstKey();
			int y = tm.lastKey();
		System.out.println(" Highest key in given treemap is:\t" + x+"\tFirst key value: \t"+tm.get(x));
		System.out.println(" lowest key in given treemap is:\t" + y+"\tLast key value: \t"+tm.get(y));
	}
		}


