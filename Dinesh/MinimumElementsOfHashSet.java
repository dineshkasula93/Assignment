package com.Assignment8.Dinesh;

import java.util.Collections;
import java.util.HashSet;

public class MinimumElementsOfHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Long> MySet = new HashSet<Long>();
		MySet.add(new Long("12"));
		MySet.add(new Long("21"));
		MySet.add(new Long("1"));
		MySet.add(new Long("2"));
		MySet.add(new Long("122"));
		MySet.add(new Long("10"));
		MySet.add(new Long("0"));
		Object ob = Collections.min(MySet);
		System.out.println("min. element:" + ob);
			}


}
