package com.Assignment8.Dinesh;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumElementOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> MyList = new ArrayList<Integer>();
		MyList.add(new Integer("12"));
		MyList.add(new Integer("21"));
		MyList.add(new Integer("1"));
		MyList.add(new Integer("2"));
		MyList.add(new Integer("122"));
		MyList.add(new Integer("10"));
		MyList.add(new Integer("0"));
		Object ob = Collections.min(MyList);
		System.out.println("min. element:" + ob);
	}

}
