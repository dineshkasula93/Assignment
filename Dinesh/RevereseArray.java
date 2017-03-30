package com.Assignment8.Dinesh;

import java.util.ArrayList;
import java.util.Collections;

public class RevereseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
		ArrayList<Integer> MyList = new ArrayList<Integer>();
		MyList.add(new Integer("12"));
		MyList.add(new Integer("21"));
		MyList.add(new Integer("1"));
		MyList.add(new Integer("2"));
		MyList.add(new Integer("122"));
		MyList.add(new Integer("10"));
		MyList.add(new Integer("0"));
		System.out.println("Before Reverse Order, ArrayList Contains : " + MyList);
		Collections.reverse(MyList);
		System.out.println("After Reverse Order, ArrayList Contains : " + MyList);

	}



}
